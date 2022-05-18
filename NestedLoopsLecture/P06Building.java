package SoftUni.Basics.NestedLoopsLecture;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        String kind = "";
        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < rooms; j++) {
                if (i==floors){
                    kind = "L";
                }else if (i % 2 == 0){
                    kind ="O";
                }else {
                    kind = "A";
                }
                System.out.printf("%s%d%d ",kind,i,j);
            }
            System.out.println();

        }
    }
}
