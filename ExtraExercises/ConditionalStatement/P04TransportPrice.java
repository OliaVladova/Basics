package SoftUni.Basics.ExtraExercises.ConditionalStatement;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double taxi = 0.7;
        double bus = 0.09;
        double train = 0.06;
        double taxiPrice = 0;
        double busPrice = 0;
        double trainPrice = 0;

        if ((time.equals("day") || time.equals("night")) && n >= 20) {
            busPrice = bus * n;
        }
        if ((time.equals("day") || time.equals("night")) && n >= 100) {
            trainPrice = train * n;
        }
        if (time.equals("day")) {
            taxiPrice = taxi + n * 0.79;
        } else if (time.equals("night")) {
            taxiPrice = taxi + n * 0.90;
        }
        if (taxiPrice < busPrice && taxiPrice < trainPrice && busPrice != 0 && trainPrice != 0) {
            System.out.printf("%.2f", taxiPrice);
        } else if (taxiPrice > busPrice && trainPrice > busPrice && busPrice != 0 && trainPrice != 0) {
            System.out.printf("%.2f", busPrice);
        } else if (taxiPrice > trainPrice && busPrice > trainPrice && busPrice != 0 && trainPrice != 0) {
            System.out.printf("%.2f", trainPrice);
        } else if (busPrice == 0 && trainPrice == 0) {
            System.out.printf("%.2f", taxiPrice);
        } else if (taxiPrice > busPrice && trainPrice < busPrice && busPrice != 0 && trainPrice == 0) {
            System.out.printf("%.2f", busPrice);
        }


    }
}
