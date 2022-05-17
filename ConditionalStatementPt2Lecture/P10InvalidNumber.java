package SoftUni.Basics.ConditionalStatementPt2Lecture;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isTrue = (number>=100 && number<=200 || number==0);
        if (!isTrue){
            System.out.println("invalid");
        }
    }
}
