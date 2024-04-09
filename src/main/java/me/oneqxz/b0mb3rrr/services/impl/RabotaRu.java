package me.oneqxz.b0mb3rrr.services.impl;

import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.Service;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class RabotaRu extends Service {
    @Override
    public Request.Builder buildRequest(Phone phone) {
        String data = STR."{\"request\":{\"login\":\"+\{phone.phone()}\"},\"request_id\":85478670,\"application_id\":13,\"rabota_ru_id\":\"66151b01967725001791302847606138\",\"user_tags\":[{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"sandr_vacancies_skills_v1_control1\"},{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"web-vacancy-question-target\"},{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"web_similar_vacancy_ml_target\"},{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"web_upload_file_resume_target\"},{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"web_register_email_confirm_target\"},{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"search_exclude_reloc2_target\"},{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"web_vacancy_smart_description_target\"},{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"sandr_web_search_by_vector_target\"},{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"ranking_target\"},{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"web_ao_new_search_target\"},{\"id\":0,\"add_date\":\"2024-04-09\",\"name\":\"recs_by_views_control1\"}]}";

        return new Request.Builder()
                .url("https://moscow.rabota.ru/api-web/v6/login/try.json")
                .post(RequestBody.create(data, MediaType.parse("application/json; charset=utf-8")))
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "en-US,en;q=0.9,ru;q=0.8")
                .header("content-type", "application/json")
                .header("cookie", "qrator_ssid=1712659197.001.vuUgrKhWKxNuM6ru-3unl9mm768jb0pitjkh8eqa2urhpigva; tmr_lvid=bd99663b0cfe5e872860b237d297a4e1; tmr_lvidTS=1712659198510; adtech_uid=6875a9ff-bab2-4f3b-a283-c0275b3e5adb%3Arabota.ru; top100_id=t1.7512535.1981672593.1712659198883; t3_sid_403882=s1.1249293561.1712659199043.1712659199047.1.2; _ym_uid=17126591999948729; _ym_d=1712659199; _ym_isad=2; _ym_visorc=w; frontend:region=irkutsk%3A121; frontend:cache-features=%5B%7B%22name%22%3A%22use_web_google_recaptcha%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22web_importfileresume_target2%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22hrx_survey_before_unpublish_vacancy%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22web_app_banner%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22web_auth_banner%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22job_resume_edit_spa%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22web_serp_limit_increase%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22web_rename_ar_to_ca%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22web_sberid_cloud_migrate%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22web_increase_search_result_on_first_page%22%2C%22value%22%3A30%7D%5D; frontend:cache-settings=1; frontend:rabota-id:v1=66151b01967725001791302847606138; frontend:location:v4=null; user_tags=%5B%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22sandr_vacancies_skills_v1_control1%22%7D%2C%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22web-vacancy-question-target%22%7D%2C%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22web_similar_vacancy_ml_target%22%7D%2C%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22web_upload_file_resume_target%22%7D%2C%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22web_register_email_confirm_target%22%7D%2C%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22search_exclude_reloc2_target%22%7D%2C%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22web_vacancy_smart_description_target%22%7D%2C%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22sandr_web_search_by_vector_target%22%7D%2C%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22ranking_target%22%7D%2C%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22web_ao_new_search_target%22%7D%2C%7B%22id%22%3A0%2C%22add_date%22%3A%222024-04-09%22%2C%22name%22%3A%22recs_by_views_control1%22%7D%5D; t3_sid_7512535=s1.811204768.1712659198885.1712659203626.1.7; domain_sid=O13DJlf-4W2YOSoFvabgo%3A1712659204301; _sa=SA1.326b8a37-355d-4242-96a1-6c9a3fed0320.1712659204; frontend:user-session=1eef65d8-68d1-6b50-4034-aeab5befce02; last_visit=1712630404900%3A%3A1712659204900; _ymab_param=CNQ-pVX0pWmIBBMVdMG7eQrZ1QeT2Zkn7JOlt6I9egz6M1bJHyhKdM7bfaveuAWNLEcraWxS-l4gFDfPEGmtnvf4xnA; tmr_detect=0%7C1712659206952; mobile-app-popup-next-show-timer=1; mobile-app-popup-close-count=1; t3_sid_2000130=s1.339750400.1712659204898.1712659209901.1.3; frontend:auth-motivation-popup-is-showed=true")
                .header("origin", "https://moscow.rabota.ru")
                .header("referer", "https://moscow.rabota.ru/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Linux\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin");
    }

    @Override
    public String getServiceName() {
        return "RabotaRu";
    }
}
