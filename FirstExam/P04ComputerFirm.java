package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P04ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computers = Integer.parseInt(scanner.nextLine());
        double sumRate = 0;
        double purchase = 0;
        for (int i = 0;i<computers;i++){
            int num = Integer.parseInt(scanner.nextLine());
            int rate = num%10;
            sumRate+=rate;
           int possiblePurchase= num/10;
            if (rate==2){
                purchase += 0;
            }else if (rate==3){
                purchase += 0.5*possiblePurchase;
            }else if (rate==4){
                purchase += 0.7*possiblePurchase;
            }else if (rate==5){
                purchase += 0.85*possiblePurchase;
            }else if (rate==6){
                purchase += possiblePurchase;
            }
        }
        sumRate/=computers;
        System.out.printf("%.2f\n",purchase);
        System.out.printf("%.2f",sumRate);
    }
}
