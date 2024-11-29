
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();
        System.out.println("4'ün kuvvetleri:");
        int kuvvet4 = 1;
        while (kuvvet4 <= sayi) {
            System.out.println(kuvvet4);
            kuvvet4 *= 4;
        }

        System.out.println("5'in kuvvetleri:");
        int kuvvet5 = 1;
        while (kuvvet5 <= sayi) {
            System.out.println(kuvvet5);
            kuvvet5 *= 5;
        }
        input.close();
    }
}
