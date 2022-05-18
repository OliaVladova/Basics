package SoftUni.Basics.NestedLoopsLecture;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        while (!destination.equals("End")){
            String location = destination;
            double needed = Double.parseDouble(scanner.nextLine());
            double money = 0;
            while (money<needed){
                double price = Double.parseDouble(scanner.nextLine());
                money+=price;
            }
                System.out.printf("Going to %s!\n",location);

            destination = scanner.nextLine();
        }
    }
}
