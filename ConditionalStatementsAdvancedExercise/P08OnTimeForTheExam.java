package SoftUni.Basics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minuteArrive = Integer.parseInt(scanner.nextLine());

        int timeExam = (hourExam * 60) + minuteExam;
        int arriveTime = (hourArrive * 60) + minuteArrive;
        int time = 0;
        if (timeExam - 30 > arriveTime) {
            System.out.println("Early");
            int difference = timeExam - arriveTime;
            if (difference < 60) {
                System.out.printf("%d minutes before the start", difference);
            } else {
                int hour = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours before the start",hour,minutes);
            }

        } else if (arriveTime <= timeExam && arriveTime >= timeExam - 30) {
            int difference = timeExam - arriveTime;
            System.out.println("On time");
            if (difference>0) {
                System.out.printf("%d minutes before the start", difference);
            }

        } else if (arriveTime > timeExam) {
            System.out.println("Late");
            int difference = arriveTime - timeExam;
            if (difference < 60) {
                System.out.printf("%d minutes after  the start", difference);
            } else {
                int hour = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours after  the start",hour,minutes);
            }
        }

    }
}
