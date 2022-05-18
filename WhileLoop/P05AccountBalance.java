package SoftUni.Basics.WhileLoop;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        String command = scanner.nextLine();
        while (!command.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(command);
            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            total += sum;
            System.out.printf("Increase: %.2f\n", sum);
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",total);
    }
}
