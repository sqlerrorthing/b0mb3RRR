package me.oneqxz.b0mb3rrr.gui;
/*
 * b0mb3RRR
 *
 * @author TERETERY
 * @since 2024.04.17.04.2024
 */

import me.oneqxz.b0mb3rrr.Config;
import me.oneqxz.b0mb3rrr.data.Phone;
import me.oneqxz.b0mb3rrr.services.IServiceWorker;
import me.oneqxz.b0mb3rrr.services.ServiceManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;

public class MainGui {
    private JFrame frame;
    private JCheckBox debugCheckBox;
    private JSlider delaySlider;
    private JSlider repeatSlider;
    private JTextField numberField;
    private static JTextArea consoleArea;

    public MainGui() {
        frame = new JFrame("https://github.com/oneqxz/b0mb3RRR");
        frame.setSize(850, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(5, 2));

        debugCheckBox = new JCheckBox("Режим отладки");

        JLabel delayLabel = new JLabel("Задержка");
        delaySlider = new JSlider(1, 30);
        delaySlider.setMajorTickSpacing(5);
        delaySlider.setMinorTickSpacing(1);
        delaySlider.setPaintTicks(true);
        delaySlider.setPaintLabels(true);

        JLabel repeatLabel = new JLabel("Кол. циклов (0 для беск. цикла)");
        repeatSlider = new JSlider(0, 2500);
        repeatSlider.setMajorTickSpacing(500);
        repeatSlider.setMinorTickSpacing(100);
        repeatSlider.setPaintTicks(true);
        repeatSlider.setPaintLabels(true);

        JLabel numberLabel = new JLabel("Номер телефона (важно, что бы начинался на +7!!!)");
        numberField = new JTextField(10);

        controlPanel.add(debugCheckBox);
        controlPanel.add(new JLabel());
        controlPanel.add(delayLabel);
        controlPanel.add(delaySlider);
        controlPanel.add(repeatLabel);
        controlPanel.add(repeatSlider);
        controlPanel.add(numberLabel);
        controlPanel.add(numberField);

        JButton startButton = new JButton("Включить");
        startButton.setPreferredSize(new Dimension(100, 30)); // Установка размеров кнопки
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start();
            }
        });

        mainPanel.add(controlPanel, BorderLayout.NORTH);

        consoleArea = new JTextArea();
        consoleArea.setEditable(false);
        consoleArea.setRows(15);
        consoleArea.setColumns(20);

        JScrollPane consoleScrollPane = new JScrollPane(consoleArea);


        mainPanel.add(startButton, BorderLayout.CENTER);
        mainPanel.add(consoleScrollPane, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public void start() {
        Config.ConfigBuilder builder = Config.builder();

        String phone = numberField.getText();
        String delay = String.valueOf(delaySlider.getValue());
        String cycles = String.valueOf(repeatSlider.getValue());
        builder.debug(debugCheckBox.isSelected());

        if(phone == null || phone.isEmpty())
        {
            JOptionPane.showMessageDialog(frame, "Номер телефона должен быть указан!");
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

        if (this.repeatSlider.getValue() == 0) {
            IServiceWorker.defaultIsZero = true;
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                ServiceManager manager = new ServiceManager(builder.build());
                manager.run();
            }
        }).start();
    }


    public static void appendToConsole(String text) {
        consoleArea.append(text);
        consoleArea.append("\n");
        consoleArea.setCaretPosition(consoleArea.getDocument().getLength());
    }

}
