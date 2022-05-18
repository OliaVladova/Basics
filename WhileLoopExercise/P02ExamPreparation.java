package SoftUni.Basics.WhileLoopExercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failsNum = Integer.parseInt(scanner.nextLine());
        double average = 0;
        int counter = 0;
        int problems = 0;
        String command = scanner.nextLine();
        String name = "";
        while (!command.equals("Enough")){
            name = command;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade<=4){
                counter++;
            }
                problems++;

            if (counter==failsNum){
                System.out.printf("You need a break, %d poor grades.",counter);
                break;
            }
            average+=grade;
            command = scanner.nextLine();
        }if (command.equals("Enough")){
            System.out.printf("Average score: %.2f\n",average/problems);
            System.out.printf("Number of problems: %d\n",problems);
            System.out.printf("Last problem: %s",name);
        }
    }
}
