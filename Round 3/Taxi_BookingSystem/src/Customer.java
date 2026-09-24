public class Customer {
    static int id_Count = 0;
    private int id;
    private char PickUp;
    private char DropUp;
    private int time;

    Customer(char PickUp, char DropUp, int time) {
        this.id = ++id_Count;
        this.PickUp = PickUp;
        this.DropUp = DropUp;
        this.time = time;
    }

    public static int getId_Count() {
        return id_Count;
    }

    public static void setId_Count(int id_Count) {
        Customer.id_Count = id_Count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getPickUp() {
        return PickUp;
    }

    public void setPickUp(char pickUp) {
        PickUp = pickUp;
    }

    public char getDropUp() {
        return DropUp;
    }

    public void setDropUp(char dropUp) {
        DropUp = dropUp;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
