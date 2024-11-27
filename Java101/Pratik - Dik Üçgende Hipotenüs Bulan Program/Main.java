
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            int a,b,c;
            double alan;
        try (Scanner input = new Scanner(System.in);){
            System.out.println("1.Kenarı giriniz");
            a=input.nextInt();
            System.out.println("2.Kenarı giriniz");
            b=input.nextInt();
            c= (int)Math.sqrt((a*a)+(b*b));
            System.out.println("Hipotenüs: " + c);
            double u = (a + b + c) / 2.0;
            alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
            System.out.println("Üçgenin Alanı: " + alan);
        } catch (Exception e) {
            System.out.println("Geçersiz bir giriş yapıldı.");
        }
    }
}
