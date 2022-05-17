package SoftUni.Basics.Exam26And7July2019;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double enter = Double.parseDouble(scanner.nextLine());
        double priceForSunbed = Double.parseDouble(scanner.nextLine());
        double priceForUmbrella = Double.parseDouble(scanner.nextLine());

        double enterMoney = enter * people;
        double umbrellas = Math.ceil(people*1.0/2)*priceForUmbrella;
        double sunbed = Math.ceil(0.75*people)*priceForSunbed;
        double total = enterMoney + umbrellas + sunbed;
        System.out.printf("%.2f lv.",total);
    }
}
