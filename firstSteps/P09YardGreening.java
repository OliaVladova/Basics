package SoftUni.Basics.firstSteps;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double price = area * 7.61;
        double discount = 0.18 * price;
        double finalprice = price - discount;
        System.out.printf("The final price is: %f lv.", finalprice);
        System.out.printf("The discount is: %f lv.", discount);
    }
}
