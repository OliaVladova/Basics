package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = number * 2 * 56;
                } else if (size.equals("big")) {
                    price = number * 5 * 28.7;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = number * 2 * 36.66;
                } else if (size.equals("big")) {
                    price = number * 5 * 19.6;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = number * 2 * 42.1;
                } else if (size.equals("big")) {
                    price = number * 5 * 24.8;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = number * 2 * 20;
                } else if (size.equals("big")) {
                    price = number * 5 * 15.2;
                }
                break;

        }
        if (price >= 400 && price <= 1000) {
            price*=0.85;
        }else if (price>1000){
            price*=0.5;
        }
        System.out.printf("%.2f lv.",price);
    }
}
