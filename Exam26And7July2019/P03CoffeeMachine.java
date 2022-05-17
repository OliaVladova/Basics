package SoftUni.Basics.Exam26And7July2019;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    price = number * 0.9;
                    price*=0.65;
                }else if (sugar.equals("Normal")){
                    price = number;
                }else if (sugar.equals("Extra")){
                    price = number * 1.2;
                }
                if (number>=5){
                    price*=0.75;
                }
                if (price>15){
                    price*=0.8;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price = number ;
                    price*=0.65;
                }else if (sugar.equals("Normal")){
                    price = number*1.2;
                }else if (sugar.equals("Extra")){
                    price = number * 1.6;
                }
                if (price>15){
                    price*=0.8;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    price = number * 0.5;
                    price*=0.65;
                }else if (sugar.equals("Normal")){
                    price = number*0.6;
                }else if (sugar.equals("Extra")){
                    price = number * 0.7;
                }
                if (price>15){
                    price*=0.8;
                }
                break;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",number,drink,price);
    }
}
