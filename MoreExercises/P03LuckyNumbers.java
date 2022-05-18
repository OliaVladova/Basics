package SoftUni.Basics.MoreExercises;

import java.util.Scanner;

public class P03LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < 10; i++) {
            if (i < number) {
                for (int j = 1; j < 10; j++) {
                    if (j < number) {

                        for (int k = 1; k < 10; k++) {
                            if (k < number) {
                                for (int l = 1; l < 10; l++) {
                                    if (l < number) {

                                        int numOne = i + j;
                                        int numTwo = k + l;
                                        if (numOne == numTwo) {
                                            if (number % numOne == 0) {
                                                System.out.printf("%d%d%d%d ", i, j, k, l);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}
