package SoftUni.Basics.ExtraExercises.CS2;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double tickets = 0;


        switch (category) {
            case "VIP":
                tickets = people * 499.99;
                break;
            case "Normal":
                tickets = people * 249.99;
                break;
        }
        if (people >= 1 && people <= 4) {
            budget = budget * 0.25;
        } else if (people <= 9) {
            budget = budget * 0.4;
        } else if (people <= 24) {
            budget = budget * 0.5;
        } else if (people <= 49) {
            budget = budget * 0.6;
        } else if (people >= 50) {
            budget = budget * 0.75;
        }
        if (budget>=tickets){
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget-tickets));
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget-tickets));
        }
    }
}
