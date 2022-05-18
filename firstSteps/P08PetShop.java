package SoftUni.Basics.firstSteps;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDogs = Integer.parseInt(scanner.nextLine());
        int numberAll = Integer.parseInt(scanner.nextLine());
        double priceDogs = numberDogs * 2.50;
        double priceAll = numberAll * 4;
        System.out.println(priceDogs+priceAll);
    }
}
