package SoftUni.Basics.ExtraExercises.FirstSteps;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

                int wide = (int) (w*100);
                int height = (int) (h*100);
                int desk = (height-100)/70;
                int rows = wide /120;
                int workplaces = rows * desk -3;
        System.out.printf("%d", workplaces);

        }

    }

