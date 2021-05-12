package com.github.gabrielpadilh4.views;

import com.github.gabrielpadilh4.exceptions.ExitException;
import com.github.gabrielpadilh4.exceptions.ExplosionException;
import com.github.gabrielpadilh4.models.Board;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BoardConsole {

    private Board board;
    private Scanner in = new Scanner(System.in);

    public BoardConsole(Board board) {
        this.board = board;

        executeGame();
    }

    private void executeGame() {

        try {

            loopGameCycle();

            boolean continuePlaying = true;

            while (continuePlaying) {
                System.out.println("Another match? (S/n)");

                String answer = in.nextLine();

                if ("n".equalsIgnoreCase(answer)) {
                    continuePlaying = false;
                } else {
                    this.board.restartGame();
                }
            }

        } catch (ExitException e) {
            System.out.println("Bye Bye!");
        } finally {
            in.close();
        }

    }

    private void loopGameCycle() {

        try {

            while (!board.objectiveAchieved()) {
                System.out.println(board);

                String input = captureEnteredValue("Enter (x, y): ");

                Iterator<Integer> coordinates = Arrays.stream(input.split(",")).map(i -> Integer.parseInt(i.trim())).iterator();


                input = captureEnteredValue("1 - Open \n 2 - Toggle Mark");

                System.out.println();

                if ("1".equalsIgnoreCase(input)) {
                    board.openField(coordinates.next(), coordinates.next());
                } else {
                    board.markField(coordinates.next(), coordinates.next());
                }

                System.out.println();

            }

            System.out.println(board);
            System.out.println("You win");
        } catch (ExplosionException e) {
            System.out.println(board);
            System.out.println("You lose");
        }

    }

    private String captureEnteredValue(String text) {
        System.out.print(text);
        String input = in.nextLine();

        if ("exit".equalsIgnoreCase(input)) {
            throw new ExitException();
        }

        return input;
    }
}
