import java.util.List;
import java.util.Queue;

public class TicketInfo_Print {

    public void PrintTicket(List<Ticket> ticketsList) {
        if (ticketsList.isEmpty()) {
            System.out.println("No tickets found");
        }

        for (Ticket ticket : ticketsList) {
            System.out.println("Ticket Id : " + ticket.getPNR());
            System.out.println("Ticket Name : " + ticket.getName());
            System.out.println("Ticket Source : " + ticket.getSource());
            System.out.println("Ticket Destination : " + ticket.getDestination());
            System.out.println("Ticket No Seat : " + ticket.getNoTicket());
            System.out.println("**********************");
        }


    }
    public void PrintTicketsOfWainting(Queue<Ticket> ticketsList) {

        for (Ticket ticket : ticketsList) {
            System.out.println("Ticket Id : " + ticket.getPNR());
            System.out.println("Ticket Name : " + ticket.getName());
            System.out.println("Ticket Source : " + ticket.getSource());
            System.out.println("Ticket Destination : " + ticket.getDestination());
            System.out.println("Ticket No Seat : " + ticket.getNoTicket());
            System.out.println("**********************");
        }
    }
    public void PrintSummary(int[] arr){
        o
        System.out.println("\n\t\tSeats Booked : ");
        System.out.println("\tA\tB\tC\tD\tE\tF");
        int num = 1;
        for(char c ='A';c<='E';c++) {
            System.out.print(num++ + "\t");
            int seatsBooked = 8 - arr[c - 'A']; // total seats (8) - available seats = booked seats
            for(int i=0;i<seatsBooked;i++) {
                System.out.print("\t*");
            }
            System.out.println();
        }
        System.out.println();
    }
    }
}
