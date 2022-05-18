package SoftUni.Basics.ForLoopLecture;

import java.util.Scanner;

public class P02NumbersNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i;
        for (i = n; i>=1; i--){
            System.out.println(i);
        }
    }
}
