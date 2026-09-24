import java.util.List;

/*

 */

public class TaxiInfo {

    public void Print(List<Taxi> taxiList){

        for(Taxi taxi : taxiList){
            System.out.println("Taxi Id: " + taxi.getId() + "   Earings : " + taxi.getEarring());
            System.out.println("BookingId\t" + "PickUpSpot\t" + "DropUpSpot\t" + "Time\t" + "Amount" );
           for(Booking booking : taxi.getList()){
               System.out.println(booking.getBooking_ID() +"            " +
                       booking.getPickup_Spot() +"          "+
                       booking.getDropup_Spot() +"          "+
                       booking.getPickup_Time() +"         "+
                       booking.getEaring());
           }
            System.out.println(".................................");
            System.out.println(" ");
        }
    }
}
