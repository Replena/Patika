
import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " bir palindrom sayıdır.");
        } else {
            System.out.println(num + " bir palindrom sayı değildir.");
        }

        scanner.close();
    }
}
