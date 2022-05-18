package SoftUni.Basics.ForLoopLecture;

import java.util.Scanner;

public class P03Numbers1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i;
        for (i=1;i<=n; i=i+3 ){
            System.out.println(i);
        }
    }
}
