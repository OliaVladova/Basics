package SoftUni.Basics.ExtraExercises.ForLoop;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int i;
        double counterA = 0;
        double counterB = 0;
        double counterV = 0;
        double counterG = 0;
        for (i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
            if (sector.equals("A")) {
                counterA++;
            } else if (sector.equals("B")) {
                counterB++;
            } else if (sector.equals("V")) {
                counterV++;
            } else if (sector.equals("G")) {
                counterG++;
            }
        }
        counterA = counterA / fans * 100;
        counterB = counterB / fans * 100;
        counterV = counterV / fans * 100;
        counterG = counterG / fans * 100;
        System.out.printf("%.2f%%\n", counterA);
        System.out.printf("%.2f%%\n", counterB);
        System.out.printf("%.2f%%\n", counterV);
        System.out.printf("%.2f%%\n", counterG);
        System.out.printf("%.2f%%", fans * 1.0 / capacity * 100);
    }
}
