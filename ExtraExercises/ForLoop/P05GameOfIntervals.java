package SoftUni.Basics.ExtraExercises.ForLoop;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());
        int i;
        double points = 0;
        double counterZeroToNine = 0;
        double counterTenToNineteen = 0;
        double counterTwenties = 0;
        double counterThirties = 0;
        double counterFourties = 0;
        double counterInvalid = 0;
        for (i = 0; i < moves; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num >= 0 && num <= 9) {
                points += num * 0.2;
                counterZeroToNine++;
            } else if (num >= 10 && num <= 19) {
                points += num * 0.3;
                counterTenToNineteen++;
            } else if (num >= 20 && num <= 29) {
                points += num * 0.4;
                counterTwenties++;
            } else if (num >= 30 && num <= 39) {
                points += 50;
                counterThirties++;
            } else if (num >= 40 && num <= 50) {
                points += 100;
                counterFourties++;
            } else {
                points /= 2;
                counterInvalid++;
            }
        }
        counterZeroToNine = counterZeroToNine /moves * 100;
        counterTenToNineteen = counterTenToNineteen /moves * 100;
        counterTwenties = counterTwenties /moves * 100;
        counterThirties = counterThirties /moves * 100;
        counterFourties = counterFourties /moves * 100;
        counterInvalid = counterInvalid /moves * 100;
        System.out.printf("%.2f\n", points);
        System.out.printf("From 0 to 9: %.2f%%\n", counterZeroToNine);
        System.out.printf("From 10 to 19: %.2f%%\n", counterTenToNineteen);
        System.out.printf("From 20 to 29: %.2f%%\n", counterTwenties);
        System.out.printf("From 30 to 39: %.2f%%\n", counterThirties);
        System.out.printf("From 40 to 50: %.2f%%\n", counterFourties);
        System.out.printf("Invalid numbers: %.2f%%", counterInvalid);
    }
}
