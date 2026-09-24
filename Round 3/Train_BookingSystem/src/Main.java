import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        while (true) {
            System.out.println("******************************");
            System.out.println("Ticket Booking System...!");
            System.out.println("1.Ticket Booking");
            System.out.println("2.Ticket Canceling");
            System.out.println("3.Ticket Info");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:{

                    System.out.println("Enter Name : ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter Source : ");
                    char sourece = sc.next().charAt(0);
                    System.out.println("Enter Destination : ");
                    sc.nextLine();
                    char destination = sc.nextLine().charAt(0);
                    System.out.println("Enter Number of Tickets : ");
                    int noTickets = sc.nextInt();
                    Ticket ticket = new Ticket(name,sourece,destination,noTickets);
                    Booking booking = new Booking();
                    booking.TicketBooking(ticket);
                    break;

                }
                case 2:{
                    System.out.println("Enter Id : ");
                    int id = sc.nextInt();
                    System.out.println("How many Tickets : ");
                    sc.nextLine();
                    int noTickets = sc.nextInt();
                    Canceling_Ticket cancingTicket = new Canceling_Ticket();
                    cancingTicket.CancelingTicket(id,noTickets);
                    break;
                }
                case 3:{
                    TicketSystem ts = new TicketSystem();
                    ts.print();
                    break;
                }
                case 4:{
                    System.exit(0);
                }
            }

        }
        } finally {
            sc.close();
        }
    }
}
