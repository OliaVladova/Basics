package SoftUni.Basics.Exam9and10March2019;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wanted = Integer.parseInt(scanner.nextLine());

        int jumps = 0;
        int now = 0;
        boolean isOver = false;
        int start = wanted-30;
        while (start<=wanted){
            int height = Integer.parseInt(scanner.nextLine());
            int fails = 0;
            if (height>start){
                jumps++;
                start+=5;
            }else {

                for (int i=1;i<=3;i++){

                    if (height>start){
                        jumps++;
                        start+=5;
                        break;
                    }else{
                        int newHeight = Integer.parseInt(scanner.nextLine());
                        height=newHeight;
                        jumps++;
                        fails++;

                    }

                }
                if (fails==3){
                    System.out.printf("Tihomir failed at %dcm after %d jumps.",now,jumps);
                }
            }

            now = height;
        }
        if (start>=wanted){
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",wanted,jumps);
        }

    }
}
