package SoftUni.Basics.NestedLoopsLecture;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int a;
        int b;
        int c;
        int counter = 0;
        for (a = 0; a <= number; a++) {
            for (b = 0; b <= number; b++) {
                for (c = 0; c <= number; c++) {
                    if (a + b + c == number) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
