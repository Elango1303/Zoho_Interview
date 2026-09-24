import java.util.Map;

public class Cancellation extends Booking {

    public static void Cancellation_Ticker(int id){

        Cancellation_From_List(id);


    }
    public static void Cancellation_From_List(int id){
        for(Passager passager : Confirm_Tickets){
            if(passager.getId() == id){
                data1 = passager.getSeat_No();
                data2= passager.getCoach_type();
                map.put(data1,data2);
                Confirm_Tickets.remove(passager);
                if(data2 == 'A') AC_List.remove(passager);
                else if(data2 == 'N') NON_AC_List.remove(passager);
                else if(data2 == 'S') Seater_List.remove(passager);
                if(!Wainting_Queue.isEmpty()){
                    Booking.Booking_Ticket(Wainting_Queue.poll());
                }
            }
            else System.out.println("No Passager Data");
        }
    }

    public static int Seat_id_fromMap(Map<Integer, Character> map, char coach_type) {
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            if (coach_type == entry.getValue()) {
                int seatId = entry.getKey();
                map.remove(seatId);
                return seatId;
            }
        }
        return 0;
    }


}
