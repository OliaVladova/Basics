package SoftUni.Basics.MoreExercises;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.next().charAt(0);
        char last = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);

       /* int one = (int) first;
        int three = (int) last;
        int two = (int) second;*/
        int counter = 0;
        for (int i = first; i <= last; i++) {
            if (i != second) {
                for (int j = first; j <= last; j++) {
                    if (j != second) {
                        for (int k = first; k <= last; k++) {
                            if (k != second) {
                                counter++;
                                char firstOne = (char) i;
                                char lastThree = (char) j;
                                char secondTwo = (char) k;
                                System.out.printf("%s%s%s ",firstOne,lastThree,secondTwo);
                            }

                            }
                        }
                    }
                }
            }
        System.out.printf("%d",counter);


        }
    }
