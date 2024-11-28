import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz : ");
        r = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);

        System.out.println("Daire diliminin merkez açısını giriniz (𝛼) : ");
        double alfa = inp.nextDouble();

        double dilimAlan = (pi * (r * r) * alfa) / 360;

        System.out.println("Daire diliminin Alanı : " + dilimAlan);

        inp.close();
    }
}
