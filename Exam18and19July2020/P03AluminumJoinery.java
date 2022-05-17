package SoftUni.Basics.Exam18and19July2020;

import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String kind = scanner.nextLine();
        String shipping = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;
    switch (kind){
        case "90X130":
            price = 110;
            if (number>30&&number<=60){
                price *= 0.95;
            }else if (number>60){
                price *= 0.92;
            }
            break;
        case "100X150":
            price = 140;
            if (number>40&& number<=80){
                price *= 0.94;
            }else if (number>80){
                price *= 0.9;
            }
            break;
        case "130X180":
            price = 190;
            if (number>20 && number<=50){
                price *= 0.93;
            }else if (number>50){
                price *= 0.88;
            }
            break;
        case "200X300":
            price = 250;
            if (number>25 && number<=50){
                price *= 0.91;
            }else if (number>50){
                price *= 0.86;
            }
            break;
    }
    if (shipping.equals("With delivery")){
        totalPrice = price*number + 60;
    }else {
        totalPrice = price*number;
    }
        if (number>99){
            totalPrice*=0.96;
        }
    if (number<10){
        System.out.println("Invalid order");
    }else {
        System.out.printf("%.2f BGN", totalPrice);
    }

    }
}
