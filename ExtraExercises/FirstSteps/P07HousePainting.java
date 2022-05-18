package SoftUni.Basics.ExtraExercises.FirstSteps;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double frontAndBack = 2*(x*x) - (1.2*2);
        double side = 2*(x*y) - 2*(1.5*1.5);
        double roofRectangle = 2*(x*y);
        double roofTriangle = 2*((x*h)/2);
        double greenPaint = (frontAndBack+side)/3.4;
        double redPaint = (roofRectangle+roofTriangle)/4.3;
        System.out.printf("%.2f\n", greenPaint);
        System.out.printf("%.2f", redPaint);

    }
}
