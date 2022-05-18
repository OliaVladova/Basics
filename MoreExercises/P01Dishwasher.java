package SoftUni.Basics.MoreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBottles = Integer.parseInt(scanner.nextLine());
        int bottlesMl = numBottles * 750;
        String command = scanner.nextLine();
        int counterPlates = 0;
        int counterPots = 0;
        int days = 0;

        boolean noMoreDetergent = false;
        while (!command.equals("End")) {
            int numPlates = Integer.parseInt(command);
            days++;
            if (days % 3 == 0) {
                int detergent = 15*numPlates;
                bottlesMl -= detergent;
                counterPots += numPlates;
            } else {
                int detergent = 5*numPlates;
                bottlesMl -= detergent;
                counterPlates += numPlates;
            }
            if (bottlesMl < 0) {
                noMoreDetergent = true;
                break;
            }


            command = scanner.nextLine();
        }
        if (noMoreDetergent) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(bottlesMl));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", counterPlates, counterPots);
            System.out.printf("Leftover detergent %d ml.", Math.abs(bottlesMl));
        }
    }
}
