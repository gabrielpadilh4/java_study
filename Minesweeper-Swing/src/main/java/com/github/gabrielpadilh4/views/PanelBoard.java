package com.github.gabrielpadilh4.views;

import com.github.gabrielpadilh4.models.Board;

import javax.swing.*;
import java.awt.*;

public class PanelBoard extends JPanel {

    public PanelBoard(Board board) {

        setLayout(new GridLayout(board.getRows(), board.getColumns()));

        board.forEachField(c -> add(new FieldButton(c)));

        board.registerObserver(e -> {
            // TODO - show results to user

        });
    }
}
