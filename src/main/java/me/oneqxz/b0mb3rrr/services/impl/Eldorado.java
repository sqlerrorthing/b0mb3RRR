package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Eldorado extends Service {

    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://www.eldorado.ru/_ajax/spa/auth/v2/auth_with_login.php")
                .post(RequestBody.create(STR."{\"user_login\":\"\{phone.format("+* *** *** ****")}\",\"reregistration\":\"0\",\"organization\":\"0\"}", MediaType.parse("\"application/json; charset=utf-8\"")))
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("authorization", "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJkYXRhIjp7IlNJRCI6IjY3MHZvcWZpaXV1aHI4aXJ2dWoyNnBxbXFyIn0sImV4cCI6MTcxMjg1NjU4Mn0.VovntMj7O8A9J6FijARaW86c1H6_8Sk4O7MPc8Xnyk6xqT0ieZ9SkYoaKZY8RLJcNQTGvFtt_RhGOtPT0F7D6w")
                .header("content-type", "application/json")
                .header("cookie", "__js_p_=777,3600,0,1,0; __jhash_=465; __jua_=Mozilla%2F5.0%20%28X11%3B%20Linux%20x86_64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F123.0.0.0%20Safari%2F537.36; __hash_=9fe7b7f132cd77e7077600ceb77107a9; __lhash_=fff3fd86a683001c1172e8d77d429382; ab_user=7208424150100; ab_segment=72; iRegionSectionId=11352; GUID=7khgzklxkguoqortqbcrnrqy1evtr4ml1br7; dt=1; grs=15626; ABT_test=B; AUTORIZZ=0; AC=1; lv_user_org=0; el_group_user_org=0; bonus_cobrand_showed=0; PHPSESSID=670voqfiiuuhr8irvuj26pqmqr; BITRIX_SM_SALE_UID=32443099537; BITRIX_SM_SALE_UID_CS=129e64413ff9b2021be202cec184bdd6; _slid=661816fff01f2c03cd08ed3a; _sljsession=8B96EA4C-076A-43A4-B408-67826F4FFB04; _userGUID=0:luvhii49:lcRhv9_J_tR3FnvFeiU_0xkYZJBwGs8B; flocktory-uuid=cc02cb21-43ed-4c17-8560-bc8796201793-4; _slid=661816fff01f2c03cd08ed3a; _slsession=F8129DE4-C462-404A-8B6D-63A2405F87A4; _slfreq=646f4a3ad9b723086101fbec%3A646f4a3ad9b723086101fbf0%3A1712861985; dSesn=d9ad03f9-a40a-1aa5-1688-c655aede960f; _dvs=0:luvhii49:a4C8OyPWP7RJ4_~zLQjclhHRB7K82c92; _gcl_au=1.1.1113637587.1712854785; session=1; _gid=GA1.2.536625571.1712854785; advcake_trackid=2e92e7ef-cbe9-7738-ad21-2643610e7fcd; advcake_session_id=c67af85a-c902-c4ff-90f2-70f134684b53; tmr_lvid=f0b9ca58e1d0f9a908f1214d81beeac2; tmr_lvidTS=1712854785420; _sp_ses.f3a5=*; uxs_uid=e5fa95e0-f824-11ee-aafe-794bc8fd88c9; _ga_Y956M1PRK1=GS1.2.1712854785.1.0.1712854785.60.0.0; _ym_uid=1712854786415105412; _ym_d=1712854786; _ym_isad=2; adrdel=1; adrcid=AIEvUCsYhunM4M-u0wBuWqw; _ym_visorc=w; gdeslon.ru.__arc_domain=gdeslon.ru; gdeslon.ru.user_id=eb977aca-2bcc-4386-ba9f-fc1556588cd0; _slid_server=661816fff01f2c03cd08ed3a; _ga_4P3TZK55KZ=GS1.1.1712854785.1.1.1712854857.0.0.0; _ga=GA1.1.1914367307.1712854785; advcake_track_url=%3D20240408TOpQHvrsp09s6azxnTyIe5rWt6QWgPhDARp8apRQkd%2FfDHGndJvrsXwB8VQNoEwuWRqk6AiYENVjmLCK2Vl4UmUKazGWXWPeiVPEseudVoIQT8svCd2V%2BtrQ0OY79EIBapYrOcUPxC%2Fu7Rf%2B2x2vGaK%2BUUhlnrGnX4HOOyE2q7u3gE%2FTCNq2tU8P9EWLPxKZ45C0THYXLw7ixu2ld4mf4qOo833o%2Fmnf3boM0qY9HqLNMh5SpQNKI0UTRceRjY769rD3tF3OeLJ2CiH6W7Ai3hVdgOkXOBVqHz4eMn8bXRh4M83y2L43Rw%2FiRI1wY9a7G3PiXOcPGhmy4Kjd03unFLyPthozRi7xoyQcoHBQa67vDBJcLwGU7zl781iqeAS1w8Bei3mmVVU0NVI3T0cFgC60qQk0z6idn%2FgoMt58cGgcBEc4N%2FCbI0U1cU2%2FzStVZooyCenNd2YBEjvDzi2%2B84v11mhp4Imia8tx%2B5BrHkThSBvWM5YPhrm7gmT%2BkHUqe7I2b%2FTxuJ%2BEPnoBHkzzcRWX%2FvrjiBRLZkHh8z2zZxXPhm5KJo88ebmgfCD3GTr%2BaF9M0lWTk%2FBhX11gCCrCZbJOT6oDRoCvJkBfsJZTl74yZVNqaZcR20%2BD7oqIqE7aOKZS3fwq4l8rcgaynOuq7rjppUZeREvK3bFNQ16YcDOIbbFg8TbZhCA%3D; tmr_detect=0%7C1712854859679; cookAllow=1; gsscgib-w-eldorado=K/qNuIS8RR/ZBfXjOaYRrihuCCSILQ9I+zCwVr1+gH0rED9NlTy6An1sLwbv9UXSpIz7m5Myzxz90qJS/sf/TljUxPs5lc4veoEf68epBWyMMhzFwlkJ73yh4oOzp0YqIN/5PR/iP1X/d2v+GubaNgs6i9OBvOtthsSUC4Qus7OOdOjONJSmD+2RRjFk3rjNwC9yHkXqYeFjYayeQ8IXc3+JpWf12gNipiKRc0LPK3n+dENsOn7FExcQEcsEMw==; cfidsgib-w-eldorado=S7C8l3JTxmrTES2XA5N3jvuaYTQUvyv2E68mwbEiQWQ1Ue/w8mrmOckbgSQAh6oPcQeubLIYkYXq9PsghiaCNGzHRv/W8DHHsM5zLRL3JuO+4UYBYjwORy7F5aYYIJen0MFg5lY57dUrMph78269ySrHCoKxHGRQ6HnK; gsscgib-w-eldorado=K/qNuIS8RR/ZBfXjOaYRrihuCCSILQ9I+zCwVr1+gH0rED9NlTy6An1sLwbv9UXSpIz7m5Myzxz90qJS/sf/TljUxPs5lc4veoEf68epBWyMMhzFwlkJ73yh4oOzp0YqIN/5PR/iP1X/d2v+GubaNgs6i9OBvOtthsSUC4Qus7OOdOjONJSmD+2RRjFk3rjNwC9yHkXqYeFjYayeQ8IXc3+JpWf12gNipiKRc0LPK3n+dENsOn7FExcQEcsEMw==; gsscgib-w-eldorado=K/qNuIS8RR/ZBfXjOaYRrihuCCSILQ9I+zCwVr1+gH0rED9NlTy6An1sLwbv9UXSpIz7m5Myzxz90qJS/sf/TljUxPs5lc4veoEf68epBWyMMhzFwlkJ73yh4oOzp0YqIN/5PR/iP1X/d2v+GubaNgs6i9OBvOtthsSUC4Qus7OOdOjONJSmD+2RRjFk3rjNwC9yHkXqYeFjYayeQ8IXc3+JpWf12gNipiKRc0LPK3n+dENsOn7FExcQEcsEMw==; _sp_id.f3a5=b8972189-4e8e-472d-9356-2447ff330bed.1712854786.1.1712854890..caa183ab-32a2-4038-9bdc-f7d79c9ae42c..a1070320-a70c-4af3-a8dd-bc833f718915.1712854785511.20; fgsscgib-w-eldorado=AZl84a478c76f18b4905ba8d16fd820182d8f8cb; fgsscgib-w-eldorado=AZl84a478c76f18b4905ba8d16fd820182d8f8cb")
                .header("origin", "https://www.eldorado.ru")
                .header("referer", "https://www.eldorado.ru/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("x-gib-fgsscgib-w-eldorado", "AZl84a478c76f18b4905ba8d16fd820182d8f8cb")
                .header("x-gib-gsscgib-w-eldorado", "K/qNuIS8RR/ZBfXjOaYRrihuCCSILQ9I+zCwVr1+gH0rED9NlTy6An1sLwbv9UXSpIz7m5Myzxz90qJS/sf/TljUxPs5lc4veoEf68epBWyMMhzFwlkJ73yh4oOzp0YqIN/5PR/iP1X/d2v+GubaNgs6i9OBvOtthsSUC4Qus7OOdOjONJSmD+2RRjFk3rjNwC9yHkXqYeFjYayeQ8IXc3+JpWf12gNipiKRc0LPK3n+dENsOn7FExcQEcsEMw==")
                .header("x-source-frontend", "SPA")
                ;
    }

    @Override
    public String getServiceName() {
        return "Eldorado";
    }

}
