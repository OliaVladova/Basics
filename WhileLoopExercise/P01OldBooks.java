package SoftUni.Basics.WhileLoopExercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searched = scanner.nextLine();
        String book = scanner.nextLine();
        int counter = 0;
        boolean isFound = false;
        while (!book.equals("No More Books")){
            if (book.equals(searched)){
               isFound = true;
                break;
            }
            counter++;
            book = scanner.nextLine();
        }if (isFound){
            System.out.printf("You checked %d books and found it.",counter);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",counter);
        }

    }
}
