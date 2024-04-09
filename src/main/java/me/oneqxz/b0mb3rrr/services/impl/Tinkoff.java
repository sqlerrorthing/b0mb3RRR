package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;

public class Tinkoff extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://api.tinkoff.ru/v1/sign_up")
                .post(new FormBody.Builder()
                        .add("phone", STR."+\{phone.phone()}")
                        .build())
                ;
    }

    @Override
    public String getServiceName() {
        return "Tinkoff";
    }
}
