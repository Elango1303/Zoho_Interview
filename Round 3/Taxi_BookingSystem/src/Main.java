import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);
        Booking_System bookingSystem = new Booking_System(4);

        while (run) {
            System.out.println("*****************");
            System.out.println("1.Creak Booking");
            System.out.println("2.Taxi info");
            System.out.println("3.Exit..");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("Enter Pick Up Spot : ");
                    char pickUpSpot = sc.next().charAt(0);
                    System.out.println("Enter Drop Up Spot : ");
                    char dropUpSpot = sc.next().charAt(0);
                    System.out.println("Enter Time : ");
                    int time = sc.nextInt();
                    Customer customer = new Customer(pickUpSpot, dropUpSpot, time);
                    //Booking booking = new Booking(pickUpSpot, dropUpSpot, time);
                    bookingSystem.BookingTaxi(customer);
                    break;
                }
                case 2:{
                    bookingSystem.print();
                    break;
                }
                case 3:{
                    System.exit(0);
                }
            }
        }
    }
}