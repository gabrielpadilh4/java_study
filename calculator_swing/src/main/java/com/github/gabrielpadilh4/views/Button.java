package com.github.gabrielpadilh4.views;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String text, Color color){
        setText(text);
        setOpaque(true);
        setBackground(color);
        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", Font.PLAIN, 25));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
