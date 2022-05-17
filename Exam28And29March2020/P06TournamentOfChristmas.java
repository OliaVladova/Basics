package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double total = 0;

        int winer = 0;
        int loser = 0;
        for (int i = 1; i <= days; i++) {
            String command = scanner.nextLine();
            int countWins = 0;
            int countLoses = 0;
            double money = 0;
            while (!command.equals("Finish")) {
                String sport = command;
                while (sport.equals(sport)) {
                    String result = scanner.nextLine();
                    if (result.equals("win")) {
                        money += 20;
                        countWins++;
                    } else {
                        countLoses++;
                    }break;
                }
                command = scanner.nextLine();
            }
            if (countWins > countLoses) {
                money += money * 0.10;
                winer++;
            } else {
                loser++;
            }
            total += money;
        }
        if (winer > loser) {
            total = total * 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f",total);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f",total);
        }
    }
}
