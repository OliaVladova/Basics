package SoftUni.Basics.Exam26And7July2019;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double percentReal = percent * 0.01;
        double surface = height * wide*4;
        surface = Math.ceil(surface - (surface * percentReal));
        double allLitres = 0;
        while (!command.equals("Tired!")) {
            int litres = Integer.parseInt(command);
            surface -= litres;

            if (surface <= 0) {
                break;
            }

            command = scanner.nextLine();
        }if (surface<0){
            System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(surface));
        }else if (surface==0){
            System.out.println("All walls are painted! Great job, Pesho!");
        }
        if (command.equals("Tired!")){
            System.out.printf("%.0f quadratic m left. ",Math.abs(surface));
        }
    }
}
