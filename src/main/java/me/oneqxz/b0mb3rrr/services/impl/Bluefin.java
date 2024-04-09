package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Bluefin extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("phone", phone.phone().replaceFirst("7", ""))
                .build();

        return new Request.Builder()
                .url("https://new-api.bluefin.moscow/v1/auth/sendSms")
                .post(requestBody)
                .header("accept", "*/*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("anonymouse-token", "4a5317746997956c02385de41a57edfd-829acb17-8b1e-45ab-b664-fdd281e3505a")
                .header("city", "msk")
                .header("content-type", "multipart/form-data; boundary=----WebKitFormBoundaryrkN6Sgz8FPcNFiLH")
                .header("lng", "ru")
                .header("origin", "https://bluefin.moscow")
                .header("referer", "https://bluefin.moscow/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-site")
                .header("smstoken", "bbe7750845db49c241382d9d6e4201b7fd6a56654215224a2d0969983ff999dd");
    }

    @Override
    public String getServiceName() {
        return "Bluefin";
    }
}
