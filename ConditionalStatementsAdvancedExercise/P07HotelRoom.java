package SoftUni.Basics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartment = 0;

        switch (month) {
            case "May":
            case "October":
                studio = 50 * days;
                apartment = 65 * days;
                if (days > 7 && days < 14) {
                    studio *= 0.95;
                } else if (days >= 14) {
                    studio *= 0.7;
                    apartment = (65 * days) * 0.9;
                }
                break;
            case "June":
            case "September":
                studio = 75.2 * days;
                apartment = 68.7 * days;
                if (days > 14) {
                    studio *= 0.8;
                    apartment = (68.7 * days) * 0.9;
                }
                break;
            case "July":
            case "August":
                studio = 76 * days;
                apartment = 77 * days;
                if (days > 14) {
                    apartment = apartment * 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}
