package SoftUni.Basics.ExtraExercises.CS2;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        char holiday = scanner.next().charAt(0);
        double price = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                price = (chrysanthemums * 2) + (roses * 4.1) + (tulips * 2.5);
                if (tulips > 7 && season.equals("Spring")) {
                    price *= 0.95;
                }
                if ((tulips + roses + chrysanthemums) > 20) {
                    price *= 0.8;
                }
                break;
            case "Autumn":
            case "Winter":
                price = (chrysanthemums * 3.75) + (roses * 4.5) + (tulips * 4.15);
                if (roses >= 10 && season.equals("Winter")) {
                    price *= 0.9;
                }
                if ((tulips + roses + chrysanthemums) > 20) {
                    price *= 0.8;
                }
                break;

        }
        if (holiday=='Y'){
            price = price * 1.15 ;
        }
        price += 2;
        System.out.printf("%.2f", price);
    }
}
