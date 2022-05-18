package SoftUni.Basics.MoreExercises;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int counterO = 0;
        int counterC = 0;
        int counterN = 0;
        while (!command.equals("End")){
            String letter = command;
            switch (letter){
                case "!":
                case "?":
                case "/":
                case "*":
                case "|":
                case "^":
                case "&":
                case "$":
                case "#":
                case "@":
                case "(":
                case ")":
                case "{":
                case "}":
                case "[":
                case "]":
                    letter = "";
                    break;
            }
            if (letter.equals("o")){
                counterO++;
            }else if (letter.equals("c")){
                counterC++;
            }else if (letter.equals("n")){
                counterN++;
            }
            if (counterO==1||counterC==1||counterN==1){
                letter="";
            }
            if (counterO!=1&&counterC!=1&&counterN!=1){
                System.out.print("\t");
            }

            if (!letter.equals("")&&counterO!=1&&counterC!=1&&counterN!=1){
                System.out.printf("%s",letter);
            }

            command = scanner.nextLine();
        }
    }
}
