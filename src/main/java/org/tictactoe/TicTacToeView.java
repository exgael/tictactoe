package org.tictactoe;

class TicTacToeView implements Observer {
    @Override
    public void update(TicTacToeModel model) {
        System.out.println("Board updated:");
        displayBoard(model.getBoard());
        System.out.println("Current player: " + model.getCurrentPlayer());
    }

    private void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
}
