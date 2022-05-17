package SoftUni.Basics.ConditionalStatementExercise;

import java.util.Scanner;

public class P07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor(distance/15)*12.5;
        double timeIvan = distance*time + delay;
        if (timeIvan < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeIvan);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeIvan-record);
        }
    }
}
