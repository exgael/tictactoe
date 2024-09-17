package org.tictactoe;

@FunctionalInterface
public interface Observer {
    void update(TicTacToeModel model);
}
