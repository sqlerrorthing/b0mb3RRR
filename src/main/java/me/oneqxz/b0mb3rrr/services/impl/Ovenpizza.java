package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Ovenpizza extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("flag", "feedback_sendMf")
                .addFormDataPart("name", this.getFaker().name().firstName())
                .addFormDataPart("tel", phone.format("+* *** *** **-**"))
                .build();

        return new Request.Builder()
                .url("https://ovenpizza.ru/wp-content/themes/twentynineteen/inc/func.php")
                .post(requestBody)
                .header("Accept", "application/json, text/javascript, */*; q=0.01")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("X-Requested-With", "XMLHttpRequest")
                .header("Content-Type", "multipart/form-data; boundary=---------------------------22153047940502900372734945256")
                .header("Origin", "https://ovenpizza.ru")
                .header("Connection", "keep-alive")
                .header("Referer", "https://ovenpizza.ru/")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("TE", "trailers");
    }

    @Override
    public String getServiceName() {
        return "Ovenpizza";
    }
}
