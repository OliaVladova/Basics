package SoftUni.Basics.Exam2and3May2019;

import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double neededLitres = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double price = neededLitres*2.1 + 100;
        switch (day){
            case "Saturday":
                price*=0.9;
                break;
            case "Sunday":
                price*=0.8;
                break;
        }
        if (budget>=price){
            System.out.printf("Safari time! Money left: %.2f lv. ",Math.abs(budget-price));
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",Math.abs(budget-price));
        }
    }
}
