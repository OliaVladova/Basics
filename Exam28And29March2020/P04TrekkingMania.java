package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        double musala = 0;
        double monblan = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;
        int total = 0;
        for (int i = 0; i < groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            total += people;
            if (people <= 5) {
                musala += people;
            } else if (people <= 12) {
                monblan += people;
            } else if (people <= 25) {
                kilimanjaro += people;
            } else if (people <= 40) {
                k2 += people;
            } else {
                everest += people;
            }
        }
        musala = musala / total * 100;
        monblan = monblan / total * 100;
        kilimanjaro = kilimanjaro / total * 100;
        k2 = k2 / total * 100;
        everest = everest / total * 100;
        System.out.printf("%.2f%%\n",musala);
        System.out.printf("%.2f%%\n",monblan);
        System.out.printf("%.2f%%\n",kilimanjaro);
        System.out.printf("%.2f%%\n",k2);
        System.out.printf("%.2f%%",everest);
    }
}
