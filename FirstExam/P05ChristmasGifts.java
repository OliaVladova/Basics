package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P05ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int underSixteen = 0;
        int overSixteen = 0;
        double toys = 0;
        double sweater = 0;
        while (!command.equals("Christmas")){
            int age = Integer.parseInt(command);

            if (age<=16){
                underSixteen++;
            }else {
                overSixteen++;
            }
            command = scanner.nextLine();
        }
        toys = underSixteen*5;
        sweater = overSixteen*15;
        System.out.printf("Number of adults: %d\n",overSixteen);
        System.out.printf("Number of kids: %d\n",underSixteen);
        System.out.printf("Money for toys: %.0f\n",toys);
        System.out.printf("Money for sweaters: %.0f",sweater);
    }
}
