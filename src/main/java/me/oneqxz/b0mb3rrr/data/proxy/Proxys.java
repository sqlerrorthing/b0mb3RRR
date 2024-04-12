package me.oneqxz.b0mb3rrr.data.proxy;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Log4j2
public class Proxys {

    private final File file;
    private final Proxy[] proxys;

    @SneakyThrows
    public Proxys(File file)
    {
        this.file = file;
        List<Proxy> _proxys = new LinkedList<>();

        for(String line : FileUtils.readLines(file, StandardCharsets.UTF_8))
        {
            String[] proxy = line.split(":");
            _proxys.add(new Proxy.ProxyBuilder()
                    .ip(proxy[0])
                    .port(Integer.parseInt(proxy[1]))
                    .type(java.net.Proxy.Type.HTTP)
                    .build()
            );
        }

        if(_proxys.isEmpty())
        {
            log.fatal("Ни одного прокси небыло добавлено!");
            System.exit(-1);
        }

        this.proxys = _proxys.toArray(Proxy[]::new);
        log.info(STR."Добавлено \{this.proxys.length} прокси");
    }

    public Proxy getRandomProxy()
    {
        return this.proxys[new Random().nextInt(this.proxys.length)];
    }
}
