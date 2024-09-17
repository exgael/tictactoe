package org.tictactoe;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        TicTacToeModel model = new TicTacToeModel();
        TicTacToeView view = new TicTacToeView();

        model.addObserver(view);

        // Simulate some moves, sleeps 3 sec between each.
        try {
            model.makeMove(0, 0);
            TimeUnit.SECONDS.sleep(3);

            model.makeMove(1, 1);
            TimeUnit.SECONDS.sleep(3);

            model.makeMove(0, 2);
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted: " + e.getMessage());
        }
    }
}