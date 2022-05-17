package SoftUni.Basics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        double left = 0;
        switch (flowers){
            case "Roses":
                if (amount>80){
                    totalPrice = (amount * 5) * 0.9;
                }else {
                    totalPrice = amount * 5;
                }
                break;
            case "Dahlias":
                if (amount>90){
                    totalPrice = (amount * 3.8) * 0.85;
                }else {
                    totalPrice = amount * 3.8;
                }
                break;
            case "Tulips":
                if (amount>80){
                    totalPrice = (amount * 2.8) * 0.85;
                }else {
                    totalPrice = amount * 2.8;
                }
                break;
            case "Narcissus":
                if (amount<120){
                    totalPrice = (amount * 3) * 1.15;
                }else {
                    totalPrice = amount * 3;
                }
                break;
            case "Gladiolus":
                if (amount<80){
                    totalPrice = (amount * 2.5) * 1.2;
                }else {
                    totalPrice = amount * 2.5;
                }
                break;

        }if (budget >= totalPrice){
            left = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",amount,flowers, left);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}
