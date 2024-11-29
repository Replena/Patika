
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz:");
        int heat = input.nextInt();
        input.close();

        int range = (heat < 5) ? 0 : (heat <= 15) ? 1 : (heat <= 25) ? 2 : 3;

        switch (range) {
            case 0:
                System.out.println("Kayak yapabilirsiniz.");
                break;
            case 1:
                System.out.println("Sinemaya gidebilirsiniz.");
                if (heat >= 10) {
                    System.out.println("Pikniğe gidebilirsiniz.");
                }
                break;
            case 2:
                System.out.println("Pikniğe gidebilirsiniz.");
                break;
            case 3:
                System.out.println("Yüzmeye gidebilirsiniz.");
                break;
            default:
                System.out.println("Geçersiz sıcaklık değeri.");
        }
    }
}
