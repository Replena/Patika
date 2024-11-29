
import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int divisor) {
        if (number <= 1) {
            return false;
        }
        if (divisor == number) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = scan.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }
    }
}
