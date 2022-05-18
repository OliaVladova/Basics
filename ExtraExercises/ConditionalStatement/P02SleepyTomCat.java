package SoftUni.Basics.ExtraExercises.ConditionalStatement;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());
        int daysWork = 365 - daysOff;
        int playTime = (daysOff * 127) + (daysWork * 63);
        int hours = 0;
        int minutes = 0;
        int difference = 0;
        if (playTime > 30000 ){
            System.out.println("Tom will run away");
            difference = playTime - 30000;
            hours = difference / 60;
            minutes = difference % 60;
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }else if (playTime< 30000){
            System.out.println("Tom sleeps well");
            difference = 30000 - playTime;
            hours = difference / 60;
            minutes = difference % 60;
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}
