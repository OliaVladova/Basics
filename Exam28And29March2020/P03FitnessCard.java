package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P03FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double cost = 0;

        switch (sport){
            case "Gym":
                if (gender.equals("m")){
                    cost = 42;
                }else if (gender.equals("f")){
                    cost = 35;
                }
                break;
            case "Boxing":
                if (gender.equals("m")){
                    cost = 41;
                }else if (gender.equals("f")){
                    cost = 37;
                }
                break;
            case "Yoga":
                if (gender.equals("m")){
                    cost = 45;
                }else if (gender.equals("f")){
                    cost = 42;
                }
                break;
            case "Zumba":
                if (gender.equals("m")){
                    cost = 34;
                }else if (gender.equals("f")){
                    cost = 31;
                }
                break;
            case "Dances":
                if (gender.equals("m")){
                    cost = 51;
                }else if (gender.equals("f")){
                    cost = 53;
                }
                break;
            case "Pilates":
                if (gender.equals("m")){
                    cost = 39;
                }else if (gender.equals("f")){
                    cost = 37;
                }
                break;

        }
        if (age<=19){
            cost*=0.8;
        }
        if (cost<=money){
            System.out.printf("You purchased a 1 month pass for %s.",sport);
        }else {
            System.out.printf("You don't have enough money! You need $%.2f more.",Math.abs(cost-money));
        }
    }
}
