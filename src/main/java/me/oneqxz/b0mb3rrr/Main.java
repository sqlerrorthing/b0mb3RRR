package me.oneqxz.b0mb3rrr;

import lombok.extern.log4j.Log4j2;
import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.ServiceManager;
import me.oneqxz.b0mb3rrr.utils.StringPosition;
import org.apache.commons.cli.*;

import java.io.File;
import java.nio.charset.Charset;

@Log4j2
public class Main {

    private static final String version = "1.0.0";
    private static final String banner = STR."""

              _       __            _      ____  ___   ___   ___\s
             | |__   /  \\   _ __   | |__  |__ / | _ \\ | _ \\ | _ \\
             | '_ \\ | () | | '  \\  | '_ \\  |_ \\ |   / |   / |   /
             |_.__/  \\__/  |_|_|_| |_.__/ |___/ |_|_\\ |_|_\\ |_|_\\
            \{StringPosition.center(STR."By 1qxz, TERETERY. Version \{version}", "                                                     ")}
            """;

    public static void main(String[] args) {
        System.out.println(banner);


        Options options = new Options();
        options.addOption(Option.builder("p")
                .longOpt("phone")
                .hasArg()
                .argName("Номер телефона для спама")
                .required()
                .desc("Номер телефона на который будет приходить спам")
                .build());

        options.addOption(Option.builder("d")
                .longOpt("delay")
                .hasArg()
                .argName("Задежрка (в секундах)")
                .desc("При повторной отправке будет задержка, по умолчанию 15 секунд.")
                .build());

        options.addOption(Option.builder("dbg")
                .longOpt("debug")
                .argName("Режим отладки")
                .desc("Включать, если нужно больше информации.")
                .build());

        options.addOption(Option.builder("c")
                .longOpt("cycles")
                .argName("Циклы")
                .desc("Сколько раз отправить код.")
                .build());

        options.addOption("h", "help", false, "Show help");

        CommandLineParser parser = new DefaultParser();
        Config.ConfigBuilder builder = new Config.ConfigBuilder();

        try {
            CommandLine cmd = parser.parse(options, args);
            String phone = cmd.getOptionValue("p");
            String delay = cmd.getOptionValue("d");
            String cycles = cmd.getOptionValue("c");
            builder.debug(cmd.hasOption("dbg"));

            if(phone == null || phone.isEmpty())
            {
                log.fatal("Номер телефона должен быть указан!");
                System.exit(-1);
                return;
            }

            builder.phone(new Phone(phone));

            if(delay == null || delay.isEmpty())
                builder.delay(15000);
            else
                builder.delay(Integer.parseInt(delay) * 1000L);

            if(cycles == null || cycles.isEmpty())
                builder.cycles(-1);
            else
                builder.cycles(Integer.parseInt(cycles));

            ServiceManager manager = new ServiceManager(builder.build());
            manager.run();
        } catch (ParseException e) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("b0mb3RRR", options);
        }


    }

}
