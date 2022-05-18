package SoftUni.Basics.ExtraExercises.ForLoop;

public class P09Clock {
    public static void main(String[] args) {

        int mins;
        int hours;
        for (hours = 0; hours < 24; hours++) {
            for (mins = 0; mins < 60; mins++){
                System.out.printf("%d : %d\n",hours,mins);
            }
        }
    }
}
