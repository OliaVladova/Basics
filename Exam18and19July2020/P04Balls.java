package SoftUni.Basics.Exam18and19July2020;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countBlack = 0;
        int countOther = 0;
        double points =0;
        for (int i = 0;i<n;i++){
            String color= scanner.nextLine();
            if (color.equals("red")){
                points+=5;
                countRed++;
            }else if (color.equals("orange")){
                points+=10;
                countOrange++;
            }else if (color.equals("yellow")){
                points+=15;
                countYellow++;
            }else if (color.equals("white")){
                points+=20;
                countWhite++;
            }else if (color.equals("black")){
                points = Math.floor(points/2);
                countBlack++;
            }else {
                countOther++;
            }

        }
        System.out.printf("Total points: %.0f\n",points);
        System.out.printf("Points from red balls: %d\n",countRed);
        System.out.printf("Points from orange balls: %d\n",countOrange);
        System.out.printf("Points from yellow balls: %d\n",countYellow);
        System.out.printf("Points from white balls: %d\n",countWhite);
        System.out.printf("Other colors picked: %d\n",countOther);
        System.out.printf("Divides from black balls: %d",countBlack);
    }
}
