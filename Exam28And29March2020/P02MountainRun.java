package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForMetre = Double.parseDouble(scanner.nextLine());

        double delayTimes = Math.floor(distance/50);
        double realDelay = delayTimes * 30;
        double personalTime = timeForMetre * distance + realDelay;
        if (personalTime<record){
            System.out.printf("Yes! The new record is %.2f seconds.",personalTime);
        }else {
            System.out.printf("No! He was %.2f seconds slower.",Math.abs(record-personalTime));
        }

    }
}
