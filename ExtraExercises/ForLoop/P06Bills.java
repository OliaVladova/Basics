package SoftUni.Basics.ExtraExercises.ForLoop;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        int i;
        double electricity = 0;
        double water = 0;
        double internet = 0;
        double other = 0;
        double average = 0;

        for (i = 1; i <= months; i++) {
            double bills = Double.parseDouble(scanner.nextLine());
            electricity += bills;
            water += 20;
            internet += 15;
            other += 1.2 * (bills + 20 + 15);
        }
        average = (electricity + water + internet + other) / months;
        System.out.printf("Electricity: %.2f lv\n", electricity);
        System.out.printf("Water: %.2f lv\n", water);
        System.out.printf("Internet: %.2f lv\n", internet);
        System.out.printf("Other: %.2f lv\n", other);
        System.out.printf("Average: %.2f lv", average);

    }
}
