package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.FormBody;

public class Vkontakte extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody formBody = new FormBody.Builder()
                .add("device_id", "A40D9tBi4KS5z2JkJgmpd")
                .add("external_device_id", "")
                .add("service_group", "")
                .add("lang", "ru")
                .add("phone", phone.format("+* *** ***-**-**"))
                .add("sid", "")
                .add("allow_callreset", "1")
                .add("supported_ways", "call_in")
                .add("super_app_token", "")
                .add("access_token", "")
                .build();

        return new Request.Builder()
                .url("https://api.vk.com/method/auth.validatePhone?v=5.207&client_id=7913379")
                .post(formBody)
                .header("Accept", "*/*")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Referer", "https://id.vk.com/")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Origin", "https://id.vk.com")
                .header("Connection", "keep-alive")
                .header("Cookie", "remixlang=0; remixstlid=9079849214280121268_5666QsRNIDi5xGNaeutsJqejItb0vBnMxuN5XjZErxo; remixlgck=ac27cf685663546051; remixua=190%7C-1%7C320%7C526843959; remixstid=197737754_LK8EPL7C8LPZtREKCSfEZG2hnF4OrDBimQj0xHzWxBT; remixscreen_width=1920; remixscreen_height=1080; remixscreen_dpr=1; remixscreen_depth=24; remixscreen_orient=1; remixscreen_winzoom=1; remixdark_color_scheme=1; remixcolor_scheme_mode=auto; remixsts=%7B%22data%22%3A%5B%5B1712866764%2C%22web_dark_theme%22%2C%22auto%22%2C%22vkcom_dark%22%2C1%5D%2C%5B1712866764%2C%22browser_features%22%2C%22current_scheme%3A2/is_auto_schemes_supported%3A1/is_schemes_supported%3A1%22%5D%2C%5B1712866764%2C%22counters_check%22%2C1%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22cookie_manager%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22intersection_observer%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22resize_observer%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22canvas_to_blob%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22element_functions%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22other_functions%22%2C%22web%22%5D%2C%5B1712866764%2C%22users_wasm_support%22%2C0%2C%22web2%22%2C%22true%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22common_web%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22index%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22language%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22join%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22ui_components%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22site_layout%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22raven_logger%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22css_types%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22vk_sans_observer%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22unauthorized%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22jobs_devtools_notification%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22page_layout%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22ui_common%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22likes%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22grip%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22performance_observers%22%2C%22web%22%5D%2C%5B1712866764%2C%22entries_requests%22%2C1%2C%22ads_light%22%2C%22web%22%5D%2C%5B1712866766%2C%22unique_adblock_users%22%2C0%2C%22web2%22%2C%22false%22%2Cnull%2Cnull%5D%5D%2C%22uniqueId%22%3A657276706.4796441%7D; remixdt=0; remixnp=0; remixgp=d41affe7bb19d991562c7720be16704f; tmr_lvid=3a591783de270080f71b1b18d7c2308e; tmr_lvidTS=1712866765336; remixuas=YzJjODU3ODZhOTg5ZjliNjVjYjU4OWY5")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-site")
                .header("TE", "trailers");
    }

    @Override
    public String getServiceName() {
        return "Vkontakte";
    }
}
