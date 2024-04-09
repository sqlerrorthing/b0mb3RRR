package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class IvI extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://api.ivi.ru/pivi/rabbi.RegistrationService/ByPhone")
//                .post(RequestBody.create(STR."{\"device\":\"Linux 64 Chrome v.123.0.0.0 57aea\",\"phone\":\"+\{phone.format("+*(***)*******")}\"}", MediaType.parse("application/json; charset=utf-8")))
                .post(new FormBody.Builder()
                        .add("phone", phone.format("+*(***)*******"))
                        .add("device", "Linux 64 Chrome v.123.0.0.0 57aea")
                        .build())
                .header("Accept", "application/json")
                .header("Accept-Language", "en-US,en;q=0.9,ru;q=0.8")
                .header("Connection", "keep-alive")
                .header("Content-Type", "application/json")
                .header("Origin", "https://www.ivi.ru")
                .header("Referer", "https://www.ivi.ru/")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-site")
                .header("X-App-Version", "870")
                .header("X-Session", "57aea4c26581072287626168_1728478075-054AQtCjUsuIlp53ux75m4w")
                .header("X-Session-Data", "eyJ1aWQiOjY1ODEwNzIyODc2MjYxNjh9.ZhU5BA.DQmF4jUbM3epwG57z5TZifYq8bU")
                .header("X-Sign", "29863f0db18523142e4b59cea74289adbe5cef35c4ff9d4a44a651b77757929d")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"");
    }

    @Override
    public String getServiceName() {
        return "IvI";
    }
}
