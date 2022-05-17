package SoftUni.Basics.Exam9and10March2019;

import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racket = Double.parseDouble(scanner.nextLine());
        int numRackets = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());

        double priceRackets = racket*numRackets;
        double priceSneakers = sneakers*(racket/6);
        double rest = (priceRackets+priceSneakers)*0.2;
        double total =priceRackets+priceSneakers+rest;
        double Djokovic =Math.floor(total/8);
        double sponsors  = Math.ceil(total*7/8);

        System.out.printf("Price to be paid by Djokovic %.0f\n",Djokovic);
        System.out.printf("Price to be paid by sponsors %.0f",sponsors);
    }
}
