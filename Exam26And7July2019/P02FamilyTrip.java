package SoftUni.Basics.Exam26And7July2019;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double nightsMoney = nights * pricePerNight;
        double forOther = (percent * 0.01)*budget;
        if (nights>7){
            nightsMoney*=0.95;
        }
        double total = nightsMoney + forOther;
        if (total<=budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",Math.abs(total-budget));
        }else {
            System.out.printf("%.2f leva needed.",Math.abs(total-budget));
        }
    }
}
