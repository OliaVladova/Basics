package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P05HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double money = 0;
        while (!command.equals("closed")){
            String service = command;
            switch (service){
                case "haircut":
                    String haircut = scanner.nextLine();
                    if (haircut.equals("mens")){
                        money+=15;
                    }else if (haircut.equals("ladies")){
                        money+=20;
                    }else if (haircut.equals("kids")){
                        money+=10;
                    }
                    break;
                case "color":
                    String kind = scanner.nextLine();
                    if (kind.equals("touch up")){
                        money+=20;
                    }else if (kind.equals("full color")) {
                        money += 30;
                    }
                        break;
            }
            if (money>=goal){
                System.out.println("You have reached your target for the day!" );
                break;
            }
            command = scanner.nextLine();
        }
        if (money<goal){
            System.out.printf("Target not reached! You need %.0flv. more.\n",Math.abs(goal-money));
        }
        System.out.printf("Earned money: %.0flv.",money);
    }
}
