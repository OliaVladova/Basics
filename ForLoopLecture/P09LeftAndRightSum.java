package SoftUni.Basics.ForLoopLecture;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i;
        int sum1 = 0;
        int sum2 = 0;
        for (i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum1 += num;
        }
        for (i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum2 += num;
        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}
