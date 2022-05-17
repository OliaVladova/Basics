package SoftUni.Basics.Exam6And7April2019;

import java.util.Scanner;

public class P03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String room = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double finalMoney = 0;

        switch (movie) {
            case "A Star Is Born":
                if (room.equals("normal")) {
                    finalMoney = number * 7.5;
                } else if (room.equals("luxury")) {
                    finalMoney = number * 10.5;
                } else if (room.equals("ultra luxury")) {
                    finalMoney = number * 13.5;
                }
                break;
            case "Bohemian Rhapsody":
                if (room.equals("normal")) {
                    finalMoney = number * 7.35;
                } else if (room.equals("luxury")) {
                    finalMoney = number * 9.45;
                } else if (room.equals("ultra luxury")) {
                    finalMoney = number * 12.75;
                }
                break;
            case "Green Book":
                if (room.equals("normal")) {
                    finalMoney = number * 8.15;
                } else if (room.equals("luxury")) {
                    finalMoney = number * 10.25;
                } else if (room.equals("ultra luxury")) {
                    finalMoney = number * 13.25;
                }
                break;
            case "The Favourite":
                if (room.equals("normal")) {
                    finalMoney = number * 8.75;
                } else if (room.equals("luxury")) {
                    finalMoney = number * 11.55;
                } else if (room.equals("ultra luxury")) {
                    finalMoney = number * 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.",movie, finalMoney);
    }
}
