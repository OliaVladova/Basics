package SoftUni.Basics.Exam9and10March2019;

import java.util.Scanner;

public class P03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String instrument = scanner.nextLine();

        double difficulty = 0;
        double performance = 0;
        double score = 0;

        switch (instrument){
            case "ribbon":
                if (country.equals("Russia")){
                    difficulty = 9.1;
                    performance = 9.4;
                }else if (country.equals("Bulgaria")){
                    difficulty = 9.6;
                    performance = 9.4;
                }else if (country.equals("Italy")){
                    difficulty = 9.2;
                    performance = 9.5;
                }
                break;
            case "hoop":
                if (country.equals("Russia")){
                    difficulty = 9.3;
                    performance = 9.8;
                }else if (country.equals("Bulgaria")){
                    difficulty = 9.55;
                    performance = 9.75;
                }else if (country.equals("Italy")){
                    difficulty = 9.45;
                    performance = 9.35;
                }
                break;
            case "rope":
                if (country.equals("Russia")){
                    difficulty = 9.6;
                    performance = 9;
                }else if (country.equals("Bulgaria")){
                    difficulty = 9.5;
                    performance = 9.4;
                }else if (country.equals("Italy")){
                    difficulty = 9.7;
                    performance = 9.15;
                }
                break;
        }
        score = difficulty+performance;
        double needed = 20-score;
        double percent = (needed/20)*100;

        System.out.printf("The team of %s get %.3f on %s.\n",country,score,instrument);
        System.out.printf("%.2f%%",percent);

    }
}
