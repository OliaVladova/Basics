package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P03CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kg = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double overKg = 0;
        double total = 0;
        double overDistance = 0;
        switch (type) {
            case "standard":
                if (kg < 1) {
                    price = distance * 0.03;
                } else if (kg < 10) {
                    price = distance * 0.05;
                } else if (kg < 40) {
                    price = distance * 0.1;
                } else if (kg < 90) {
                    price = distance * 0.15;
                } else if (kg < 150) {
                    price = distance * 0.2;
                }
                break;
            case "express":
                if (kg < 1) {
                    price = distance * 0.03 ;
                    overKg = 0.8 * 0.03;
                    overDistance = distance*overKg*kg;
                    total = price + overDistance;
                    price = total;
                } else if (kg < 10) {
                    price = distance * 0.05;
                    overKg = 0.4 * 0.05;
                    overDistance = distance*overKg*kg;
                    total = price + overDistance;
                    price = total;
                } else if (kg < 40) {
                    price = distance * 0.1;
                    overKg = 0.05 * 0.1;
                    overDistance = distance*overKg*kg;
                    total = price + overDistance;
                    price = total;
                } else if (kg < 90) {
                    price = distance * 0.15;
                    overKg = 0.02 * 0.15;
                    overDistance = distance*overKg*kg;
                    total = price + overDistance;
                    price = total;
                } else if (kg < 150) {
                    price = distance * 0.2;
                    overKg = 0.01 * 0.2;
                    overDistance = distance*overKg*kg;
                    total = price + overDistance;
                    price = total;
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", kg, price);
    }
}
