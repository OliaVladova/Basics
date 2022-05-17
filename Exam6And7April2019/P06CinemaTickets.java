package SoftUni.Basics.Exam6And7April2019;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double student = 0;
        double standard = 0;
        double kid = 0;
        int total = 0;

        boolean isFull = false;
        while (!command.equals("Finish")){
            String movie = command;
            int seats = Integer.parseInt(scanner.nextLine());
            String newCommand = scanner.nextLine();
            int ticketsperMovie = 0;
            while (!newCommand.equals("End")){
                String typeTicket = newCommand;
                ticketsperMovie++;
                switch (typeTicket){
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }

                total++;
                if (ticketsperMovie>=seats){
                    isFull = true;
                    break;
                }

                newCommand = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n",movie,ticketsperMovie*1.0/seats*100);
            command = scanner.nextLine();
        }
            System.out.printf("Total tickets: %d\n",total);
        System.out.printf("%.2f%% student tickets.\n", student/total*100);
        System.out.printf("%.2f%% standard tickets.\n", standard/total*100);
        System.out.printf("%.2f%% kids tickets.\n", kid/total*100);

    }
}
