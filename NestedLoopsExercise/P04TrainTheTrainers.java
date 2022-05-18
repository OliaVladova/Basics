package SoftUni.Basics.NestedLoopsExercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double firstPresentation = 0;
        double total = 0;
        int counter = 0;
        while (!command.equals("Finish")) {
            String presentation = command;
            double gradePresentation = 0;

            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradePresentation += grade;
                firstPresentation += grade;
            }
            gradePresentation /= n;
            counter++;
            System.out.printf("%s - %.2f.\n", presentation, gradePresentation);
            command = scanner.nextLine();
        }
        firstPresentation /= counter * n;
        System.out.printf("Student's final assessment is %.2f.", firstPresentation);
    }
}
