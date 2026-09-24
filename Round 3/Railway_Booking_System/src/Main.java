import java.util.Scanner;
public class Main {
    /*
    Here we have to develop a simple railway ticket booking application.
Develop a Railway Reservation Application contains
1.AC coach
2.Non AC coach
3. Seater
each should contain 60 seats and 10 waiting list max allowed rest request should be
cancelled.
you should have
1.Ticket Passager
2.Ticket Cancellation
3.Status Checking
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println("...Booking System....");
            System.out.println("1.Ticket Booking\n" +
                    "2.Ticket Cancellation\n" +
                    "3.Status Checking\n"+
                    "4.Show Info\n" +
                    "5.Prepare chart\n" +
                    "6.Exit");

            System.out.println("Please enter your choice: ");

            char op = sc.next().charAt(0);
            switch (op) {
                case '1':{

                    System.out.println("Please enter Name : ");
                    String name = sc.next();
                    System.out.println("Please enter Gender (M or F): ");
                    char gender = sc.next().charAt(0);
                    System.out.println("Please enter Seat Type (A // N // S : ");
                    char seatType = sc.next().charAt(0);
                    Passager passager = new Passager(name , gender , seatType);
                    Booking.Booking_Ticket(passager);
                    break;
                }
                case '2':{
                    System.out.println("Please enter Id : ");
                    int id = sc.nextInt();
                    Cancellation.Cancellation_Ticker(id);
                    break;
                }
                case '3':{
                    System.out.println("Please enter Id : ");
                    int id = sc.nextInt();
                    Booking.Show_Tickets(id);
                    break;
                }
                case '4':{
                    System.out.println("Please enter Id : ");
                    int id = sc.nextInt();
                    Booking.Show_Tickets(id);
                    break;
                }
                case '5':{
                        Booking.Prepare();
                        break;
                }
                case '6':{
                    run = false;
                    break;
                }
            }
        }

    }
}
