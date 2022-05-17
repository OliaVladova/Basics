package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int walksMin = Integer.parseInt(scanner.nextLine());
        int countWalks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int lessCalories = (walksMin*5)*countWalks;
        double needed = 0.5*calories;
        if (lessCalories>=needed){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",lessCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",lessCalories);
        }
    }
}
