package SoftUni.Basics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekends = Integer.parseInt(scanner.nextLine());
         double sofiaWeekends = 48-weekends;
         double sofiaPlay = sofiaWeekends *3.0/4;
         double playHome = weekends;
         double holidayPlay = holidays * 2.0/3;
         double allGames = playHome + sofiaPlay + holidayPlay;
         switch (year){
             case "leap":
                 allGames*=1.15;
                 break;
         }
         allGames = Math.floor(allGames);
        System.out.printf("%.0f", allGames);

    }
}
