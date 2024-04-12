package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Nyrest extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        String password = this.getFaker().internet().password();

        RequestBody formBody = new FormBody.Builder()
                .add("_csrf-frontend", "ZPKUi76593naegeyvs2LC016cZIFpot03E0ly9HxcYSnPfrBSGcxAo9IDpXhuSV5UcvZPfavA8M-yVpHMEDy4Q==")
                .add("SignupForm[phone]", phone.format("+*(***)***-**-**"))
                .add("SignupForm[password]", password)
                .add("SignupForm[name]", this.getFaker().name().firstName())
                .add("SignupForm[password_confirm]", password)
                .add("SignupForm[agree]", "0")
                .add("SignupForm[agree]", "1")
                .build();

        return new Request.Builder()
                .url("https://nysp.su/site/signup")
                .post(formBody)
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Origin", "https://nysp.su")
                .header("Connection", "keep-alive")
                .header("Referer", "https://nysp.su/page/o-nas")
                .header("Upgrade-Insecure-Requests", "1")
                .header("Sec-Fetch-Dest", "document")
                .header("Sec-Fetch-Mode", "navigate")
                .header("Sec-Fetch-Site", "same-origin")
                .header("Sec-Fetch-User", "?1")
                .header("TE", "trailers");
    }

    @Override
    public String getServiceName() {
        return "Nyrest";
    }
}
