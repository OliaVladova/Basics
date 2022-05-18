package SoftUni.Basics.ForLoopLecture;

import java.util.Scanner;

public class P11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundry = Double.parseDouble(scanner.nextLine());
        int toyPrize = Integer.parseInt(scanner.nextLine());
        double money = 0;
        int toys = 0;
        double finalMoney = 0;
        int brother =  0;
        double total = 0;
        int i;
        for (i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += 10;
                total = total + money;
                brother += 1;
            } else {
                toys += 1;
            }
        }
        finalMoney = (total- brother) + (toyPrize * toys) ;
        if (finalMoney >= laundry) {
            System.out.printf("Yes! %.2f", finalMoney - laundry);
        } else {
            System.out.printf("No! %.2f", laundry - finalMoney);
        }

    }
}
