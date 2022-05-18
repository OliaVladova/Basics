package SoftUni.Basics.ForLoopExercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++){
            int num = Integer.parseInt(scanner.nextLine());
            if (num>max){
                max = num;
            }else if (num<min){
                min = num;
            }
            sum+=num;

        }sum-=max;
        if (sum == max){
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(max-sum));
        }
    }
}
