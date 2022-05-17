package SoftUni.Basics.Exam26And7July2019;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String pack = scanner.nextLine();
        String discount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;
        boolean isTrue = false;
        switch (town) {
            case "Bansko":
            case "Borovets":
                if (pack.equals("noEquipment")) {
                    price = days * 80;
                    if (days>7){
                        price = (days-1) * 80;
                    }
                    if (discount.equals("yes")) {
                        price *=0.95;
                    }
                }else if (pack.equals("withEquipment")) {
                    price = days * 100;
                    if (days>7){
                        price = (days-1) * 100;
                    }
                    if (discount.equals("yes")) {
                        price *=0.9;
                    }
                }else {
                    isTrue = true;
                    System.out.println("Invalid input!");
                }
                break;
            case "Varna":
            case "Burgas":
                 if (pack.equals("noBreakfast")) {
                    price = days * 100;
                    if (days>7){
                        price = (days-1) * 100;
                    }
                    if (discount.equals("yes")) {
                        price *=0.93;
                    }
                }else if (pack.equals("withBreakfast")) {
                    price = days * 130;
                    if (days>7){
                        price = (days-1) * 130;
                    }
                    if (discount.equals("yes")) {
                        price *=0.88;
                    }
                }else{
                     isTrue = true;
                    System.out.println("Invalid input!");
                }
                break;
            default:
                isTrue = true;
                System.out.println("Invalid input!");
                break;
        }
        if (days<1){
            System.out.println("Days must be positive number!");
        }else {
            if (!isTrue) {
                System.out.printf("The price is %.2flv! Have a nice time!", price);
            }
        }

    }
}
