package SoftUni.Basics.ExtraExercises.ConditionalStatement;

import java.util.Scanner;

public class P08FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        switch (text) {
            case "Diesel":
                if (litres >= 25) {
                    System.out.println("You have enough diesel.");
                } else {
                    System.out.println("Fill your tank with diesel!");
                }
                break;
            case "Gasoline":
                if (litres >= 25) {
                    System.out.println("You have enough gasoline.");
                } else {
                    System.out.println("Fill your tank with gasoline!");
                }
                break;
            case "Gas":
                if (litres >= 25) {
                    System.out.println("You have enough gas.");
                } else {
                    System.out.println("Fill your tank with gas!");
                }
                break;
            default:
                System.out.println("Invalid fuel!");
                break;
        }
    }
}
