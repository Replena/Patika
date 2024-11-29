
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static final String INVALID_INPUT = "Geçersiz sayı girişi. Tekrar deneyin.";
    static final String EXIT_PROMPT = "bitirmek için 'q' yazın";
    static final String EXIT_MESSAGE = "Çıkış yapılıyor...";
    static final String REENTER_CHOICE = "Geçersiz seçim. Tekrar deneyin.";

    static double getValidNumber() {
        while (true) {
            String input = scan.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println(INVALID_INPUT);
            }
        }
    }

    static double plus() {
        double result = 0;
        while (true) {
            System.out.print("Sayı girin (" + EXIT_PROMPT + "): ");
            String input = scan.nextLine();
            if (input.equals("q")) {
                break;
            }
            result += getValidNumber();
        }
        return result;
    }

    static double minus() {
        System.out.print("İlk sayıyı girin: ");
        double result = getValidNumber();
        while (true) {
            System.out.print("Çıkarılacak sayıyı girin (" + EXIT_PROMPT + "): ");
            String input = scan.nextLine();
            if (input.equals("q")) {
                break;
            }
            result -= getValidNumber();
        }
        return result;
    }

    static double times() {
        double result = 1;
        while (true) {
            System.out.print("Sayı girin (" + EXIT_PROMPT + "): ");
            String input = scan.nextLine();
            if (input.equals("q")) {
                break;
            }
            double number = getValidNumber();
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        return result;
    }

    static double divided() {
        System.out.print("İlk sayıyı girin: ");
        double result = getValidNumber();
        while (true) {
            System.out.print("Bölen sayıyı girin (" + EXIT_PROMPT + "): ");
            String input = scan.nextLine();
            if (input.equals("q")) {
                break;
            }
            double number = getValidNumber();
            if (number == 0) {
                System.out.println("Sıfıra bölme hatası! İşlem iptal edildi.");
                return result;
            }
            result /= number;
        }
        return result;
    }

    static double power() {
        System.out.print("Taban değerini girin: ");
        double base = getValidNumber();
        System.out.print("Üs değerini girin: ");
        int exponent = (int) getValidNumber();
        return Math.pow(base, exponent);
    }

    static long factorial() {
        System.out.print("Faktöriyel hesaplanacak sayıyı girin: ");
        int n = (int) getValidNumber();
        if (n < 0) {
            System.out.println("Negatif sayıların faktöriyeli hesaplanamaz!");
            return 0;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int mod() {
        System.out.print("Bölünen sayıyı girin: ");
        int dividend = (int) getValidNumber();
        System.out.print("Bölen sayıyı girin: ");
        int divisor = (int) getValidNumber();
        if (divisor == 0) {
            System.out.println("Bölen sıfır olamaz!");
            return 0;
        }
        return dividend % divisor;
    }

    static void rectangle() {
        System.out.print("Dikdörtgenin uzunluğunu girin: ");
        double length = getValidNumber();
        System.out.print("Dikdörtgenin genişliğini girin: ");
        double width = getValidNumber();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.printf("Dikdörtgenin Alanı: %.2f\n", area);
        System.out.printf("Dikdörtgenin Çevresi: %.2f\n", perimeter);
    }

    static void showMenu() {
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktöriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- " + EXIT_MESSAGE;
        System.out.println(menu);
    }

    public static void main(String[] args) {
        int select;
        do {
            showMenu();
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = (int) getValidNumber();
            switch (select) {
                case 1:
                    System.out.println("Sonuç: " + plus());
                    break;
                case 2:
                    System.out.println("Sonuç: " + minus());
                    break;
                case 3:
                    System.out.println("Sonuç: " + times());
                    break;
                case 4:
                    System.out.println("Sonuç: " + divided());
                    break;
                case 5:
                    System.out.println("Sonuç: " + power());
                    break;
                case 6:
                    System.out.println("Sonuç: " + factorial());
                    break;
                case 7:
                    System.out.println("Sonuç: " + mod());
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println(EXIT_MESSAGE);
                    break;
                default:
                    System.out.println(REENTER_CHOICE);
            }
        } while (select != 0);
    }
}
