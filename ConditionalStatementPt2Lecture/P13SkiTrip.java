package SoftUni.Basics.ConditionalStatementPt2Lecture;

import java.util.Scanner;

public class P13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String grade = scanner.nextLine();

        double totalPrice = 0;
        switch (roomType) {
            case "room for one person":
                totalPrice = (days - 1) * 18;
                break;
            case "apartment":
                if (days < 10) {
                    totalPrice = 0.7 * ((days - 1) * 25);
                } else if (days > 10 && days<=15){
                    totalPrice = 0.65 * ((days - 1) * 25);
                }else {
                    totalPrice = 0.5 * ((days - 1) * 25);
                }
                    break;
            case "president apartment":
                if (days < 10) {
                    totalPrice = 0.9 * ((days - 1) * 35);
                } else if (days > 10 && days<=15){
                    totalPrice = 0.85 * ((days - 1) * 35);
                }else {
                    totalPrice = 0.8 * ((days - 1) * 35);
                }
                break;
        }
        if (grade.equals("positive")){
            totalPrice = 1.25 * totalPrice;
        }else {
            totalPrice *= 0.9;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
