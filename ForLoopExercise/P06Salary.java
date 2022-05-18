package SoftUni.Basics.ForLoopExercise;

import java.util.Scanner;

public class P06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int lostMoney = 0;
        int counterForFacebook = 0;
        int counterForInstagram = 0;
        int counterForReddit = 0;
        int i;
        for (i = 0; i < n; i++) {
            String tabs = scanner.nextLine();
            switch (tabs) {
                case "Facebook":
                    counterForFacebook++;
                    break;
                case "Instagram":
                    counterForInstagram++;
                    break;
                case "Reddit":
                    counterForReddit += 1;
                    break;
            }
        }
        lostMoney = (counterForFacebook * 150) + (counterForInstagram * 100) + (counterForReddit * 50);
        if (lostMoney<salary){
            System.out.printf("%d", Math.abs(lostMoney-salary));
        }else {
            System.out.println("You have lost your salary.");
        }
    }
}
