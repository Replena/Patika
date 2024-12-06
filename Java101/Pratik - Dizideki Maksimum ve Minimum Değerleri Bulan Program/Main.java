
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int target = scanner.nextInt();

        int closestSmaller = Integer.MIN_VALUE;
        int closestGreater = Integer.MAX_VALUE;

        for (int num : list) {
            if (num < target && num > closestSmaller) {
                closestSmaller = num;
            }

            if (num > target && num < closestGreater) {
                closestGreater = num;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen Sayı: " + target);

        if (closestSmaller != Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        } else {
            System.out.println("Girilen sayıdan küçük bir değer bulunamadı.");
        }

        if (closestGreater != Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestGreater);
        } else {
            System.out.println("Girilen sayıdan büyük bir değer bulunamadı.");
        }

        scanner.close();
    }
}
