package SoftUni.Basics.Exam6And7April2019;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int stats = Integer.parseInt(scanner.nextLine());
        double clothForOne = Double.parseDouble(scanner.nextLine());

        double decor = 0.1 * budget;
        double statsPrice = clothForOne * stats;
        if (stats>=150){
            statsPrice*=0.9;
        }
        double total = decor + statsPrice;
        if (total<=budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget - total);
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(total-budget));
        }
    }
}
