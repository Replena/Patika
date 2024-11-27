import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Lütfen fiyat giriniz");
            tutar = input.nextDouble();
            if (tutar <= 1000 && tutar >=0) {
                kdvOran = 0.18;
            } else {
                kdvOran = 0.08;
            }
            double kdvTutar = tutar * kdvOran;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz Fiyat = " + tutar);
            System.out.println("KDV'li Fiyat = " + kdvliTutar);
            System.out.println("KDV tutarı =" + kdvTutar);
        } catch (Exception e) {
            System.out.println("Hata oluştu: " + e.getMessage());
        }
    }
}
