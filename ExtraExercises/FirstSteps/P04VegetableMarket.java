package SoftUni.Basics.ExtraExercises.FirstSteps;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int vegetablesKg = Integer.parseInt(scanner.nextLine());
        int fruitsKg = Integer.parseInt(scanner.nextLine());
        double vegetablesLvToEuro = vegetablesPrice / 1.94;
        double fruitsLvToEuro = fruitsPrice / 1.94;
        double totalPrice = (vegetablesKg * vegetablesLvToEuro) + (fruitsKg * fruitsLvToEuro);
        System.out.printf("%.2f", totalPrice);
    }
}
