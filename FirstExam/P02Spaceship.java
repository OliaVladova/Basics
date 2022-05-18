package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P02Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double average = Double.parseDouble(scanner.nextLine());

        double volume = width * length * height;
        double astronaut = 2 * 2 * (average + 0.4);
        double totalAstronaut = Math.floor(volume / astronaut);
        if (totalAstronaut < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (totalAstronaut >= 3 && totalAstronaut <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", totalAstronaut);

        } else {
            System.out.println("The spacecraft is too big.");
        }

    }
}
