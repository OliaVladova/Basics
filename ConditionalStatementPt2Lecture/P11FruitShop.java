package SoftUni.Basics.ConditionalStatementPt2Lecture;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")){
                    totalPrice = amount * 2.5;
                }else if (fruit.equals("apple")){
                    totalPrice = amount * 1.2;
                }else if (fruit.equals("orange")){
                totalPrice = amount * 0.85;
            }else if (fruit.equals("grapefruit")){
                totalPrice = amount * 1.45;
            }else if (fruit.equals("kiwi")){
                totalPrice = amount * 2.7;
            }else if (fruit.equals("pineapple")){
                totalPrice = amount * 5.5;
            }else if (fruit.equals("grapes")){
                totalPrice = amount * 3.85;
            }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")){
                    totalPrice = amount * 2.7;
                }else if (fruit.equals("apple")){
                    totalPrice = amount * 1.25;
                }else if (fruit.equals("orange")){
                    totalPrice = amount * 0.9;
                }else if (fruit.equals("grapefruit")){
                    totalPrice = amount * 1.60;
                }else if (fruit.equals("kiwi")){
                    totalPrice = amount * 3;
                }else if (fruit.equals("pineapple")){
                    totalPrice = amount * 5.6;
                }else if (fruit.equals("grapes")){
                    totalPrice = amount * 4.2;
                }
                break;
        }
        if (totalPrice != 0){
            System.out.printf("%.2f", totalPrice);
        }else {
            System.out.println("error");
        }
    }
}
