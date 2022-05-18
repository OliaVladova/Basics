package SoftUni.Basics.FirstStepsExercise;

import java.util.Scanner;

public class P07FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());
        double raspberryPrice = strawberryPrice/2;
        double orangePrice = 0.6 * raspberryPrice;
        double bananasPrice = 0.2 * raspberryPrice;
        double price = (strawberryKg * strawberryPrice) + (raspberryKg * raspberryPrice) + (bananasKg * bananasPrice) + (orangesKg * orangePrice);

        System.out.printf("%.2f", price);
    }
}
