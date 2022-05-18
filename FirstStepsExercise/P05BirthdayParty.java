package SoftUni.Basics.FirstStepsExercise;

import java.util.Scanner;

public class P05BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());
        double cake = 0.2 * rent;
        double drinks = cake - (cake * 0.45);
        double animator = rent/3.0;
        double price = rent + cake + drinks + animator;
        System.out.println(price);
    }
}
