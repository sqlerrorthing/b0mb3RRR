package me.oneqxz.b0mb3rrr.services;

import me.oneqxz.b0mb3rrr.Config;
import me.oneqxz.b0mb3rrr.data.Phone;
import okhttp3.Request;

public interface IService {
    Request.Builder buildRequest(Phone phone);
    String getServiceName();
    void execute(Config phone);
}
