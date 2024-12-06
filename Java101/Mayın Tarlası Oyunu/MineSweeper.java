
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int row, column, size, level;
    int[][] map;
    String[][] board;
    boolean game = true;
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    public MineSweeper(int row, int column, int level) {
        this.row = row;
        this.column = column;
        this.map = new int[row][column];
        this.board = new String[row][column];
        this.size = row * column;
        this.level = level;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j] = "*";
            }
        }
    }

    public void runGame() {
        int chosen = 0;

        addMine();

        while (game) {
            print(board);

            System.out.print("Row = ");
            int row = input.nextInt() - 1;
            System.out.print("Column = ");
            int column = input.nextInt() - 1;

            while (!isValid(row, column)) {
                System.out.println("Invalid row and column values, please try again!");
                System.out.print("Row = ");
                row = input.nextInt() - 1;
                System.out.print("Column = ");
                column = input.nextInt() - 1;
            }

            if (map[row][column] != -1 && board[row][column].equals("*")) {
                checkMine(row, column);
                chosen++;

                if (chosen == (size - level)) {
                    game = false;
                    print(board);
                    System.out.println("\nYou WON, Congratulations!!");
                }

            } else if (map[row][column] == -1) {
                game = false;
                System.out.println("\nYou chose a MINE! Game Over!");
                printWithMines(board);
            } else if (!board[row][column].equals("*")) {
                System.out.println("This field already chosen! Please enter new row and column values");
            }
        }
    }

    private boolean isValid(int row, int column) {
        return (0 <= row && row < this.row) && (0 <= column && column < this.column);
    }

    public void addMine() {
        if (level == (row * column) - 1) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    map[i][j] = -1;
                }
            }

            int randRow = random.nextInt(row);
            int randCol = random.nextInt(column);
            map[randRow][randCol] = 0;
        } else {
            int mineCount = 0;

            while (mineCount < level) {
                int randRow = random.nextInt(row);
                int randCol = random.nextInt(column);

                if (map[randRow][randCol] != -1) {
                    map[randRow][randCol] = -1;
                    mineCount++;
                }
            }
        }
    }

    public void checkMine(int row, int column) {
        int mineCount = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = column + j;
                if (isValid(newRow, newCol) && map[newRow][newCol] == -1) {
                    mineCount++;
                }
            }
        }

        if (mineCount == 0) {
            board[row][column] = "0";
        } else {
            board[row][column] = String.valueOf(mineCount);
        }
    }

    public void print(String[][] matrix) {
        System.out.println();
        for (String[] matrix1 : matrix) {
            for (String cell : matrix1) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printWithMines(String[][] matrix) {
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (map[i][j] == -1) {
                    System.out.print("M ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
