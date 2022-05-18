package SoftUni.Basics.ForLoopLecture;

import java.util.Scanner;

public class P08Numbersequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (i=0;i<n;i++){
            int number = Integer.parseInt(scanner.nextLine());
            if (max<number){
                max=number;
            }
            if (min>number){
                min=number;
            }

        }
        System.out.printf("Max number: %d\n", max);
        System.out.printf("Min number: %d", min);
    }
}
