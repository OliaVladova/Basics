package SoftUni.Basics.ExtraExercises.ConditionalStatement;

import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double gas = quantity * 0.93;
        double gasoline = quantity * 2.22;
        double diesel = quantity * 2.33;
        if (card.equals("Yes")) {
            gas -= 0.08 * quantity;
            gasoline -= 0.18 * quantity;
            diesel -= 0.12 * quantity;
        }if (quantity>= 20 && quantity<=25){
            gas-=0.08*gas;
            gasoline-=0.08*gasoline;
            diesel-=0.08*diesel;
        }else if (quantity>25){
            gas-=0.10*gas;
            gasoline-=0.10*gasoline;
            diesel-=0.10*diesel;
        }
        if (type.equals("Gas")){
            System.out.printf("%.2f lv.", gas);
        }else if (type.equals("Gasoline")){
            System.out.printf("%.2f lv.", gasoline);
        }else if (type.equals("Diesel")){
            System.out.printf("%.2f lv.", diesel);
        }
    }
}
