package SoftUni.Basics.ExtraExercises.ConditionalStatementLecture;

import java.util.Scanner;

public class P07ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tourPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double dollPrice = 3.00;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.00;
        double totalPrice = (puzzles*puzzlePrice) + (dolls*dollPrice) + (teddyBear*teddyBearPrice)+
                (minionPrice*minions) + (trucks*truckPrice);
        int totalToys = puzzles + dolls + teddyBear + minions + trucks;
        if (totalToys >= 50){
            totalPrice = totalPrice * 0.75;
        }
        double rent = totalPrice*0.1;
        double finalMoney = totalPrice - rent;
        if(finalMoney >= tourPrice){
            System.out.printf("Yes! %.2f lv left.", finalMoney-tourPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", tourPrice-finalMoney);
        }

    }
}
