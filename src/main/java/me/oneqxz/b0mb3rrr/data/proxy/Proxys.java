package me.oneqxz.b0mb3rrr.data.proxy;

import com.google.gson.Gson;
import kotlin.Pair;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Log4j2
public class Proxys {

    private final List<Proxy> proxys = new LinkedList<>();
    private List<Proxy> working_proxy = new LinkedList<>();

    public Proxys(File file)
    {
        try
        {
            for(String line : FileUtils.readLines(file, StandardCharsets.UTF_8))
            {
                try
                {
                    String[] proxy = line.split(":");
                    proxys.add(new Proxy(
                            java.net.Proxy.Type.HTTP,
                            proxy[0],
                            Integer.parseInt(proxy[1]))
                    );
                }
                catch (Exception ignored) {}
            }
        }
        catch (IOException e)
        {
            log.fatal("Не удалось прочитать файл с прокси", e);
        }

        log.info(STR."Добавлено \{this.proxys.size()} прокси");
        this.working_proxy = new ProxyChecker().check(this.proxys);
        log.info(STR."\{this.working_proxy.size()} рабочих прокси");
    }

    public @Nullable Proxy getRandomProxy()
    {
        try
        {
            return this.working_proxy.get(new Random().nextInt(this.working_proxy.size()));
        }
        catch (Exception e)
        {
            return null;
        }
    }


    @Log4j2
    private static class ProxyChecker {
        public List<Proxy> check(List<Proxy> all)
        {
            log.info("Начинаю проверку прокси");
            ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

            for(Proxy proxy : all)
                executorService.submit(() -> checkProxy(proxy));

            executorService.shutdown();
            while (!executorService.isTerminated()) {}

            return all.stream().filter(proxy -> proxy.getStatus() == Proxy.Status.ALIVE).toList();
        }

        private void checkProxy(Proxy proxy) {
            Pair<HttpURLConnection, Long> pair = this.connect(proxy.toJavaProxy());

            if(pair != null) {
                try {
                    proxy.setStatus(Proxy.Status.ALIVE);
                    Response response = getResponse(pair.component1());
                    proxy.setAnonymity(response.anonymity);
                    proxy.setCountry(response.country);
                    proxy.setResponse_time(pair.component2());
                    log.info(STR."Прокси \{proxy} живой, время ответа \{proxy.getResponse_time()}ms");
                } catch (Exception e) {
                    proxy.setStatus(Proxy.Status.DEAD);
                    proxy.setAnonymity(null);
                }
            } else {
                proxy.setStatus(Proxy.Status.DEAD);
                proxy.setAnonymity(null);
            }

            if(proxy.getStatus() == Proxy.Status.DEAD)
                log.warn(STR."Прокси \{proxy} мертвый!");
        }

        private Pair<HttpURLConnection, Long> connect(java.net.Proxy proxy) {
            try {
                HttpURLConnection connection;
                String api_url = "http://api.proxychecker.co/";
                if(proxy == null) {
                    connection = (HttpURLConnection) new URL(api_url).openConnection();
                } else {
                    connection = (HttpURLConnection) new URL(api_url).openConnection(proxy);
                }
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);

                long startTime = System.currentTimeMillis();
                connection.connect();
                long endTime = System.currentTimeMillis();
                return new Pair<>(connection, (endTime - startTime));
            } catch (IOException e) {
                return null;
            }
        }

        public Response getResponse(HttpURLConnection connection) throws IOException {
            BufferedReader r = new BufferedReader(new InputStreamReader(connection.getInputStream(),
                    StandardCharsets.UTF_8));

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
            }
            return new Gson().fromJson(sb.toString(), Response.class);
        }

        public static class Response {
            public String ip;
            public String country;
            public Proxy.ProxyAnonymity anonymity;
        }
    }
}
