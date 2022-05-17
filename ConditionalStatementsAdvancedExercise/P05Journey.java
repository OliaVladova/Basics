package SoftUni.Basics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double totalSpend = 0;
        String place = "";

        switch (season) {
            case "summer":
                if (budget <=100) {
                    destination = "Bulgaria";
                    totalSpend = budget * 0.3;
                }else if (budget<=1000){
                    destination = "Balkans";
                    totalSpend = budget * 0.4;
                }else {
                    destination = "Europe";
                    totalSpend = budget * 0.9;
                }
                break;
            case "winter":
                if (budget <=100) {
                    destination = "Bulgaria";
                    totalSpend = budget * 0.7;
                }else if (budget<=1000){
                    destination = "Balkans";
                    totalSpend = budget * 0.8;
                }else {
                    destination = "Europe";
                    totalSpend = budget * 0.9;
                }
                break;
        }if (season.equals("summer") && !destination.equals("Europe")){
            place = "Camp";
        }else {
            place = "Hotel";
        }
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", place,totalSpend);
        }
    }

