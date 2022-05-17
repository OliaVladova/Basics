package SoftUni.Basics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0;

        switch (projection){
            case "Premiere":
                totalMoney = (rows * columns) * 12;
                break;
            case "Normal":
                totalMoney = (rows * columns) * 7.5;
                break;
            case "Discount":
                totalMoney = (rows * columns) * 5;
                break;
        }
        System.out.printf("%.2f leva", totalMoney);

    }
}
