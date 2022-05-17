package SoftUni.Basics.ConditionalStatementExercise;

import java.util.Scanner;

public class P05TimeAnd15Minutes {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int extraMin = minutes + 15;
       if (extraMin >59){
           if (hour>=0 && hour<23){
               hour+= 1;
           }else if (hour == 23){
               hour =0;
           }
           extraMin = extraMin - 60;
        }if (extraMin<10){
            System.out.printf("%d:0%d", hour, extraMin);
        }else {
            System.out.printf("%d:%d", hour, extraMin);
        }
    }
}
