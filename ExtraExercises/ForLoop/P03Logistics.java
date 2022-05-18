package SoftUni.Basics.ExtraExercises.ForLoop;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLoads = Integer.parseInt(scanner.nextLine());
        int i;
        double minibus = 0;
        double truck = 0;
        double train = 0;
        double totalPrice = 0;
        int totalTons = 0;
        for (i = 0; i < numberOfLoads; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            if (tons <= 3) {
                minibus += tons;
            } else if (tons <= 11) {
                truck += tons;
            } else {
                train += tons;
            }
            totalTons += tons;
        }
        totalPrice = (minibus * 200 + train * 120 + truck * 175) / totalTons;
        minibus = minibus / totalTons * 100;
        truck = truck / totalTons * 100;
        train = train / totalTons * 100;
        System.out.printf("%.2f\n", totalPrice);
        System.out.printf("%.2f%%\n", minibus);
        System.out.printf("%.2f%%\n", truck);
        System.out.printf("%.2f%%", train);

    }
}
