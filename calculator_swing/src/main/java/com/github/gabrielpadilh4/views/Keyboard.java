package com.github.gabrielpadilh4.views;

import javax.swing.*;
import java.awt.*;

public class Keyboard extends JPanel {

    private final Color DARK_GRAY = new Color(68, 68, 68);
    private final Color GRAY = new Color(97, 100, 99);
    private final Color ORANGE = new Color(242, 163, 60);

    public Keyboard() {

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        setLayout(layout);

        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;

        c.gridwidth = 3;
        addButton("AC", DARK_GRAY, c, 0, 0);
        c.gridwidth = 1;
        addButton("%", DARK_GRAY, c, 2, 0);
        addButton("/", ORANGE, c, 3, 0);

        addButton("7", GRAY, c, 0, 1);
        addButton("8", GRAY, c, 1, 1);
        addButton("9", GRAY, c, 2, 1);
        addButton("*", ORANGE, c, 3, 1);

        addButton("4", DARK_GRAY, c, 0, 2);
        addButton("5", DARK_GRAY, c, 1, 2);
        addButton("6", DARK_GRAY, c, 2, 2);
        addButton("-", ORANGE, c, 3, 2);

        addButton("1", GRAY, c, 0, 3);
        addButton("2", GRAY, c, 1, 3);
        addButton("3", GRAY, c, 2, 3);
        addButton("+", ORANGE, c, 3, 3);

        c.gridwidth = 2;
        addButton("0", DARK_GRAY, c, 0, 4);
        c.gridwidth = 1;
        addButton(".", DARK_GRAY, c, 2, 4);
        addButton("=", ORANGE, c, 3, 4);

    }

    public void addButton(String text, Color color, GridBagConstraints c, int x, int y) {
        c.gridx = x;
        c.gridy = y;
        Button button = new Button(text, color);
        add(button, c);
    }
}
