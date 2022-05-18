package SoftUni.Basics.NestedLoopsExercise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        for (int i = num1; num1 <= num2; num1++) {

            int number = num1;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 6; j >= 0; j--) {
                int digit = number % 10;
                number = number / 10;
                if (j % 2 == 0){
                    evenSum+=digit;
                }else {
                    oddSum+=digit;
                }
            } if (evenSum==oddSum){
                System.out.printf("%d ",num1);
            }

        }
    }
}
