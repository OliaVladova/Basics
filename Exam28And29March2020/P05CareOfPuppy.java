package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtFood = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int foodInGrams = boughtFood * 1000;
        int totalFood = 0;
        while (!command.equals("Adopted")) {
            int eatenFood = Integer.parseInt(command);

            totalFood += eatenFood;
            command = scanner.nextLine();
        }
        if (totalFood<=foodInGrams){
            System.out.printf("Food is enough! Leftovers: %d grams.",foodInGrams - totalFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",totalFood-foodInGrams);
        }
    }
}
