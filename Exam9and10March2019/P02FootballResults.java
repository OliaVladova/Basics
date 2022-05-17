package SoftUni.Basics.Exam9and10March2019;

import java.util.Scanner;

public class P02FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        int firstNumResult1 = Integer.parseInt(first.split(":")[0]);
        int secondNumResult1 = Integer.parseInt(first.split(":")[1]);
        int firstNumResult2 = Integer.parseInt(second.split(":")[0]);
        int secondNumResult2 = Integer.parseInt(second.split(":")[1]);
        int firstNumResult3 = Integer.parseInt(third.split(":")[0]);
        int secondNumResult3 = Integer.parseInt(third.split(":")[1]);
        int wins = 0;
        int losses = 0;
        int draws = 0;

        if (firstNumResult1 > secondNumResult1) {
            wins++;
        } else if (firstNumResult1 < secondNumResult1) {
            losses++;
        } else {
            draws++;
        }
        if (firstNumResult2 > secondNumResult2) {
            wins++;
        } else if (firstNumResult2 < secondNumResult2) {
            losses++;
        } else {
            draws++;
        }
        if (firstNumResult3 > secondNumResult3) {
            wins++;
        } else if (firstNumResult3 < secondNumResult3) {
            losses++;
        } else {
            draws++;
        }

        System.out.printf("Team won %d games.\n", wins);
        System.out.printf("Team lost %d games.\n", losses);
        System.out.printf("Drawn games: %d", draws);
    }
}
