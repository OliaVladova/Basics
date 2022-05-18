package SoftUni.Basics.FirstStepsExercise;

import java.util.Scanner;

public class P06CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int pastryCooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        double cakePrice = cakes * 45;
        double wafflesPrice = waffles * 5.80;
        double pancakesPrice = pancakes * 3.20;
        double CooksPrice = (cakePrice + wafflesPrice + pancakesPrice)*pastryCooks;
        double allPrice = CooksPrice * days;
        double total = allPrice * 7/8;
        System.out.printf("%.2f", total);

    }
}
