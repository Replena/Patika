
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username, password, newPassword;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        username = sc.nextLine();
        System.out.print("Şifreniz: ");
        password = sc.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz hatalı! Şifrenizi değiştirmek isterseniz lütfen 1'e tıklayın.");
            temp = sc.nextInt();
            sc.nextLine();

            if (temp == 1) {
                System.out.print("Yeni şifreniz eski şifrenizden farklı olmalıdır: ");
                newPassword = sc.nextLine();

                if (!newPassword.equals("java123")) {
                    System.out.println("Şifre değiştirildi.");
                    System.out.print("Tekrar giriş yapmayı deneyiniz.\nKullanıcı adı: ");
                    username = sc.nextLine();
                    System.out.print("Şifreniz: ");
                    password = sc.nextLine();
                    sc.close();
                    if (username.equals("patika") && password.equals(newPassword)) {
                        System.out.println("Giriş Yaptınız!");
                    } else {
                        System.out.println("Giriş hatalı!");
                    }
                } else {
                    System.out.println("Yeni şifre eski şifreyle aynı olamaz!");
                }
            }
        }
    }

}
