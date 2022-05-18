package SoftUni.Basics.WhileLoopExercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeLength = Integer.parseInt(scanner.nextLine());
        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cake = cakeLength * cakeWidth;
        int counter = 0;
        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            cake -= pieces;
            if (cake<0){
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cake));
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("STOP")){
            System.out.printf("%d pieces are left.", Math.abs(cake));
        }
    }
}
