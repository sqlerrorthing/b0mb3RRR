package me.oneqxz.b0mb3rrr.services;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import me.oneqxz.b0mb3rrr.Config;

@RequiredArgsConstructor
@Log4j2
public class IServiceWorker implements Runnable{

    @NonNull private IService service;
    @NonNull private Config config;
    private int cycle = 0;

    @Override
    public void run() {
        try {
            while (true) {
                service.execute(config);

                if (config.getCycles() != -1 && cycle >= config.getCycles())
                    break;

                cycle++;

                Thread.sleep(config.getDelay());
            }
        } catch (InterruptedException e) {
            log.error(e);
        }
    }
}
