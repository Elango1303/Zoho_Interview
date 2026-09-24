import java.util.*;

public class TicketSystem {

    static List<Ticket> Confirmtickets = new ArrayList<>();
    static Queue<Ticket> WaitingTickets = new LinkedList<>();
    static List<Ticket> CansalTickets = new LinkedList<>();

   static int[] TicketArray = {8,8,8,8,8,8};
   static int[] TicketOnWaiting = {2,2,2,2,2};

    public List<Ticket> getConfirmtickets() {
        return Confirmtickets;
    }

    public void setConfirmtickets(Ticket confirmtickets) {
        Confirmtickets.add(confirmtickets);
    }

    public Queue<Ticket> getWaitingTickets() {
        return WaitingTickets;
    }

    public void setWaitingTickets(Ticket waitingTickets) {
        WaitingTickets.add(waitingTickets);
    }

    public List<Ticket> getCansalTickets() {
        return CansalTickets;
    }

    public void setCansalTickets(List<Ticket> cansalTickets) {
        CansalTickets = cansalTickets;
    }



    public boolean CheckAvailability(Ticket ticket) {

        char sourse = ticket.getSource();
        char destination = ticket.getDestination() ;
        int Ticket = ticket.getNoTicket();

        if (sourse - 'A' > destination - 'A') return false;

        for(int i = sourse - 'A' ; i < destination - 'A' ; i++){

            if(TicketArray[i] < Ticket) return false;
        }
        return true;

    }
    public boolean CheckAvailabilityOnWaintingList(Ticket ticket) {
        char sourse = ticket.getSource();
        char destination = ticket.getDestination() ;
        int Ticket = ticket.getNoTicket();
        if (sourse > destination) return false;
        for(int i = sourse - 'A' ; i < destination - 'A' ; i++){

            if(TicketOnWaiting[i] < Ticket) return false;
        }

        return true;
    }

    public void DecreaseTicket(Ticket ticket,int ticketNo) {
        char sourse = ticket.getSource();
        char destination = ticket.getDestination() ;
        int Ticket = ticket.getNoTicket();
        for(int i = sourse - 'A' ; i < destination - 'A' ; i++){
            TicketArray[i] = TicketArray[i] + Ticket;
        }

    }
    public void DecreaseTicketOnWaiting(Ticket ticket) {
        char sourse = ticket.getSource();
        char destination = ticket.getDestination() ;
        int Ticket = ticket.getNoTicket();
        for(int i = sourse - 'A' ; i < destination - 'A' ; i++){
            TicketOnWaiting[i] = TicketOnWaiting[i] - Ticket;
        }
    }
    public void IncreaseTicketOnWaiting(Ticket ticket) {
        char sourse = ticket.getSource();
        char destination = ticket.getDestination() ;
        int Ticket = ticket.getNoTicket();
        for(int i = sourse - 'A' ; i < destination - 'A' ; i++){
            TicketOnWaiting[i] = TicketOnWaiting[i] - Ticket;

        }
    }
    public void IncreaseTicket(Ticket ticket) {
        char sourse = ticket.getSource();
        char destination = ticket.getDestination() ;
        int Ticket = ticket.getNoTicket();
        for(int i = sourse - 'A' ; i < destination - 'A' ; i++){
            TicketArray[i] = TicketArray[i] - Ticket;

        }
    }
    public void AddTicketConfirm(Ticket ticket) {
        Confirmtickets.add(ticket);
    }
    public void BookTicket(Ticket ticket) {
        Confirmtickets.add(ticket);
    }


    public void print() {
        TicketInfo_Print ticketInfo = new TicketInfo_Print();
        ticketInfo.PrintTicket(Confirmtickets);
        ticketInfo.PrintTicketsOfWainting(WaitingTickets);
        ticketInfo.PrintSummary(TicketArray);
    }
}
