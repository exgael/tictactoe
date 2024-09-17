package org.tictactoe;

import java.util.ArrayList;
import java.util.List;


class TicTacToeModel {
    private char[][] board;
    private char currentPlayer;
    private List<Observer> observers;

    public TicTacToeModel() {
        board = new char[3][3];
        currentPlayer = 'X';
        observers = new ArrayList<>();
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            notifyObservers();
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }
}