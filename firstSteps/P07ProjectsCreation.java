package SoftUni.Basics.firstSteps;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int hours = number * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s. ", name, hours, number);

    }
}
