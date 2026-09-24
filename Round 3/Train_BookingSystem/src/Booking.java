public class Booking  {
    TicketSystem ticketSystem = new TicketSystem();


    public void TicketBooking(Ticket ticket) {

        if(ticketSystem.CheckAvailability(ticket)){
            ticketSystem.setConfirmtickets(ticket);
            ticketSystem.IncreaseTicket(ticket);
            System.out.println("Ticket Booking Successful From :" + ticket.getSource() + " --> " + ticket.getDestination() );

        }
        else if (ticketSystem.CheckAvailabilityOnWaintingList(ticket)) {

            ticketSystem.setWaitingTickets(ticket);
            ticketSystem.DecreaseTicketOnWaiting(ticket);
            System.out.println("Ticket Booking Successful on Wainting List From:" + ticket.getSource() + " --> " + ticket.getDestination() );

        } else{
            System.out.println("Ticket Booking Failed From:" + ticket.getSource() + " --> " + ticket.getDestination() );


        }
    }


}
