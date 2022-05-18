package SoftUni.Basics.MoreExercises;

import java.util.Scanner;

public class P04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());



        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                for (int k = start; k <= end; k++) {
                    for (int l = start; l <= end; l++) {
                        boolean specialOne = false;
                        boolean specialTwo = false;
                        boolean specialThree = false;
                        int sum = j + k;
                        if (i % 2 == 0 && l % 2 != 0) {
                            specialOne = true;
                        } else if (i % 2 != 0 && l % 2 == 0) {
                            specialOne = true;
                        }
                        if (i > l) {
                            specialTwo = true;
                        }
                        if (sum % 2 == 0) {
                            specialThree = true;
                        }
                        if (specialThree && specialTwo && specialOne) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
