package SoftUni.Basics.ForLoopExercise;

import java.util.Scanner;

public class P05DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countForTwo = 0;
        int countForThree = 0;
        int countForFour = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        int i;
        for (i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 2 == 0) {
                countForTwo++;
            }  if (num % 3 == 0) {
                countForThree++;
            }  if (num % 4 == 0) {
                countForFour++;
            }
        }
        p1 = (countForTwo * 1.0 / n) * 100;
        p2 = (countForThree * 1.0 / n) * 100;
        p3 = (countForFour * 1.0 / n) * 100;
        System.out.printf("%.2f%%\n",p1);
        System.out.printf("%.2f%%\n",p2);
        System.out.printf("%.2f%%",p3);
    }
}
