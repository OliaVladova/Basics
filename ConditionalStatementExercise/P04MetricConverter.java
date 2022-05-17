package SoftUni.Basics.ConditionalStatementExercise;

import java.util.Scanner;

public class P04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();
        if (inputUnit.equals("mm") && outputUnit.equals("cm")){ //mm to cm
            number = number * 0.1;
        }else if (inputUnit.equals("mm") && outputUnit.equals("m")){ // mm to m
            number = number * 0.001;
        }else if (inputUnit.equals("cm") && outputUnit.equals("m")){ //cm to m
            number = number * 0.01;
        }else if (inputUnit.equals("cm") && outputUnit.equals("mm")){ //cm to mm
            number = number * 10;
        }else if (inputUnit.equals("m") && outputUnit.equals("cm")){
            number = number * 100;
        }else if (inputUnit.equals("m") && outputUnit.equals("mm")){
            number = number * 1000;
        }
        System.out.printf("%.3f", number);
    }
}
