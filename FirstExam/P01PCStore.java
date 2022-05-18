package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P01PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollarsForProcessor = Double.parseDouble(scanner.nextLine());
        double dollarsForVideoCard = Double.parseDouble(scanner.nextLine());
        double dollarsForRAM = Double.parseDouble(scanner.nextLine());
        int numRAM = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());


        double processor = dollarsForProcessor * 1.57;
        double videoCard = dollarsForVideoCard * 1.57;
        double ram = (dollarsForRAM * 1.57)*numRAM;
        processor = processor - (processor * percent);
        videoCard = videoCard - (videoCard * percent);
double total = processor + ram + videoCard;
        System.out.printf("Money needed - %.2f leva.",total);

    }
}
