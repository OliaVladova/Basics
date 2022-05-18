package SoftUni.Basics.NestedLoopsLecture;

public class P01Clock {
    public static void main(String[] args) {

        int minutes;
        int hours ;
        for (hours=0;hours<24;hours++){
            for (minutes=0;minutes<60;minutes++){
                System.out.printf("%d:%d\n",hours,minutes);
            }
        }
    }
}
