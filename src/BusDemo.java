import java.util.ArrayList;
import java.util.Scanner;
public class BusDemo{
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> booking= new ArrayList<Booking>();
        buses.add(new Bus(1, true, 45));
        buses.add(new Bus(2, false, 50));
        buses.add(new Bus(3, true, 48));
        int obj = 1;
        Scanner scanner = new Scanner(System.in);
        for (Bus b : buses) {
            b.displayBusInfo();
        }
        while (obj == 1) {
            System.out.println("Enter Book to 1 and 2 to exit:");
            obj = scanner.nextInt();
            if (obj == 1) {
                Booking bookings= new Booking();
                if (booking.isEmpty()){
                    booking.add(bookings);
                    System.out.println("Your Booking is conformed:");
                } else
                    System.out.println("Sorry,Bus is Full,Try another Bus or Date:");
                }
            }
        }
    }


