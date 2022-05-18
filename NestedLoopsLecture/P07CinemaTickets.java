package SoftUni.Basics.NestedLoopsLecture;

import java.util.Scanner;

public class P07CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int studentsCount = 0;
        int standardsCount = 0;
        int kidsCount = 0;
        int countAll = 0;


        while (!command.equals("Finish")) {
            String movie = command;
            int freePlaces = Integer.parseInt(scanner.nextLine());

            int counterTickets = 0;
            String newCommand = scanner.nextLine();
            while (!newCommand.equals("End")) {
                String ticket = newCommand;
                counterTickets++;
                countAll++;
                switch (ticket) {
                    case "student":
                        studentsCount++;
                        break;
                    case "standard":
                        standardsCount++;
                        break;
                    case "kid":
                        kidsCount++;
                        break;
                }
                if (counterTickets == freePlaces) {
                    break;
                }

                newCommand = scanner.nextLine();

            }
            System.out.printf("%s - %.2f%% full.%n", movie, counterTickets * 1.0 / freePlaces * 100);

            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", countAll);
        System.out.printf("%.2f%% student tickets.%n", studentsCount *1.0/ countAll * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardsCount * 1.0 / countAll * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidsCount * 1.0 / countAll * 100);


    }
}

