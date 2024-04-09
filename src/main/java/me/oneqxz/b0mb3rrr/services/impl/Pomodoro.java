package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;

public class Pomodoro extends Service
{
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://butovo.pizzapomodoro.ru/ajax/user/auth.php")
                .post(new FormBody.Builder()
                        .add("AUTH_ACTION", "SEND_USER_CODE")
                        .add("phone", phone.format("+* (***) ***-**-**"))
                        .build());
    }

    @Override
    public String getServiceName() {
        return "Pomodoro";
    }
}
