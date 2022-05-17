package SoftUni.Basics.Exam2and3May2019;

import java.util.Scanner;

public class P05DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        double counterTwo = 0;
        double counterThree = 0;
        double counterFour = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        int counter = 0;
        for (int i = 0; i < numbers; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num%2==0){
                counterTwo++;
            }
            if (num%3==0){
                counterThree++;
            }
            if (num%4==0){
                counterFour++;
            }
            counter++;
        }
        p1=counterTwo/counter*100;
        p2=counterThree/counter*100;
        p3=counterFour/counter*100;

        System.out.printf("%.2f%%\n",p1);
        System.out.printf("%.2f%%\n",p2);
        System.out.printf("%.2f%%",p3);
    }
}
