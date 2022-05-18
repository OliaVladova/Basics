package SoftUni.Basics.FirstStepsExercise;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double stock = Double.parseDouble(scanner.nextLine());
        int timelimit = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());
        double percent = percentage/100;
        double interest = (stock*percent)/12;
        double price = stock + timelimit * interest;
        System.out.printf("%f", price);

    }
}
