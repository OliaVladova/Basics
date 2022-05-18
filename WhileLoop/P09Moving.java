package SoftUni.Basics.WhileLoop;

import java.util.Scanner;

public class P09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int leftSpace = width * length * height;

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int numBoxes = Integer.parseInt(command);
            leftSpace-=numBoxes;
            if (leftSpace<0){
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(leftSpace));
                break;
            }
            command = scanner.nextLine();
        }if (command.equals("Done")) {
            System.out.printf("%d Cubic meters left.", leftSpace);
        }
    }
}
