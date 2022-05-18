package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P06UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= first; i++) {
            if ( i% 2 == 0) {
            for (int j = 2; j <= second; j++) {
                boolean isPrime = true;

                if (j!=2 && j%2==0){
                    isPrime = false;
                }else if (j!=3 && j%3==0){
                    isPrime = false;
                }else if (j!=5 && j%5==0){
                    isPrime = false;
                }if (j!=7 && j%7==0){
                    isPrime = false;
                }
                if (isPrime) {
                    for (int k = 1; k <= third; k++) {
                        if (k%2==0) {
                            System.out.printf("%d %d %d\n", i, j, k);
                            // boolean firstEven = i % 2 == 0;
                            //boolean thirdEven = j % 2 == 0;

                            }
                        }
                    }
                }
            }
        }
    }
}
