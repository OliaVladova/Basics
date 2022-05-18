package SoftUni.Basics.ExtraExercises.ForLoop;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heritage = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        double spendMoney = 0;
        int age = 18;
        for (int i = 1800;i<=year;i++){

            if (i%2==0){
                heritage -=12000;
            }else {
                heritage -= 12000+50*age;
            }
            age++;
        }
        if (heritage>=0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",Math.abs(spendMoney-heritage));
        }else {
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(spendMoney-heritage));
        }
    }
}
