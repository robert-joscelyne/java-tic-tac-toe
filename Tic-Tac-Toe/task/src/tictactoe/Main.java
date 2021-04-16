package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] grid = new char[3][3];

        for (int row = 0; row < 3; row++) {
            grid[row][0] = '_';
            grid[row][1] = '_';
            grid[row][2] = '_';
        }

        printGrid(grid);

        int gameStatus = 0;
        boolean xTurn = true;

        String gameStatusMessage = "";

        while (gameStatus == 0) {
            grid = getUserMove(scanner, grid, xTurn ? 'X' : 'O');
            xTurn = ! xTurn;

            printGrid(grid);

            gameStatus = gameStatus(grid);

            switch (gameStatus) {
                case 1:
                    gameStatusMessage = "Draw";
                    break;
                case 2:
                    gameStatusMessage = "X wins";
                    break;
                case 3:
                    gameStatusMessage = "O wins";
                    break;
                case 4:
                    gameStatusMessage = "Impossible";
                    break;
            }
        }

        System.out.println(gameStatusMessage);
    }

    private static char[][] getUserMove(Scanner scanner, char[][] grid, char player) {
        int row, column;

        while (true) {
            System.out.print("Enter the coordinates: ");

            String rowString = scanner.next();
            if (!rowString.matches("\\d")) {
                System.out.println("You should enter numbers!");
                continue;
            }
            String columnString = scanner.next();

            if (!columnString.matches("\\d")) {
                System.out.println("You should enter numbers!");
                continue;
            }

            row = Integer.parseInt(rowString);
            column = Integer.parseInt(columnString);

            if (row < 1 || row > 3 || column < 1 || column > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            if (grid[row - 1][column - 1] == 'X' || grid[row - 1][column - 1] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                break;
            }
        }


        grid[row - 1][column - 1] = player;

        return grid;
    }

    private static int gameStatus(char[][] grid) {
        boolean xWin = false;
        boolean oWin = false;

        boolean xWinRow = checkRowWin(grid, 'X');
        boolean oWinRow = checkRowWin(grid, 'O');

        boolean xWinColumn = checkColumnWin(grid, 'X');
        boolean oWinColumn = checkColumnWin(grid, 'O');

        boolean xWinDiagonal = checkDiagonalWin(grid, 'X');
        boolean oWinDiagonal = checkDiagonalWin(grid, 'O');

        xWin = (xWinRow || xWinColumn || xWinDiagonal ? true : false);
        oWin = (oWinRow || oWinColumn || oWinDiagonal ? true : false);

        if ((xWin && oWin) || impossibleGameCheck(grid)) {
            return 4;
        }

        if (xWin) {
            return 2;
        }

        if (oWin) {
            return 3;
        }

        if (gameComplete(grid)) {
            return 1;
        }

        return 0;
    }

    private static boolean impossibleGameCheck(char[][] grid) {
        int xCount = countMoves(grid, 'X');
        int oCount = countMoves(grid, 'O');

        int difference = xCount - oCount;

        if (difference >= 2 || difference <= -2) {
            return true;
        }

        return false;
    }

    private static int countMoves(char[][] grid, char player) {
        int count = 0;

        for (char[] row : grid) {
            for (char element : row) {
                if (element == player) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean checkRowWin(char[][] grid, char player) {
        boolean win = false;

        for (int row = 0; row < 3; row++) {
            if (grid[row][0] == player && grid[row][1] == player && grid[row][2] == player) {
                win = true;
            }
        }

        return win;
    }

    private static boolean checkColumnWin(char[][] grid, char player) {
        boolean win = false;

        for (int column = 0; column < 3; column++) {
            if (grid[0][column] == player && grid[1][column] == player && grid[2][column] == player) {
                win = true;
            }
        }

        return win;
    }

    private static boolean checkDiagonalWin(char[][] grid, char player) {
        boolean win = false;

        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {
            win = true;
        }

        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {
            win = true;
        }

        return win;
    }

    private static boolean gameComplete(char[][] grid) {
        boolean complete = true;

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (grid[row][column] == 'X' || grid[row][column] == 'O') {
                    continue;
                }
                complete = false;
            }
        }

        return complete;
    }

    private static void printGrid(char[][] grid) {
        printDashes();
        printRow(grid, 0);
        printRow(grid, 1);
        printRow(grid, 2);
        printDashes();
    }

    private static void printDashes() {
        System.out.println("---------");
    }

    private static void printRow(char[][] grid, int row) {
        String formattedRow = "| " + grid[row][0] + " " + grid[row][1] + " " + grid[row][2] + " |";

        System.out.println(formattedRow);
    }
}
