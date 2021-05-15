package com.github.gabrielpadilh4.swing;

import javax.swing.*;
import java.awt.*;

public class Observer {

    public static void main(String[] args) {

        JFrame window = new JFrame("Observer");

        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(600, 200);
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null);

        JButton button = new JButton("Click");

        window.add(button);

        button.addActionListener(e -> {
            System.out.println("Clicked");
        });

        window.setVisible(true);
    }
}
