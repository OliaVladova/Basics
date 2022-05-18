package SoftUni.Basics.WhileLoop;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        while (num<number){
            num+=Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("%d", num);
    }
}
