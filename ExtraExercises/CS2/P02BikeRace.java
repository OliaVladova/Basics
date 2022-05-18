package SoftUni.Basics.ExtraExercises.CS2;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorCyclist = Integer.parseInt(scanner.nextLine());
        int seniorCyclist = Integer.parseInt(scanner.nextLine());
        String route = scanner.nextLine();
        double fee = 0;

        switch (route) {
            case "trail":
                fee = (juniorCyclist * 5.50) + (seniorCyclist * 7);
                break;
            case "cross-country":
                fee = (juniorCyclist * 8) + (seniorCyclist * 9.5);
                break;
            case "downhill":
                fee = (juniorCyclist * 12.25) + (seniorCyclist * 13.75);
                break;
            case "road":
                fee = (juniorCyclist * 20) + (seniorCyclist * 21.5);
                break;
        }
        if (route.equals("cross-country") && (juniorCyclist + seniorCyclist) >= 50) {
            fee *= 0.75;
        }
        fee *= 0.95;
        System.out.printf("%.2f", fee);
    }
}
