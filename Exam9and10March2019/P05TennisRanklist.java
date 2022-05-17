package SoftUni.Basics.Exam9and10March2019;

import java.util.Scanner;

public class P05TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int pointsAll = 0;
        int wins = 0;
        double average = 0;
        double percentage = 0;

        for (int i =1;i<=tournaments;i++){
            String stage = scanner.nextLine();

            if (stage.equals("W")) {
                points+=2000;
                wins+=1;
            }else if (stage.equals("F")){
                points+=1200;
            }else if (stage.equals("SF")){
                points+=720;
            }
        }
        pointsAll=points+startPoints;
        average=Math.floor(points*1.0/tournaments);
        percentage=(wins*1.0/tournaments)*100;
        System.out.printf("Final points: %d\n",pointsAll);
        System.out.printf("Average points: %.0f\n",average);
        System.out.printf("%.2f%%",percentage);


    }
}
