package me.oneqxz.b0mb3rrr;

import lombok.extern.log4j.Log4j2;
import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.gui.MainGui;
import me.oneqxz.b0mb3rrr.services.ServiceManager;
import me.oneqxz.b0mb3rrr.utils.StringPosition;
import org.apache.commons.cli.*;

import javax.swing.*;
import java.io.File;

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

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainGui();
            }
        });
    }

}
