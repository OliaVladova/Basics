package SoftUni.Basics.ExtraExercises.ConditionalStatement;

import java.util.Scanner;

public class P07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = (magnolias * 3.25) + (hyacinths * 4) + (roses * 3.50) +(cactus * 8);
        double finalMoney = 0.95 * totalPrice;
        if (finalMoney >= presentPrice){
            System.out.printf("She is left with %.0f leva.", Math.floor(finalMoney - presentPrice));
        }else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(presentPrice - finalMoney));
        }
    }
}
