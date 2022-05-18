package SoftUni.Basics.ForLoopExercise;

import java.util.Scanner;

public class P03OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double OddSum = 0;
        double OddMin = Double.MAX_VALUE;
        double OddMax = Double.NEGATIVE_INFINITY;
        double EvenSum = 0;
        double EvenMin = Double.MAX_VALUE;
        double EvenMax = Double.NEGATIVE_INFINITY;
        int i;
        for (i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 != 0) {
                OddSum += num;
                if (num < OddMin) {
                    OddMin = num;
                }
                if (num >= OddMax) {
                    OddMax = num;
                }
            } else {
                EvenSum += num;
                if (num < EvenMin) {
                    EvenMin = num;
                }
                if (num > EvenMax) {
                    EvenMax = num;
                }
            }

        }
        System.out.printf("OddSum=%.2f,\n", OddSum);
        if (OddSum == 0) {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,\n", OddMin);
            System.out.printf("OddMax=%.2f,\n", OddMax);
        }
        System.out.printf("EvenSum=%.2f,\n", EvenSum);
        if (EvenSum == 0) {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,\n", EvenMin);
            System.out.printf("EvenMax=%.2f", EvenMax);
        }
    }
}
