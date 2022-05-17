package SoftUni.Basics.Exam9and10March2019;

import java.util.Scanner;

public class P05FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        double workOut = 0;
        double percentWorkingOut = 0;
        double protein = 0;
        double percentProtein = 0;

        for (int i = 1; i <= visitors; i++) {
            String activity = scanner.nextLine();
            switch (activity){
                case "Back":
                    back+=1;
                    break;
                case "Chest":
                    chest+=1;
                    break;
                case "Legs":
                    legs+=1;
                    break;
                case "Abs":
                    abs+=1;
                    break;
                case "Protein shake":
                    proteinShake+=1;
                    break;
                case "Protein bar":
                    proteinBar+=1;
                    break;
            }
        }
        workOut=back+abs+legs+chest;
        protein=proteinBar+proteinShake;
        percentWorkingOut=(workOut/(workOut+protein))*100;
        percentProtein=(protein/(workOut+protein))*100;

        System.out.printf("%d - back\n",back);
        System.out.printf("%d - chest\n",chest);
        System.out.printf("%d - legs\n",legs);
        System.out.printf("%d - abs\n",abs);
        System.out.printf("%d - protein shake\n",proteinShake);
        System.out.printf("%d - protein bar\n",proteinBar);
        System.out.printf("%.2f%% - work out\n",percentWorkingOut);
        System.out.printf("%.2f%% - protein",percentProtein);
    }
}
