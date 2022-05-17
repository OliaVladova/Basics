package SoftUni.Basics.Exam18and19July2020;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int max = 0;
        String best = "";
        boolean isTrue = false;
        while (!command.equals("END")) {
            String name = command;
            int points = Integer.parseInt(scanner.nextLine());
            if (points>max){
                max = points;
                best = name;
            }
            if (max>=3){
                isTrue = true;

            }
            if (points>=10){
                break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("%s is the best player!\n",best);
        if (isTrue){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",max);
        }else {
            System.out.printf("He has scored %d goals.",max);
        }
    }
}
