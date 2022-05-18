package SoftUni.Basics.ExtraExercises.ConditionalStatement;

import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int extraHours = Integer.parseInt(scanner.nextLine());

        double workingHours = (days - 0.1*days) * 8;
        double extraWorking = extraHours* (2 * days);
        double allHours = Math.floor(workingHours + extraWorking);
        if (allHours >= neededHours){
            System.out.printf("Yes!%.0f hours left.", allHours - neededHours);
        }else {
            System.out.printf("Not enough time!%.0f hours needed.", neededHours - allHours);

        }
    }
}
