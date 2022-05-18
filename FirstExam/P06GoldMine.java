package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 1;i<=locations;i++){
            double averageYield = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double average = 0;
            for (int j = 1;j<=days;j++){
                double yieldPerDay = Double.parseDouble(scanner.nextLine());
                average+=yieldPerDay;
            }
            average/=days;
            if (average>=averageYield){
                System.out.printf("Good job! Average gold per day: %.2f.\n",average);
            }else {
                System.out.printf("You need %.2f gold.\n",Math.abs(average-averageYield));
            }
        }
    }
}
