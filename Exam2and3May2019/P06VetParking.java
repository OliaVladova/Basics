package SoftUni.Basics.Exam2and3May2019;

import java.util.Scanner;

public class P06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());


        double total = 0;
        for (int i=1;i<=days;i++){
            double perDay = 0;
            for (int j=1;j<=hours;j++){
                double price = 0;
                if (i%2==0&&j%2!=0){
                    price+=2.5;
                    total+=2.5;
                }else if (i%2!=0&&j%2==0){
                    price+=1.25;
                    total+=1.25;
                }else {
                    price+=1;
                    total+=1;
                }
                perDay+=price;
            }

            System.out.printf("Day: %d - %.2f leva\n",i,perDay);
        }
        System.out.printf("Total: %.2f leva",total);
    }
}
