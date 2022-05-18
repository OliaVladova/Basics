package SoftUni.Basics.ExtraExercises.ForLoop;

public class P10ClockPart2 {
    public static void main(String[] args) {

        int mins;
        int seconds;
        int hours;
        for (hours = 0; hours < 24; hours++) {
            for (mins = 0; mins < 60; mins++){
                for (seconds=0;seconds<60;seconds++){
                    System.out.printf("%d : %d : %d\n",hours,mins,seconds);
                }

            }
        }
    }
}
