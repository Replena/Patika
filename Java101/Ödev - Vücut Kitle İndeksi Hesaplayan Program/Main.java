import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = inp.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vki);

        inp.close();
    }
}
