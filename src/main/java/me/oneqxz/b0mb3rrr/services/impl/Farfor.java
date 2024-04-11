package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Farfor extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://api.farfor.ru/v3/842b03f5-7db9-4850-9cb1-407f894abf5e/chel/auth/request_code/")
                .post(RequestBody.create(STR."{\"phone\":\"\{phone.phone()}\",\"ui_element\":\"login\"}", MediaType.parse("application/json; charset=utf-8")))
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Content-Type", "application/json")
                .header("Referer", "https://chel.farfor.ru/")
                .header("Origin", "https://chel.farfor.ru")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-site")
                .header("Connection", "keep-alive")
                ;
    }

    @Override
    public String getServiceName() {
        return "Farfor";
    }
}
