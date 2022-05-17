package SoftUni.Basics.Exam2and3May2019;

import java.util.Scanner;

public class P03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double fee = 0;

        switch (time) {
            case "one":
                if (type.equals("Small")) {
                    fee = 9.98;
                } else if (type.equals("Middle")) {
                    fee = 18.99;
                } else if (type.equals("Large")) {
                    fee = 25.98;
                } else if (type.equals("ExtraLarge")) {
                    fee = 35.99;
                }
                if (internet.equals("yes")&&fee<=10){
                    fee+=5.5;
                }else if (internet.equals("yes")&&fee<=30){
                    fee+=4.35;
                }else if (internet.equals("yes")&&fee>30){
                    fee+=3.85;
                }
                break;
            case "two":
                if (type.equals("Small")) {
                    fee = 8.58;
                } else if (type.equals("Middle")) {
                    fee = 17.09;
                } else if (type.equals("Large")) {
                    fee = 23.59;
                } else if (type.equals("ExtraLarge")) {
                    fee = 31.79;
                }
                if (internet.equals("yes")&&fee<=10){
                    fee+=5.5;
                }else if (internet.equals("yes")&&fee<=30){
                    fee+=4.35;
                }else if (internet.equals("yes")&&fee>30){
                    fee+=3.85;
                }
                fee*=0.9625;
                break;
        }
        fee*=months;
        System.out.printf("%.2f lv.",fee);


    }
}
