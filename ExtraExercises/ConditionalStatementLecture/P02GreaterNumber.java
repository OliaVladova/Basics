package SoftUni.Basics.ExtraExercises.ConditionalStatementLecture;

import java.util.Scanner;

public class P02GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        if (number > num){
            System.out.println(number);
        }else {
            System.out.println(num);
        }
    }
}
