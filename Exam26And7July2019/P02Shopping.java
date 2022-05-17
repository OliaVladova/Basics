package SoftUni.Basics.Exam26And7July2019;

import java.util.Scanner;

public class P02Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCard * 250;
        double processorsMoney = 0.35 * videoCardPrice * processors;
        double ramMoney = 0.1 * videoCardPrice * ram;
        double total = videoCardPrice + processorsMoney + ramMoney;
        if (videoCard > processors) {
            total *= 0.85;
        }
        if (total<=budget){
            System.out.printf("You have %.2f leva left!",Math.abs(total-budget));
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(total-budget));
        }
    }
}
