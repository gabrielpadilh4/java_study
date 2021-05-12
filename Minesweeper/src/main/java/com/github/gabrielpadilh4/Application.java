package com.github.gabrielpadilh4;

import com.github.gabrielpadilh4.models.Board;
import com.github.gabrielpadilh4.views.BoardConsole;

public class Application {

    public static void main(String[] args) {

        Board board = new Board(6, 6, 6);

       new BoardConsole(board);

    }
}
