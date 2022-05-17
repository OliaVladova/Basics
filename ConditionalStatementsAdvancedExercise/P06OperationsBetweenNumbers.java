package SoftUni.Basics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        char operation = scanner.next().charAt(0);

        int result = 0;
        double result2 =0;
        double left = 0;
        String kind = "";
        switch (operation) {
            case '+':
                result = N1 + N2;
                if (result % 2 == 0) {
                    kind = "even";
                } else {
                    kind = "odd";
                }
                System.out.printf("%d %s %d = %d - %s\n",N1, operation, N2,result, kind);
                break;
            case '-':
                result = N1 - N2;
                if (result % 2 == 0) {
                    kind = "even";
                } else {
                    kind = "odd";
                }
                System.out.printf("%d %s %d = %d - %s\n",N1, operation, N2,result, kind);
                break;
            case '*':
                result = N1 * N2;
                if (result % 2 == 0) {
                    kind = "even";
                } else {
                    kind = "odd";
                }
                System.out.printf("%d %s %d = %d - %s\n",N1, operation, N2,result, kind);
                break;
            case '/':
                if (N2 != 0) {
                    result2 = N1 / N2 * 1.00;
                    double rest = N1 % N2;
                    rest /= N2;
                    System.out.printf("%d %s %d = %.2f", N1, operation, N2, result2 + rest);
                } else {
                    System.out.printf("Cannot divide %d by zero", N1);
                }
                break;
            case '%':
                if (N2 != 0) {
                    result = N1 % N2;
                    System.out.printf("%d %s %d = %d", N1, operation, N2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero", N1);
                }
                break;


        }

    }
}
