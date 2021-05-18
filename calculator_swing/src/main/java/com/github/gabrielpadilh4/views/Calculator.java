package com.github.gabrielpadilh4.views;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() {

        organizerLayout();

        setSize(232, 322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizerLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();

        Keyboard keyboard = new Keyboard();

        display.setPreferredSize(new Dimension(232, 60));

        add(display, BorderLayout.NORTH);
        add(keyboard, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
