package SoftUni.Basics.FirstExam;

import java.util.Scanner;

public class P03CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kind = scanner.nextLine();
        String gender = scanner.nextLine();
        double catMonths = 0;
        boolean isTrue = true;
        switch (kind){
            case "British Shorthair":
                if (gender.equals("m")){
                    catMonths = 13*12.0 / 6;
                }else if (gender.equals("f")){
                    catMonths = 14*12.0/6;
                }
                break;
            case "Siamese":
                if (gender.equals("m")){
                    catMonths = 15*12.0 / 6;
                }else if (gender.equals("f")){
                    catMonths = 16*12.0/6;
                }
                break;
            case "Persian":
                if (gender.equals("m")){
                    catMonths = 14*12.0 / 6;
                }else if (gender.equals("f")){
                    catMonths = 15*12.0/6;
                }
                break;
            case "Ragdoll":
                if (gender.equals("m")){
                    catMonths = 16*12.0 / 6;
                }else if (gender.equals("f")){
                    catMonths = 17*12.0/6;
                }
                break;
            case "American Shorthair":
                if (gender.equals("m")){
                    catMonths = 12*12.0 / 6;
                }else if (gender.equals("f")){
                    catMonths = 13*12.0/6;
                }
                break;
            case "Siberian":
                if (gender.equals("m")){
                    catMonths = 11*12.0 / 6;
                }else if (gender.equals("f")){
                    catMonths = 12*12.0/6;
                }
                break;
            default:
                System.out.printf("%s is invalid cat!",kind);
                isTrue = false;
        }
        if(isTrue){
            System.out.printf("%.0f cat months",catMonths);
        }
    }
}
