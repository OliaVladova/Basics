package SoftUni.Basics.ExtraExercises.FirstSteps;

import java.util.Scanner;

public class P01TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double surface = (b1 + b2) * h / 2;
        System.out.printf("%.2f", surface);
    }
}