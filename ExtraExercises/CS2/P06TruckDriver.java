package SoftUni.Basics.ExtraExercises.CS2;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        double salary = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kmPerMonth <= 5000) {
                    salary = (0.75 * kmPerMonth) * 4;
                } else if (kmPerMonth <= 10000) {
                    salary = (0.95 * kmPerMonth) * 4;
                } else if (kmPerMonth <= 20000) {
                    salary = (1.45 * kmPerMonth) * 4;
                }
                break;
            case "Summer":
                if (kmPerMonth <= 5000) {
                    salary = (0.90 * kmPerMonth) * 4;
                } else if (kmPerMonth <= 10000) {
                    salary = (1.1 * kmPerMonth) * 4;
                } else if (kmPerMonth <= 20000) {
                    salary = (1.45 * kmPerMonth) * 4;
                }
                break;
            case "Winter":
                if (kmPerMonth <= 5000) {
                    salary = (1.05 * kmPerMonth) * 4;
                } else if (kmPerMonth <= 10000) {
                    salary = (1.25 * kmPerMonth) * 4;
                } else if (kmPerMonth <= 20000) {
                    salary = (1.45 * kmPerMonth) * 4;
                }
                break;
        }
        salary *= 0.9;
        System.out.printf("%.2f", salary);
    }
}
