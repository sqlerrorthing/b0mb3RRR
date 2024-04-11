package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.MultipartBody;

public class Masterit extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("bxajaxid", "52a1a0b61b6ebd160ce3180d451c5d1a")
                .addFormDataPart("AJAX_CALL", "Y")
                .addFormDataPart("sessid", "2eccfbc8301f3adeebae4cf806615d90")
                .addFormDataPart("WEB_FORM_ID", "2")
                .addFormDataPart("form_text_5", this.getFaker().name().firstName())
                .addFormDataPart("form_text_6", phone.format("+*(***) ***-**-**"))
                .addFormDataPart("form_email_7", this.getFaker().internet().emailAddress())
                .addFormDataPart("form_textarea_8", "Я хочу оставить заявку на ремонт")
                .addFormDataPart("web_form_submit", "Отправить")
                .build();

        return new Request.Builder()
                .url("https://master-it.spb.ru/servisnyy-tsentr/remont-kompyuterov-i-noutbukov/")
                .post(requestBody)
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Content-Type", "multipart/form-data; boundary=---------------------------345147768620833656833427876660")
                .header("Origin", "https://master-it.spb.ru")
                .header("Connection", "keep-alive")
                .header("Referer", "https://master-it.spb.ru/servisnyy-tsentr/remont-kompyuterov-i-noutbukov/")
                .header("Cookie", "PHPSESSID=dHSxFmkGkFVHuDPPFfaa46Ge7vfjbssj; LIVECHAT_GUEST_HASH=59d50f916f89cf9b97247460db6b92a8; _ga_83GP7K2LG9=GS1.1.1712868506.1.0.1712868506.0.0.0; _ga=GA1.3.574302819.1712868506; _gid=GA1.3.223206502.1712868508; _gat_gtag_UA_73389306_1=1; _ym_uid=1712868508420658532; _ym_d=1712868508; _ym_isad=2; _ym_visorc=w")
                .header("Upgrade-Insecure-Requests", "1")
                .header("Sec-Fetch-Dest", "iframe")
                .header("Sec-Fetch-Mode", "navigate")
                .header("Sec-Fetch-Site", "same-origin")
                .header("Sec-Fetch-User", "?1")
                .header("TE", "trailers");
    }

    @Override
    public String getServiceName() {
        return "Master it";
    }
}
