package SoftUni.Basics.WhileLoop;

import java.util.Scanner;

public class P04Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int i = 1;
        while (i <= num) {
            System.out.printf("%d\n", i);
            i = i * 2 + 1;
        }
    }
}
