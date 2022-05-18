package SoftUni.Basics.ExtraExercises.ForLoop;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalStudents = Integer.parseInt(scanner.nextLine());
        int i;
        double countFail = 0;
        double countThree = 0;
        double countFour = 0;
        double moreThenFive = 0;
        double average = 0;

        for (i = 1; i <= totalStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 2.00 && grade <= 2.99) {
                countFail++;
            } else if (grade >= 3.00 && grade <= 3.99) {
                countThree++;
            } else if (grade >= 4.00 && grade <= 4.99) {
                countFour++;
            } else if (grade >= 5.00) {
                moreThenFive++;
            }
            average += grade;
        }
        moreThenFive = moreThenFive/totalStudents * 100;
        countFour = countFour/totalStudents * 100;
        countThree = countThree/totalStudents * 100;
        countFail = countFail/totalStudents * 100;
        average = average/totalStudents;
        System.out.printf("Top students: %.2f%%\n", moreThenFive);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", countFour);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", countThree);
        System.out.printf("Fail: %.2f%%\n", countFail);
        System.out.printf("Average: %.2f", average);
    }
}
