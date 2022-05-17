package SoftUni.Basics.ConditionalStatementExercise;

import java.util.Scanner;

public class P06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extra = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double decor = 0.1 * budget;
        double extraClothes = clothingPrice*extra;
        if (extra >= 150){
            extraClothes = extraClothes*0.9;
        }
        double cost = extraClothes + decor;
        if (cost <= budget){
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", budget-cost);
        }else {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.",cost - budget);
        }

    }
}
