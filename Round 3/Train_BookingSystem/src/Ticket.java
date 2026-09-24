public class Ticket {
    static private int id_count = 0;
    private String PNR; // PNR No
    private String name;
    private String status;
    private char source;
    private char destination;
    private int noTicket;

    public Ticket(String name, char source, char destination,int noTicket) {
        this.PNR = "PNR "+(++id_count);
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.noTicket = noTicket;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNoTicket() {
        return noTicket;
    }

    public void setNoTicket(int noTicket) {
        this.noTicket = noTicket;
    }

    public static int getId_count() {
        return id_count;
    }



    public String getName() {
        return name;
    }

    public void setPNR(String PNR) {
        this.PNR = PNR;
    }

    public char getSource() {
        return source;
    }

    public char getDestination() {
        return destination;
    }

    public static void setId_count(int id_count) {
        Ticket.id_count = id_count;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getPNR() {
        return PNR;
    }

    public void setSource(char source) {
        this.source = source;
    }

    public void setDestination(char destination) {
        this.destination = destination;
    }


}
