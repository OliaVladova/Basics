package SoftUni.Basics.FirstStepsExercise;

import java.util.Scanner;

public class P08FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume = length * wide * height;
        double litres = volume * 0.001;
        double percentage = percent/100;
        double totalLitres = litres*(1-percentage);
        System.out.printf("%.2f", totalLitres);

    }
}
