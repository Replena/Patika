
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month, day;
        boolean isError = false;
        String burc = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();
        input.close();
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                burc = (day < 22) ? "Oğlak Burcu" : "Kova Burcu";
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                burc = (day < 20) ? "Kova Burcu" : "Balık Burcu";
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                burc = (day < 21) ? "Balık Burcu" : "Koç Burcu";
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                burc = (day < 21) ? "Koç Burcu" : "Boğa Burcu";
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                burc = (day < 22) ? "Boğa Burcu" : "İkizler Burcu";
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                burc = (day < 23) ? "İkizler Burcu" : "Yengeç Burcu";
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                burc = (day < 23) ? "Yengeç Burcu" : "Aslan Burcu";
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                burc = (day < 23) ? "Aslan Burcu" : "Başak Burcu";
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                burc = (day < 23) ? "Başak Burcu" : "Terazi Burcu";
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                burc = (day < 23) ? "Terazi Burcu" : "Akrep Burcu";
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                burc = (day < 22) ? "Akrep Burcu" : "Yay Burcu";
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                burc = (day < 22) ? "Yay Burcu" : "Oğlak Burcu";
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Geçersiz bir gün girdiniz!");
        } else {
            System.out.println(burc);
        }
    }
}
