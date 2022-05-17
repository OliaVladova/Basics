package SoftUni.Basics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double rentBoat = 0;

        switch (season) {
            case "Spring":
                rentBoat = 3000;
                break;
            case "Summer":
            case "Autumn":
                rentBoat = 4200;
                break;
            case "Winter":
                rentBoat = 2600;
                break;
        }
        if (number <= 6) {
            rentBoat *= 0.9;
        } else if (number > 7 && number <= 11) {
            rentBoat *= 0.85;
        } else {
            rentBoat *= 0.75;
        }
        if (number % 2 == 0 && !season.equals("Autumn")) {
            rentBoat *= 0.95;

        }
        if (budget>=rentBoat){
            System.out.printf("Yes! You have %.2f leva left.", budget - rentBoat);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", rentBoat - budget);
        }
    }
}
