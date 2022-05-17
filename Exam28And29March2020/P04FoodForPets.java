package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());
        double dogFood = 0;
        double catFood = 0;
        double biscuits = 0;
        double total = 0;
        double totalPercent = 0;
        double dogFoodPercent = 0;
        double catFoodPercent = 0;
        for (int i = 1; i<=days;i++){
            int dog = Integer.parseInt(scanner.nextLine());
            int cat = Integer.parseInt(scanner.nextLine());
            dogFood+=dog;
            catFood+=cat;
            int foodForToday = cat + dog;
            if (i%3==0){
                biscuits +=foodForToday*0.1;
            }
        }
        total = dogFood + catFood;
        totalPercent= total/allFood * 100;
        dogFoodPercent=dogFood/total*100;
        catFoodPercent=catFood/total*100;
        System.out.printf("Total eaten biscuits: %.0fgr.\n",biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n",totalPercent);
        System.out.printf("%.2f%% eaten from the dog.\n",dogFoodPercent);
        System.out.printf("%.2f%% eaten from the cat.",catFoodPercent);
    }
}
