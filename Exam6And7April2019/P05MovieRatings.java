package SoftUni.Basics.Exam6And7April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMovies = Integer.parseInt(scanner.nextLine());
        String bestMovie = "";
        String worstMovie = "";
        double sumRate = 0;
        double maxRate = Double.MIN_VALUE;
        double minRate = Double.MAX_VALUE;
        for (int i = 1; i <= numMovies; i++) {
            String name = scanner.nextLine();
            double rate = Double.parseDouble(scanner.nextLine());
            if (rate > maxRate) {
                maxRate = rate;
                bestMovie = name;
            } else if (rate < minRate) {
                minRate = rate;
                worstMovie = name;
            }
            sumRate+=rate;
        }
        sumRate/=numMovies;
        System.out.printf("%s is with highest rating: %.1f\n",bestMovie,maxRate);
        System.out.printf("%s is with lowest rating: %.1f\n",worstMovie,minRate);
        System.out.printf("Average rating: %.1f",sumRate);
    }
}
