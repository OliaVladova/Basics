package SoftUni.Basics.Exam9and10March2019;

import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String kind = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        String photo = scanner.nextLine();

        double price = 0;
        double total = 0;
        double finalMoney = 0;

        switch (kind) {
            case "Standard":
                if (stage.equals("Quarter final")) {
                    price = 55.5;
                } else if (stage.equals("Semi final")) {
                    price = 75.88;
                } else if (stage.equals("Final")) {
                    price = 110.1;
                }
                break;
            case "Premium":
                if (stage.equals("Quarter final")) {
                    price = 105.2;
                } else if (stage.equals("Semi final")) {
                    price = 125.22;
                } else if (stage.equals("Final")) {
                    price = 160.66;
                }
                break;
            case "VIP":
                if (stage.equals("Quarter final")) {
                    price = 118.90;
                } else if (stage.equals("Semi final")) {
                    price = 300.4;
                } else if (stage.equals("Final")) {
                    price = 400;
                }
                break;
        }
        total = price * tickets;
        if (total > 4000) {
            finalMoney = total * 0.75;
        } else if (total > 2500) {
            finalMoney = total * 0.9;
        } else {
            finalMoney = total;
        }
        if (photo.equals("Y") && finalMoney <= 3999) {
            finalMoney += 40 * tickets;
        }
        System.out.printf("%.2f", finalMoney);
    }
}
