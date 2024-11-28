import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilo = inp.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = inp.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = inp.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilo = inp.nextDouble();

        double toplamTutar = (armutKilo * armutFiyat) +
                             (elmaKilo * elmaFiyat) +
                             (domatesKilo * domatesFiyat) +
                             (muzKilo * muzFiyat) +
                             (patlicanKilo * patlicanFiyat);

        System.out.printf("Toplam Tutar : %.2f TL\n", toplamTutar);

        inp.close();
    }
}
