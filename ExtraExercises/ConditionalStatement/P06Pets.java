package SoftUni.Basics.ExtraExercises.ConditionalStatement;

import java.util.Scanner;

public class P06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double foodDogPerDay = Double.parseDouble(scanner.nextLine());
        double foodCatPerDay = Double.parseDouble(scanner.nextLine());
        double foodTurtlePerDay = Double.parseDouble(scanner.nextLine());

        double turtleKg = 0.001 * foodTurtlePerDay;
        double allFood = days * (foodCatPerDay + foodDogPerDay + turtleKg);
        if (allFood <= foodKg){
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKg - allFood));
        }else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(allFood - foodKg));
        }
    }
}
