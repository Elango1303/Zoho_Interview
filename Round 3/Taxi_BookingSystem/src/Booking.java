public class Booking {
    static int id_Count = 0;
    private int Booking_ID;
    private char Pickup_Spot;
    private char Dropup_Spot;
    private int Pickup_Time;
    private int Earing;

    public Booking(char Pickup_Spot, char Dropup_Spot,int Pickup_Time) {
        this.Booking_ID = ++id_Count;
        this.Pickup_Spot = Pickup_Spot;
        this.Dropup_Spot = Dropup_Spot;
        this.Pickup_Time = Pickup_Time;

    }

    public static int getId_Count() {
        return id_Count;
    }

    public static void setId_Count(int id_Count) {
        Booking.id_Count = id_Count;
    }

    public int getBooking_ID() {
        return Booking_ID;
    }

    public void setBooking_ID(int booking_ID) {
        Booking_ID = booking_ID;
    }

    public char getPickup_Spot() {
        return Pickup_Spot;
    }

    public void setPickup_Spot(char pickup_Spot) {
        Pickup_Spot = pickup_Spot;
    }

    public char getDropup_Spot() {
        return Dropup_Spot;
    }

    public void setDropup_Spot(char dropup_Spot) {
        Dropup_Spot = dropup_Spot;
    }

    public int getPickup_Time() {
        return Pickup_Time;
    }

    public void setPickup_Time(int pickup_Time) {
        Pickup_Time = pickup_Time;
    }
    public int getEaring() {
        return Earing;
    }
    public void setEaring(int earing) {
        Earing = earing;
    }


}
