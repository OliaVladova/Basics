package SoftUni.Basics.Exam9and10March2019;

import java.util.Scanner;

public class P01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        double sneakers = 0.6*fee;
        double outfit = 0.8*sneakers;
        double ball = outfit/4;
        double accessories = ball/5;
        double total = sneakers+outfit+ball+accessories+fee;

        System.out.printf("%.2f",total);
    }
}
