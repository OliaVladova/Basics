package SoftUni.Basics.ForLoopExercise;

import java.util.Scanner;

public class P04Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int lessThenTwoHundreds = 0;
        int lessThenFourHundreds = 0;
        int lessThenSixHundreds = 0;
        int lessThenEightHundreds = 0;
        int moreThenEightHundreds = 0;
        double p1;
        double p2;
        double p3;
        double p4;
        double p5;
        int i;
        for (i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 200) {
                lessThenTwoHundreds += 1;
            } else if (num < 400) {
                lessThenFourHundreds += 1;
            } else if (num < 600) {
                lessThenSixHundreds += 1;
            } else if (num < 800) {
                lessThenEightHundreds += 1;
            } else {
                moreThenEightHundreds++;
            }
        }
        p1 = (lessThenTwoHundreds * 1.0 / n) * 100;
        p2 = (lessThenFourHundreds * 1.0 / n) * 100;
        p3 = (lessThenSixHundreds * 1.0 / n) * 100;
        p4 = (lessThenEightHundreds * 1.0 / n) * 100;
        p5 = (moreThenEightHundreds * 1.0 / n) * 100;
        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%", p5);
    }
}
