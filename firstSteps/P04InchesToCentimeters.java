package SoftUni.Basics.firstSteps;

import java.util.Scanner;

public class P04InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double intch = Double.parseDouble(scanner.nextLine());
        double cm = intch *2.54;
        System.out.println(cm);
    }
}
