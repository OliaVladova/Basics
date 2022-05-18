package SoftUni.Basics.ExtraExercises.FirstSteps;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double beltedBonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int musselKg = Integer.parseInt(scanner.nextLine());
        double beltedBonitoPrice = 1.6 * mackerelPrice;
        double scadPrice = 1.80 * spratPrice;
        double musselPrice = 7.50;
        double totalPrice = (beltedBonitoPrice*beltedBonitoKg) + (scadPrice*scadKg) + (musselPrice*musselKg);
        System.out.printf("%.2f", totalPrice);

    }
}
