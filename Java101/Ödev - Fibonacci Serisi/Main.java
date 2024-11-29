
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        if (n <= 0) {
            System.out.println("Geçersiz sayı! Fibonacci serisi için pozitif bir sayı giriniz.");
        } else {
            System.out.print("Fibonacci serisi: ");

            if (n == 1) {
                System.out.print(a + " ");
            } else {
                System.out.print(a + " " + b + " ");
                for (int i = 3; i <= n; i++) {
                    int next = a + b;
                    System.out.print(next + " ");
                    a = b;
                    b = next;
                }
            }
        }
        scanner.close();
    }
}
