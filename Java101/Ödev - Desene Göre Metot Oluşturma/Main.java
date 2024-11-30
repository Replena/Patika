
import java.util.Scanner;

public class Main {

    public static void recursivePrint(int n, int original, boolean decreasing) {
        System.out.print(n + " ");

        if (decreasing) {
            if (n > 0) {
                recursivePrint(n - 5, original, true);
            } else {
                recursivePrint(n + 5, original, false);
            }
        } else {
            if (n < original) {
                recursivePrint(n + 5, original, false);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        recursivePrint(n, n, true);

        scanner.close();
    }
}
