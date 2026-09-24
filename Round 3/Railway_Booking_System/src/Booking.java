import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Booking {

    static Scanner sc = new Scanner(System.in);
    private static int totel_no = 2;
    private static int AC_counter = 1;
    private static int NON_AC_counter = 2;
    private static int Seater = 3;

    static LinkedList <Passager> Confirm_Tickets = new LinkedList<>();

    static LinkedList <Passager> AC_List = new LinkedList<>();
    static LinkedList <Passager> NON_AC_List = new LinkedList<>();
    static LinkedList <Passager> Seater_List = new LinkedList<>();

    static Queue<Passager> Wainting_Queue = new LinkedList<>();

   static HashMap<Integer, Character> map = new HashMap<>();
    static int data1 = 0;
    static char data2;

    public static void Booking_Ticket(Passager passager)
    {
        char pre = passager.getCoach_type();
        int freedSeat = Cancellation.Seat_id_fromMap(map, pre);
        if (freedSeat > 0){
            passager.setSeat_No(freedSeat);
            if(pre == 'A'){
                passager.setStutes("Booked in AC");
                AC_List.add(passager);
                AC_counter += 3;
            } else if (pre == 'N') {
                passager.setStutes("Booked in NON-AC");
                NON_AC_List.add(passager);
                NON_AC_counter += 3;
            }
            else if(pre == 'S'){
                passager.setStutes("Booked in SEATER");
                Seater_List.add(passager);
                Seater += 3;
            }
            Confirm_Tickets.add(passager);

        }
        else if(AC_List.size() == totel_no && NON_AC_List.size() == totel_no && Seater_List.size() == totel_no){
            System.out.println("No Tickets Available You want to Book in Wainting List (Y or N) ?");
            char waiting = sc.next().charAt(0);
            if(waiting == 'Y' && Wainting_Queue.size() < 2){
                Wainting_Booking(passager);
                Confirm_Tickets.add(passager);
            }
            else if(waiting == 'N') System.out.println("Thanks You...!");
        }

        else
        {
            if(passager.getCoach_type() == 'A'){

                if(AC_List.size() >= totel_no){
                    System.out.println("No Tickets Available in AC ");
                    System.out.println("The Available List");
                    System.out.println("In AC : " + (totel_no - AC_List.size()) + "\n In Non-AC : " +
                            (totel_no -  NON_AC_List.size()) + "\n In Seater : " + (totel_no - Seater_List.size()));
                }
                else {
                    passager.setStutes("Booked in AC");
                    passager.setSeat_No(AC_counter);
                    AC_counter += 3;
                    AC_List.add(passager);
                    Confirm_Tickets.add(passager);
                    System.out.println("Booking Ticket Is Successful In AC \n" +passager.toString());
                }
            } else if (passager.getCoach_type() == 'N') {
                if (NON_AC_List.size() >= totel_no) {
                    System.out.println("No Tickets Available in AC ");
                    System.out.println("The Available List");
                    System.out.println("In AC : " + (totel_no - AC_List.size()) + "\n In Non-AC : " +
                            (totel_no -  NON_AC_List.size()) + "\n In Seater : " + (totel_no - Seater_List.size()));

                } else {
                    passager.setStutes("Booked in NON-AC");
                    passager.setSeat_No(NON_AC_counter);
                    NON_AC_counter += 3;
                    NON_AC_List.add(passager);
                    Confirm_Tickets.add(passager);
                    System.out.println("Booking Ticket Is Successful In Non-AC \n" +passager.toString());
                }
            }
            else if (passager.getCoach_type() == 'S') {
                    if(Seater_List.size() >= totel_no){
                        System.out.println("No Tickets Available in AC ");
                        System.out.println("The Available List");
                        System.out.println("In AC : " + (totel_no - AC_List.size()) + "\n In Non-AC : " +
                                (totel_no -  NON_AC_List.size()) + "\n In Seater : " + (totel_no - Seater_List.size()));
                    }
                    else {
                        passager.setStutes("Booked in Seater");
                        passager.setSeat_No(Seater);
                        Seater += 3;
                        Seater_List.add(passager);
                        Confirm_Tickets.add(passager);
                        System.out.println("Booking Ticket Is Successful In Seater\n" +passager.toString());
                    }

            }
        }


    }

    private static void Wainting_Booking(Passager passager) {

        if(Wainting_Queue.size() >= totel_no){
            System.out.println("No Tickets Available in Wainting List");
        }
        else  {
            Wainting_Queue.add(passager);
        }

    }
    public static void Show_Tickets(int id)
    {
        if(Confirm_Tickets.isEmpty()) System.out.println("No Data");
        for(Passager passager : Confirm_Tickets){
            if(passager.getId() == id){
                System.out.println(passager.toString());
            }
            else System.out.println("No Passager Data");
        }
    }
    public static void Prepare(){
        Prepare_chart.Print(AC_List,"AC");
        Prepare_chart.Print(NON_AC_List,"NON-AC");
        Prepare_chart.Print(Seater_List,"SEATER");
    }

}
