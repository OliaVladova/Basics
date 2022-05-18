package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P01RoomPainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paint = Integer.parseInt(scanner.nextLine());
        int wallpaper = Integer.parseInt(scanner.nextLine());
        double glovesPrice = Double.parseDouble(scanner.nextLine());
        double brushPrice = Double.parseDouble(scanner.nextLine());

        double paintPrice = paint * 21.50;
        double wallpaperPrice = wallpaper * 5.2;
        double numGloves = Math.ceil(0.35 * wallpaper);
        double numBrushes = Math.floor(0.48 * paint);
        double total = paintPrice + wallpaperPrice + (numGloves * glovesPrice) + (numBrushes*brushPrice);
        double delivery = total/15;
        System.out.printf("This delivery will cost %.2f lv.",delivery);

    }
}
