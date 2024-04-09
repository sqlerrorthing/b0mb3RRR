package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.util.UUID;

public class Sayoris extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://sayoris.ru/api/user/register")
                .post(RequestBody.create(STR."{\"phone\":\"\{phone.phone()}\",\"verify_type\":\"call\"}", MediaType.parse("application/json; charset=utf-8")))
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Language", "en-US,en;q=0.9,ru;q=0.8")
                .header("Connection", "keep-alive")
                .header("Content-Type", "application/json;charset=UTF-8")
                .header("Cookie", "i18n_redirected=ru; uuid=5c9d146f-c23c-fe50-5e56-0d005828d77a; city_id=1; __session__id=8084199026615369fc2fdf1.08766584; city_confirmed=true; _ym_uid=1712666272735242916; _ym_d=1712666272; _ym_isad=2; _ym_visorc=w")
                .header("Origin", "https://sayoris.ru")
                .header("Referer", "https://sayoris.ru/novosibirsk/new?route=parse%2Fwhats")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36")
                .header("X-Api-Key", "2065352")
                .header("X-Brand-Id", "1")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sitenew", "1")
                .header("uuid", UUID.randomUUID().toString());
    }

    @Override
    public String getServiceName() {
        return "SayorisRu";
    }
}
