
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance, pricePerKm = 0.10, initialPrice, discountedPrice, discount = 0;
        int age, tripType;

        System.out.print("Enter the distance in km: ");
        distance = scanner.nextDouble();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter the trip type (1 => One-way, 2 => Round-trip): ");
        tripType = scanner.nextInt();

        if (distance > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            initialPrice = distance * pricePerKm;

            if (age < 12) {
                discount = initialPrice * 0.50;
            } else if (age >= 12 && age <= 24) {
                discount = initialPrice * 0.10;
            } else if (age > 65) {
                discount = initialPrice * 0.30;
            }

            discountedPrice = initialPrice - discount;

            if (tripType == 2) {
                discountedPrice *= 0.80;
                discountedPrice *= 2;
            }

            System.out.println("Total Price = " + discountedPrice + " TL");
        } else {
            System.out.println("Invalid input!");
        }
        scanner.close();
    }
}
