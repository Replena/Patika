
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int row, column, level = 1;
        int choose = 0;
        MineSweeper mineGame;
        Scanner input = new Scanner(System.in);

        System.out.println("--------- Welcome to Mine Game ------------");
        System.out.println("Please enter size of the game board");
        System.out.print("Row Number = ");
        row = input.nextInt();
        System.out.print("Column Number = ");
        column = input.nextInt();

        while (!(1 <= choose && choose <= 3)) {
            System.out.println("Please choose a game level\n1-Easy\n2-Medium\n3-Hard");
            System.out.print("Game Level = ");
            choose = input.nextInt();

            switch (choose) {
                case 1 ->
                    level = (row * column) / 6;
                case 2 ->
                    level = (row * column) / 4;
                case 3 ->
                    level = (row * column) / 2;
                default ->
                    System.out.println("Please enter a valid level! Try again.");
            }
        }

        mineGame = new MineSweeper(row, column, level);
        mineGame.runGame();

        input.close();
    }
}
