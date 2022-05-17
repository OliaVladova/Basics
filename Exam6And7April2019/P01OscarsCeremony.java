package SoftUni.Basics.Exam6And7April2019;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());
        double statuettes = 0.7 * rent;
        double catering = 0.85 * statuettes;
        double music = 0.5 * catering;
        double total = rent + statuettes + catering + music;
        System.out.printf("%.2f", total);
    }
}
