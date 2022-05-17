package SoftUni.Basics.ConditionalStatementPt2Lecture;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        if (!day.equals("Sunday")){
            if (hour>= 10 && hour<=18){
                System.out.println("open");
            }else {
                System.out.println("closed");
            }
        }else {
            System.out.println("closed");
        }
    }
}
