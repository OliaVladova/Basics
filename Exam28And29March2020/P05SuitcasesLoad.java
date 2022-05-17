package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int counter = 0;
        boolean isFull = false;
        while (!command.equals("End")) {
            double suitcases = Double.parseDouble(command);

            capacity -= suitcases;
            if (capacity <= 0) {
                isFull = true;
                break;
            }
            counter++;
            if (counter % 3 == 0) {
                suitcases = suitcases * 0.1;
                capacity -= suitcases;
            }
            command = scanner.nextLine();
        }
        if (!isFull){
            System.out.println("Congratulations! All suitcases are loaded!");
        }else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.",counter);
    }
}
