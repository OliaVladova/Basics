package SoftUni.Basics.ForLoopLecture;

import java.util.Scanner;

public class P04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i;
        int num = 1;
        for (i =0;i<=n; i= i +2){
            System.out.println(num);
             num = num*2*2;

        }
    }
}
