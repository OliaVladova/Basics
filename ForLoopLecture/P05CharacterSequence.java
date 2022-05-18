package SoftUni.Basics.ForLoopLecture;

import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int i;
        for (i=0; i<text.length(); i++){
            char letter = text.charAt(i);
            System.out.printf("%c%n", letter);
        }
    }
}
