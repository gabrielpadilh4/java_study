package com.github.gabrielpadilh4.views;

import com.github.gabrielpadilh4.models.IMemoryObserver;
import com.github.gabrielpadilh4.models.Memory;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements IMemoryObserver {

    private final JLabel label;

    public Display() {

        Memory.getInstance().addObserver(this);

        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memory.getInstance().getActualText());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);
    }

    @Override
    public void updatedValue(String newValue) {
        label.setText(newValue);
    }
}
