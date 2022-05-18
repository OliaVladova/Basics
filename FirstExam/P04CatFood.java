package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P04CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int catsNum = Integer.parseInt(scanner.nextLine());
        int smallCats = 0;
        int bigCats = 0;
        int hugeCats = 0;
        double totalFood = 0;
        double kgFood = 0 ;
        double price = 0;
        for (int i = 1; i <= catsNum; i++) {
            double food = Double.parseDouble(scanner.nextLine());
            if (food >= 100 && food < 200) {
                smallCats++;
            } else if (food < 300) {
                bigCats++;
            } else if (food < 400) {
                hugeCats++;
            }
            totalFood+=food;
        }
        kgFood = totalFood/1000;
        price = kgFood * 12.45;
        System.out.printf("Group 1: %d cats.\n",smallCats);
        System.out.printf("Group 2: %d cats.\n",bigCats);
        System.out.printf("Group 3: %d cats.\n",hugeCats);
        System.out.printf("Price for food per day: %.2f lv.",price);
    }
}
