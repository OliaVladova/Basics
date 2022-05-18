package SoftUni.Basics.ExtraExercises.CS2;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (!group.equals("mixed")) {
                    price = nights * 9.60 * students;
                    if (group.equals("girls")){
                        sport = "Gymnastics";
                    }else {
                        sport = "Judo";
                    }
                } else {
                    price = nights * 10 * students;
                    sport = "Ski";
                }
                break;
            case "Spring":
                if (!group.equals("mixed")) {
                    price = nights * 7.2 * students;
                    if (group.equals("girls")){
                        sport = "Athletics";
                    }else {
                        sport = "Tennis";
                    }
                } else {
                    price = nights * 9.5 * students;
                    sport = "Cycling";
                }
                break;
            case "Summer":
                if (!group.equals("mixed")) {
                    price = nights * 15 * students;
                    if (group.equals("girls")){
                        sport = "Volleyball";
                    }else {
                        sport = "Football";
                    }
                } else {
                    price = nights * 20 * students;
                    sport = "Swimming";
                }
                break;
        }
        if (students >= 50) {
            price *= 0.5;
        } else if (students >= 20) {
            price *= 0.85;
        } else if (students >= 10) {
            price *= 0.95;
        }
        System.out.printf("%s %.2f lv.",sport,price);
    }
}
