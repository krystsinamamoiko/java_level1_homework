package lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCounterApp extends JFrame {
    private int value;

    public MyCounterApp(int initValue) {
        setTitle("Counter application");
        setBounds(200, 200, 300, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font(Font.SERIF, Font.BOLD, 30);

        JLabel counterLabel = new JLabel();
        counterLabel.setFont(font);
        counterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        counterLabel.setText(String.valueOf(initValue));
        add(counterLabel, BorderLayout.CENTER);

        JButton decreaseButton = new JButton("<");
        decreaseButton.setFont(font);
        add(decreaseButton, BorderLayout.WEST);

        JButton increaseButton = new JButton(">");
        increaseButton.setFont(font);
        add(increaseButton, BorderLayout.EAST);

        value = initValue;
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterLabel.setText(String.valueOf(value));
            }
        });

        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterLabel.setText(String.valueOf(value));
            }
        });

        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyCounterApp myCounterApp = new MyCounterApp(0);
    }
}
