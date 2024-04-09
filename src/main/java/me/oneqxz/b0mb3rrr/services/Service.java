package me.oneqxz.b0mb3rrr.services;

import com.github.javafaker.Faker;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import me.oneqxz.b0mb3rrr.Config;
import me.oneqxz.b0mb3rrr.data.Phone;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Locale;

import static java.lang.StringTemplate.STR;

@Getter(AccessLevel.PROTECTED)
@Log4j2
public abstract class Service implements IService {

    private final Faker faker = new Faker(Locale.of("RU"));
    private final OkHttpClient client = new OkHttpClient();

    public String getName()
    {
        return faker.name().fullName();
    }

    public String getEmail()
    {
        return faker.internet().emailAddress();
    }

    public void execute(Config config)
    {
        Request request = this.buildRequest(config.getPhone())
                .addHeader("User-Agent", faker.internet().userAgentAny())
                .addHeader("X-Requested-With", "XMLHttpRequest")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful())
                log.error(STR."Неверный код состояния для сервиса \{this.getServiceName()} \{response.code()}\{config.isDebug() ? STR.": \{response.body().string()}" : ""}");

            else
                log.info(STR."Сервис \{this.getServiceName()} отправил код успешно");
        } catch (IOException e) {
            log.fatal(new RuntimeException(e));
        }
    }
}
