package SoftUni.Basics.MoreExercises;

import java.util.Scanner;

public class P05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int dates = 0;
        boolean isFull = false;

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                dates++;
                if (dates<=tables){
                    System.out.printf("(%d <-> %d) ",i,j);
                }else {
                    isFull=true;
                    break;
                }
            }
            if (isFull){
                break;
            }
        }
    }
}
