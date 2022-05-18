package SoftUni.Basics.WhileLoop;

import java.util.Scanner;

public class P08GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sumMarks = 0;
        int grade = 1;
        int counter = 0;
        while (grade <= 12) {
            double mark = Double.parseDouble(scanner.nextLine());
            if (mark>=4){
                grade++;
            }else if (mark < 4) {
                counter++;
            }
            if (counter >= 2) {
                break;
            }
            sumMarks += mark;

        }
        sumMarks /= 12;
        if (counter >= 2) {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumMarks);
        }
    }
}
