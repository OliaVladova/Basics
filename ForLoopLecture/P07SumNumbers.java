package SoftUni.Basics.ForLoopLecture;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i;
        int sum = 0;
        for (i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.printf("%d",sum);
    }
}