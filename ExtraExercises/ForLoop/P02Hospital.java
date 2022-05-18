package SoftUni.Basics.ExtraExercises.ForLoop;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int i;
        int examined = 0;
        int notExamined = 0;
        int patientsPerDoctor = 7;
        for (i = 1; i <= days; i++) {
            if (i % 3 == 0 && examined<notExamined) {
                patientsPerDoctor++;
            }

            int patients = Integer.parseInt(scanner.nextLine());

            if (patients <= patientsPerDoctor) {
                examined += patients;
            } else {
                examined += patientsPerDoctor;
                notExamined += patients - patientsPerDoctor;
            }

        }
        System.out.printf("Treated patients: %d.\n", examined);
        System.out.printf("Untreated patients: %d.", notExamined);

    }
}
