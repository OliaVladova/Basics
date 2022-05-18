package SoftUni.Basics.ExtraExercises.CS2;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String classCar = "";
        double Cabrio = 0;
        double Jeep = 0;
        if (budget <= 100) {
            classCar = "Economy class";
            if (season.equals("Summer")) {
                Cabrio = budget * 0.35;
            } else if (season.equals("Winter")) {
                Jeep = budget * 0.65;
            }
        } else if (budget > 100 && budget <= 500) {
            classCar = "Compact class";
            if (season.equals("Summer")) {
                Cabrio = budget * 0.45;
            } else if (season.equals("Winter")) {
                Jeep = budget * 0.8;
            }
        } else if (budget > 500) {
            classCar = "Luxury class";
            Jeep = budget * 0.9;

        }
        System.out.printf("%s\n", classCar);
        if (Cabrio!=0) {
            System.out.printf("Cabrio - %.2f",Cabrio );
        }
        if (Jeep!=0){
            System.out.printf("Jeep - %.2f",Jeep );
        }
    }
}
