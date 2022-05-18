package SoftUni.Basics.NestedLoopsLecture;

public class P02MultiplicationTable {
    public static void main(String[] args) {

        int i;
        int j;
        for (i=1;i<=10;i++){
            for (j=1;j<=10;j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }
    }
}
