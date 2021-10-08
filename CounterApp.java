package Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class CounterApp extends JFrame {
    private int value;

    public CounterApp(int initialValue){
        setBounds(500, 500, 300, 120);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);


        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        JButton restartGame = new JButton("Restart");
        restartGame.setFont(font);
        add(restartGame, BorderLayout.SOUTH);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }

        });

        restartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = initialValue;
                counterValueView.setText(String.valueOf(value));
            }
        });


        setVisible(true);

    }




}
