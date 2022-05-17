package SoftUni.Basics.Exam9and10March2019;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secsForHundred = Integer.parseInt(scanner.nextLine());

        int neededSec = minutes*60+seconds;
        double timesDecrease = length/120;
        double decrease = timesDecrease*2.5;
        double totalTime = (length/100)*secsForHundred-decrease;

        if (totalTime<=neededSec){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",totalTime);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",Math.abs(totalTime-neededSec));
        }
    }
}
