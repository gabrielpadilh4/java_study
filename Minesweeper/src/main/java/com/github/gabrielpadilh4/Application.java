package com.github.gabrielpadilh4;

import com.github.gabrielpadilh4.models.Board;

public class Application {

    public static void main(String[] args) {

        Board board = new Board(6, 6, 6);

        board.openField(3,2);
        board.openField(2,1);
        board.markField(4,4);
        board.markField(4,5);

        System.out.println(board);

    }
}
