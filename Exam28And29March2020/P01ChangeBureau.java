package SoftUni.Basics.Exam28And29March2020;

import java.util.Scanner;

public class P01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yuanNum = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        double finalCom = commission/100;

        double bitcoinsToLv = bitcoins * 1168;
        double yuanToLv = (yuanNum*0.15)*1.76;
        double lv = bitcoinsToLv + yuanToLv;
        double euro = lv/1.95;
        euro -= finalCom*euro;
        System.out.printf("%.2f",euro);
    }
}
