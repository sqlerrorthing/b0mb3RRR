package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class ICQ extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://u.icq.net/api/v92/rapi/auth/sendCode")
                .post(RequestBody.create(STR."{\"reqId\":\"71494-1712667714\",\"params\":{\"phone\":\"\{phone.phone()}\",\"language\":\"ru-RU\",\"route\":\"sms\",\"devId\":\"ic1rtwz1s1Hj1O0r\",\"application\":\"icq\"}}", MediaType.parse("application/json; charset=utf-8")))
                .header("accept", "*/*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("content-type", "application/json")
                .header("origin", "https://web.icq.com")
                .header("referer", "https://web.icq.com/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "cross-site");
    }

    @Override
    public String getServiceName() {
        return "ICQ";
    }
}
