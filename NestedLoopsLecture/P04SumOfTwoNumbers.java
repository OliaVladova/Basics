package SoftUni.Basics.NestedLoopsLecture;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i+j==magicNum){
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",counter,i,j,magicNum);
                }

            }
            if (isFound){
                break;
            }
        }
        if (!isFound){
            System.out.printf("%d combinations - neither equals %d",counter,magicNum);
        }
    }
}
