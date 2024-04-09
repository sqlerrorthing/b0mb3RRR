package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;

public class Odnoklassniki extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://ok.ru/dk?cmd=AnonymRegistrationEnterPhone&st.cmd=anonymRegistrationEnterPhone")
                .post(new FormBody.Builder()
                        .add("st.r.phone", STR."+\{phone.phone()}")
                        .build());
    }

    @Override
    public String getServiceName() {
        return "Odnoklassniki";
    }
}
