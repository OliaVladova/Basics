package SoftUni.Basics.WhileLoopExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        double currMoney = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int counter = 0;
        int days = 0;

        while (command.equals("spend") || command.equals("save")) {
            double sum = Double.parseDouble(scanner.nextLine());
            days++;
            if (command.equals("spend")) {
                counter++;
                currMoney -= sum;
                if (currMoney < 0) {
                    currMoney = 0;
                }
            } else if (command.equals("save")) {
                counter=0;
                currMoney += sum;
            }
            if (counter == 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d", days);
                break;
            }
            if (currMoney >= trip) {
                System.out.printf("You saved the money for %d days.", days);
                break;
            }

            command = scanner.nextLine();
        }
    }
}
