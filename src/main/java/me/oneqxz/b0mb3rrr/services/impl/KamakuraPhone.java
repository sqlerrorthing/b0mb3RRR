package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public class KamakuraPhone extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody formBody = new FormBody.Builder()
                .add("bxajaxid", "8fd3ef6456e8a5341b6d21d20644cb34")
                .add("AJAX_CALL", "Y")
                .add("honeypot_8fd3ef6456e8a5341b6d21d20644cb34", "")
                .add("PROPERTY[NAME]", "name")
                .add("PROPERTY[VIEW_NAME]", getFaker().name().firstName())
                .add("PROPERTY[PHONE]", phone.format("+*(***) ***-**-**"))
                .add("PROPERTY[CHECK]", "35")
                .add("iblock_submit", "Отправить")
                .add("sessid", "f1a5413613a36a8d0b73ccd9137b3297")
                .build();

        return new Request.Builder()
                .url("https://kamakura.ru/catalog/pitstsa/")
                .post(formBody)
                .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:124.0) Gecko/20100101 Firefox/124.0")
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Origin", "https://kamakura.ru")
                .header("Connection", "keep-alive")
                .header("Referer", "https://kamakura.ru/catalog/pitstsa/")
                .header("Cookie", "roistat_is_need_listen_requests=0; roistat_is_save_data_in_cookie=1; __ddg1_=hem8aeeJmsr9y2LX0ZxT; PHPSESSID_PROD=MmHBhwuU0ZLlVyNwn30Mv3dL1LVhlrak; BITRIX_SM_SALE_UID=26ace34915b51fb2734a882c3345eb16; BITRIX_CONVERSION_CONTEXT_s1=%7B%22ID%22%3A96%2C%22EXPIRE%22%3A1712948340%2C%22UNIQUE%22%3A%5B%22conversion_visit_day%22%5D%7D; tmr_lvid=4f07c63ea1db271336c0a7f9a8c31bd2; tmr_lvidTS=1712862858031; roistat_visit=1277345; roistat_first_visit=1277345; roistat_visit_cookie_expire=1209600; domain_sid=_K7uC8bEjQ0v9nzgamZ0K%3A1712862859604; roistat_cookies_to_resave=roistat_ab%2Croistat_ab_submit%2Croistat_visit%2Croistat_marker%2Croistat_marker_old%2Croistat_phone%2Croistat_raw_phone%2Croistat_call_tracking%2Croistat_phone_replacement%2Croistat_phone_script_data; roistat_marker=seo_google_; roistat_marker_old=seo_google_; roistat_phone=8%20(351)%20210-91-44; roistat_raw_phone=73512109144; roistat_call_tracking=1; roistat_phone_replacement=null; roistat_phone_script_data=%5B%7B%22phone%22%3A%228%20(351)%20210-91-44%22%2C%22css_selectors%22%3A%5B%5D%2C%22replaceable_numbers%22%3A%5B%227275555%22%5D%2C%22raw_phone%22%3A%2273512109144%22%7D%5D; tmr_detect=0%7C1712862860464; _ga=GA1.2.1875563367.1712862861; _gid=GA1.2.1365550423.1712862861; _gat_UA-56971176-1=1; _ym_uid=1712862861716094132; _ym_d=1712862861; _ga_8BXE44M1M0=GS1.2.1712862862.1.0.1712862862.60.0.0; _ym_isad=2; ___dc=7f687a6f-a112-450a-bf2b-32dbc7e4e2dd; _ym_visorc=w")
                .header("Upgrade-Insecure-Requests", "1")
                .header("Sec-Fetch-Dest", "iframe")
                .header("Sec-Fetch-Mode", "navigate")
                .header("Sec-Fetch-Site", "same-origin")
                .header("Sec-Fetch-User", "?1")
                .header("TE", "trailers");
    }

    @Override
    public String getServiceName() {
        return "KamakuraPhone";
    }
}
