package SoftUni.Basics.ExtraExercises.ConditionalStatement;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers =  Integer.parseInt(scanner.nextLine());
        double grapes = (x * y);
        double wine = 0.4 * grapes /2.5;
        double  needed = 0;
        double totalWine = 0;
        double left = 0;
        double forWorkers = 0;
        if (wine < z){
            needed = Math.floor(z - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", needed);
        }else if (wine >= z){
            totalWine = Math.floor(wine);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", totalWine);
            left =Math.ceil(wine -z );
            forWorkers= Math.ceil(left/workers);
            System.out.printf("%.0f liters left -> %.0f liters per person.",left, forWorkers);

        }
    }
}
