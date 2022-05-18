package SoftUni.Basics.ExtraExercises.ConditionalStatement;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double pollVolume = (P1 + P2) * H;
        double percentP1 = (P1*H/pollVolume)*100;
        double percentP2 = (P2*H/pollVolume)*100;
        double percentVolume = (pollVolume/V)*100;
        if (pollVolume <= V){
            System.out.printf("The pool is %.2f full. Pipe 1: %.2f Pipe 2: %.2f .", percentVolume,percentP1, percentP2);
        }else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H,pollVolume - V );
        }
    }
}
