package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P02BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double teressaMoney = Double.parseDouble(scanner.nextLine());
        double earnedMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double expense = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double ownMoney = teressaMoney * 5;
        double earned = earnedMoneyPerDay*5;
        double total = ownMoney + earned;
        total -=expense;
        if (total>=giftPrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",total);
        }else {
            System.out.printf("Insufficient money: %.2f BGN.",Math.abs(total-giftPrice));
        }

    }
}
