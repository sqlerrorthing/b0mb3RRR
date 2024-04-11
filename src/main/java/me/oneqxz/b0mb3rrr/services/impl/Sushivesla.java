package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Sushivesla extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://web.consumer.xn--80adjkr6adm9b.xn--p1ai/not-secure/api/v1/auth/start")
                .post(RequestBody.create(STR."{\"phone\":\"\{phone.format("+* (***) *** ** **")}\"}", MediaType.parse("application/json; charset=utf-8")))
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Language", "ru-RU")
                .header("Connection", "keep-alive")
                .header("Content-Type", "application/json")
                .header("Origin", "https://xn--80adxhks.xn--80adjkr6adm9b.xn--p1ai")
                .header("Referer", "https://xn--80adxhks.xn--80adjkr6adm9b.xn--p1ai/")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-site")
                .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36")
                .header("X-City-Id", "61fbeb200517e16aada7bdb3")
                .header("X-Date", "Thu, 11 Apr 2024 17:35:13 GMT")
                .header("X-Device-Token", "Zw_gzjL1leapWYYQEgy5R")
                .header("X-Device-Type", "WEB")
                .header("X-Version", "01356fc592d26a0fed058c12a6d8cdff")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"");
    }

    @Override
    public String getServiceName() {
        return "Sushivesla";
    }
}
