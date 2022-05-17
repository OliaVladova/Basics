package SoftUni.Basics.Exam26And7July2019;

import java.util.Scanner;

public class P01Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double totalPaint = 1.1*paint;
        double totalNylon = nylon + 2;
        double moneyForMaterials = totalPaint*14.5 + totalNylon*1.5 +thinner *5 + 0.4;
        double moneyForWorkers = (moneyForMaterials * 0.3)*workHours;
        double total = moneyForMaterials + moneyForWorkers;
        System.out.printf("Total expenses: %.2f lv.",total);
    }
}
