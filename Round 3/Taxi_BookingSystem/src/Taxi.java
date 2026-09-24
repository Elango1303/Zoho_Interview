import java.util.ArrayList;
import java.util.List;

public class Taxi {
    static private int id_Count = 0;
    private int id;
    private char Current_Spot;
    private int Earring;
    private int Free_Time;
    private List<Booking> list;

    public Taxi() {
        this.id = ++id_Count;
        this.Current_Spot = 'A';
        this.Earring = 0;
        this.Earring = 0;
        this.list = new ArrayList<>();

    }

    public static int getId_Count() {
        return id_Count;
    }

    public static void setId_Count(int id_Count) {
        Taxi.id_Count = id_Count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getCurrent_Spot() {
        return Current_Spot;
    }

    public void setCurrent_Spot(char current_Spot) {
        Current_Spot = current_Spot;
    }

    public int getEarring() {
        return Earring;
    }

    public void setEarring(int earring) {
        Earring = earring;
    }

    public List<Booking> getList() {
        return list;
    }

    public void setList(Booking booking) {
        list.add(booking);
    }

    public int getFree_Time() {
        return Free_Time;
    }

    public void setFree_Time(int free_Time) {
        Free_Time = free_Time;
    }

    public static boolean IsFree(Taxi taxi, Booking booking) {

        char current_Spot = taxi.getCurrent_Spot();
        char Drop_Spot = booking.getDropup_Spot();

        int Trvel_Time = Math.abs(current_Spot - Drop_Spot);

        Trvel_Time = taxi.getFree_Time() + Trvel_Time;

        if (Trvel_Time <= booking.getPickup_Time()) {
            return true;
        }
        return false;

    }
}
