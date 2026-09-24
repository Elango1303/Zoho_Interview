import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Booking_System {



    static List<Taxi> taxiList;

    public Booking_System(int countOf_Taxi) {
        taxiList = new ArrayList<Taxi>();
        for (int i = 0; i < countOf_Taxi; i++) {
            taxiList.add(new Taxi());
        }
    }

    public static Taxi GetFree_Taxi(Booking booking){
        List<Taxi> FreeTaxi_List = new ArrayList<>();
        int min_dis = Integer.MAX_VALUE;

        for(Taxi taxi : taxiList){
            min_dis = Math.min(min_dis,(Math.abs(taxi.getCurrent_Spot() - booking.getPickup_Spot())));
            if(Taxi.IsFree(taxi, booking)) FreeTaxi_List.add(taxi);
        }
        if(FreeTaxi_List.isEmpty()) return null;

        List<Taxi> minTaxi = new ArrayList<>();
        for(Taxi taxi : FreeTaxi_List){
            int dis = Math.abs(taxi.getCurrent_Spot() - booking.getPickup_Spot());
            if(dis == min_dis) minTaxi.add(taxi);
        }
        Taxi Selected_Taxi = minTaxi.get(0);
        for(Taxi taxi : minTaxi){
            if(taxi.getEarring() < Selected_Taxi.getEarring()){
                Selected_Taxi = taxi;
            }
        }

        return Selected_Taxi;
    }
    public static int Calculate_Earring(Booking booking){
       char Pickup = booking.getPickup_Spot();
       char Dropup = booking.getDropup_Spot();

       int trvel_Distence = Math.abs((int) (Pickup - Dropup));

       int earring = (trvel_Distence * 15) - 5;
       earring = (earring*10)+100;
       return earring;

    }
    public static int GetFree_Time(Booking booking){
        char Pickup = booking.getPickup_Spot();
        char Dropup = booking.getDropup_Spot();
        int trvel_Distence = Math.abs((int) (Pickup - Dropup));

        return trvel_Distence+booking.getPickup_Time();
    }
    public void BookingTaxi(Customer customer){
        Booking booking = new Booking(customer.getPickUp(), customer.getDropUp(),customer.getTime());
        if(GetFree_Taxi(booking)==null) System.out.println("No free Taxi");
        else{
            Taxi Selected_Taxi = GetFree_Taxi(booking);
            Selected_Taxi.setEarring(Calculate_Earring(booking)+Selected_Taxi.getEarring());
            Selected_Taxi.setCurrent_Spot(customer.getDropUp());
            Selected_Taxi.setFree_Time(GetFree_Time(booking));
            booking.setEaring(Calculate_Earring(booking));
            booking.setPickup_Time(customer.getTime());
            Selected_Taxi.setList(booking);

            System.out.println("You Taxi Was Booked...!\n The Taxi Id is : " +  Selected_Taxi.getId());
        }




    }
    public static void print(){
        TaxiInfo taxiInfo = new TaxiInfo();
        taxiInfo.Print(taxiList);
    }

}
