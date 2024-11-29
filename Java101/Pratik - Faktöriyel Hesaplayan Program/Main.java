
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N değerini girin: ");
        int n = scanner.nextInt();
        System.out.print("R değerini girin: ");
        int r = scanner.nextInt();
        long faktoriyelN = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyelN *= i;
        }
        long faktoriyelR = 1;
        for (int i = 1; i <= r; i++) {
            faktoriyelR *= i;
        }
        long faktoriyelNR = 1;
        for (int i = 1; i <= (n - r); i++) {
            faktoriyelNR *= i;
        }
        long kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNR);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }
}
