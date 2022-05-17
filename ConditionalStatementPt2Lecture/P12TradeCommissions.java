package SoftUni.Basics.ConditionalStatementPt2Lecture;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;
        switch (city){
            case "Sofia":
                if (sales>= 0 && sales<=500){
                   commission = 0.05 *sales;
                }else  if (sales > 500 && sales<=1000){
                    commission = 0.07 *sales;
                }else if (sales > 1000 && sales<=10000){
                    commission = 0.08 *sales;
                }else if (sales > 10000){
                    commission = 0.12 *sales;
                }
                break;
            case "Varna":
                if (sales>= 0 && sales<=500){
                    commission = 0.045 *sales;
                }else  if (sales > 500 && sales<=1000){
                    commission = 0.075 *sales;
                }else if (sales > 1000 && sales<=10000){
                    commission = 0.1 *sales;
                }else if (sales > 10000){
                    commission = 0.13 *sales;
                }
                break;
            case "Plovdiv":
                if (sales>= 0 && sales<=500){
                    commission = 0.055 *sales;
                }else  if (sales > 500 && sales<=1000){
                    commission = 0.08 *sales;
                }else if (sales > 1000 && sales<=10000){
                    commission = 0.12 *sales;
                }else if (sales > 10000){
                    commission = 0.145 *sales;
                }
                break;
        }
        if (commission != 0){
            System.out.printf("%.2f", commission);
        }else {
            System.out.println("error");
        }
    }
}
