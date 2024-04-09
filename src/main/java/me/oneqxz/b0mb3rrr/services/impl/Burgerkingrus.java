package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Burgerkingrus extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://burgerkingrus.ru/user/v3/auth/login")
                .post(RequestBody.create(STR."{\"phone\":\"\{phone.phone()}\"}", MediaType.parse("application/json; charset=utf-8")))
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("content-type", "application/json")
                .header("cookie", "Path=/; _ym_uid=1712671039930776061; _ym_d=1712671039; _ym_isad=2; tmr_lvid=6f66a5a2f23b205033714ce948e77b5b; tmr_lvidTS=1712671042609; domain_sid=K7ft0UO-forpYV26U1zlJ%3A1712671043447; amp_f6bc17=IFYfKs1Dcl-vGWJzJt0vBA...1hr1ic7k3.1hr1iccvt.4.0.4; tmr_detect=0%7C1712671045418")
                .header("origin", "https://burgerkingrus.ru")
                .header("referer", "https://burgerkingrus.ru/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin");
    }

    @Override
    public String getServiceName() {
        return "Burgerkingrus";
    }
}
