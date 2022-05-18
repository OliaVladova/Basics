package SoftUni.Basics.NestedLoopsExercise;


import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int row;
        int current = 1;
        boolean isTrue = false;
        int column;
        for (row = 1; row <= n; row++) {
            for (column = 1; column <= row; column++) {
                if (current > n) {
                    isTrue = true;
                    break;
                }
                System.out.printf(current + " ");
                current++;
            }
            System.out.println();
            if (isTrue) {
                break;
            }
        }
    }
}
