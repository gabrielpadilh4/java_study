package com.github.gabrielpadilh4.views;

import com.github.gabrielpadilh4.models.Board;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    public MainView(){

        Board board = new Board(16, 30, 100);

        PanelBoard panelBoard = new PanelBoard(board);

        add(panelBoard);

        setTitle("Minesweeper");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainView();
    }
}
