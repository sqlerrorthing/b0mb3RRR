package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Sms4b extends Service {

    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("phone", phone.format("+* (***) ***-**-**"))
                .addFormDataPart("email", this.getEmail())
                .addFormDataPart("name", this.getFaker().name().firstName())
                .addFormDataPart("lastName", this.getFaker().name().lastName())
                .addFormDataPart("login", this.getFaker().internet().password())
                .addFormDataPart("password", STR."\{this.getFaker().internet().password()}!0.s")
                .addFormDataPart("code", "")
                .addFormDataPart("timezone", "+8")
                .build();

        return new Request.Builder()
                .url("https://www.sms4b.ru/api/v1/registration/new")
                .post(requestBody)
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("content-type", "multipart/form-data; boundary=----WebKitFormBoundaryIcBM774gSqgAxqJ0")
                .header("cookie", "auth.strategy=cookie; _ym_uid=1712855354552280756; _ym_d=1712855354; tmr_lvid=92e269a757a344132efcfae1e0b7c83b; tmr_lvidTS=1712855354243; _ym_visorc=w; _gid=GA1.2.1934686992.1712855354; _ym_isad=2; domain_sid=FDM29mRJFFLtMqeHwhiTl%3A1712855356041; _ga_YVRHHSS37Z=GS1.1.1712855356.1.0.1712855356.60.0.0; _ga=GA1.1.918541874.1712855354; roistat_visit=434414; roistat_first_visit=434414; roistat_visit_cookie_expire=1209600; roistat_is_need_listen_requests=0; roistat_is_save_data_in_cookie=1; roistat_cookies_to_resave=roistat_ab%2Croistat_ab_submit%2Croistat_visit; ___dc=abbeea29-c6b1-4f52-be2d-6cec4c072a5d; tmr_detect=0%7C1712855358099; PHPSESSID=mvoXlkTaqE0RY7gwxr5M1XfTtkAdNQsf")
                .header("origin", "https://www.sms4b.ru")
                .header("referer", "https://www.sms4b.ru/registration/step-1")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36")
                ;
    }

    @Override
    public String getServiceName() {
        return "Sms4b";
    }

}
