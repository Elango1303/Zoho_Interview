public class Passager {
    static private int id_counter = 0;
    private int id;
    private String name;
    private char gender;
    private char coach_type;
    private int Seat_No;
    private String stutes;


    public Passager(String name, char gender, char coach_type) {
        this.id = ++id_counter;
        this.name = name;
        this.gender = gender;
        this.coach_type = coach_type;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setCoach_type(char coach_type) {
        this.coach_type = coach_type;
    }
    public void setStutes(String stutes) {
        this.stutes = stutes;
    }
    public void setSeat_No(int passager_no) {
        this.Seat_No = passager_no;
    }
    public void setId(int passager_id) {
        this.id = passager_id;
    }
    public int getSeat_No() {
        return Seat_No;
    }
    public int getId() {
        return id;
    }

    public char getCoach_type() {
        return coach_type;
    }
    public String getStutes() {
        return stutes;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        System.out.println("*******************************");
        System.out.println("Passager Info....\n" + "Name : " + name + "\nGender : " +
                gender + "\nCoach : " + coach_type + "\nStutes : " + stutes +"\nBookind Id : " + id +" \nSeat No : " +Seat_No);
        System.out.println("*******************************");

        return "";
    }
}
