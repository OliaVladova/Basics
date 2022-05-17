package SoftUni.Basics.Exam26And7July2019;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double total = 0;
        while (!command.equals("Party!")) {
            String drinks = command;
            int number = Integer.parseInt(scanner.nextLine());
            double drinkName = drinks.length();
            double money = number * drinkName;
            if (money%2!=0){
                money*=0.75;
            }
            total+=money;
            if (total>=neededMoney){
                System.out.println("Target acquired.");
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Party!")){
            System.out.printf("We need %.2f leva more.\n",neededMoney-total);
        }
        System.out.printf("Club income - %.2f leva.",total);
    }
}
