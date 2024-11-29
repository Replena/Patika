
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        while (true) {
            System.out.print("Bir sayı girin (çıkmak için tek bir sayı girin): ");
            int sayi = scanner.nextInt();
            if (sayi % 2 != 0) {
                break;
            }
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }
}
