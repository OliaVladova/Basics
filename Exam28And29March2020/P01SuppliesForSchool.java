package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P01SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pencils = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double litres = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pencilPrice = pencils * 5.80;
        double markersPrice = markers * 7.20;
        double litresPrice = litres * 1.20;
        double sum = pencilPrice + markersPrice + litresPrice;
        double realDiscount = discount * 0.01;
        double totalPrice = sum - (sum*realDiscount);

        System.out.printf("%.3f",totalPrice);
    }
}
