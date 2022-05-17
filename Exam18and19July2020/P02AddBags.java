package SoftUni.Basics.Exam18and19July2020;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOverTwentyKg = Double.parseDouble(scanner.nextLine());
        double kg = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int numLuggage = Integer.parseInt(scanner.nextLine());
        double priceLuggage = 0;
        double totalPrice = 0;
        if (kg<10){
            priceLuggage = 0.2*priceOverTwentyKg;
        }else if (kg<=20){
            priceLuggage = 0.5*priceOverTwentyKg;
        }else {
            priceLuggage = priceOverTwentyKg;
        }
        if (days>30){
            priceLuggage *= 1.1;
        }else if (days>=7 && days<=30){
            priceLuggage*=1.15;
        }else {
            priceLuggage*=1.4;
        }
        totalPrice = priceLuggage*numLuggage;
        System.out.printf("The total price of bags is: %.2f lv. ",totalPrice);
    }
}
