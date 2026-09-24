import java.util.*;

public class Canceling_Ticket extends TicketSystem{

    Booking booking = new Booking();

    public void CancelingTicket(int id,int noTickets) {
        boolean found = false;
        for(Ticket ticket : Confirmtickets){
            String pnr = "PNR " + id;
           if(pnr.equals(ticket.getPNR()))
            {
                found = true;
                System.out.println("Ticket has been cancelled");
                DecreaseTicket(ticket,noTickets);
                ticket.setNoTicket(ticket.getNoTicket()-noTickets);
                CansalTickets.add(ticket);
               if (!WaitingTickets.isEmpty()) booking.TicketBooking(WaitingTickets.poll());

               if(ticket.getNoTicket() == 0) Confirmtickets.remove(ticket); break;
            }

        }
        if(!found){ System.out.println("Invalid Ticket ID");}

    }


}
