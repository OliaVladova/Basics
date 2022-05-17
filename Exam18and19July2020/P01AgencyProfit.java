package SoftUni.Basics.Exam18and19July2020;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firmName = scanner.nextLine();
        int adultsTickets = Integer.parseInt(scanner.nextLine());
        int kidsTickets = Integer.parseInt(scanner.nextLine());
        double adultsPrice = Double.parseDouble(scanner.nextLine());
        double service = Double.parseDouble(scanner.nextLine());
        double kidsPrice = 0.3*adultsPrice;
        double total = (adultsTickets*adultsPrice)+(kidsTickets*kidsPrice)+service*(adultsTickets+kidsTickets);
        double profit = 0.2*total;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",firmName,profit);
    }
}
