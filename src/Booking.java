import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Booking {
    String passengerName;
    int busNumber;
    Date date;
    Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of passenger:");
        passengerName = scanner.next();
        System.out.println("Enter BusNumber:");
        busNumber=scanner.nextInt();
        System.out.println("Enter Date dd-MM-yyyy:");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy:");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public  boolean isAvailable(ArrayList<Booking> booking, ArrayList<Bus> buses) {
        int Capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNumber() == busNumber) {
                Capacity = bus.getCapacity();
            }
            int count = 0;
            for (Booking b : booking) {
                if (b.busNumber == busNumber && b.date.equals(date)) {
                    count++;
                }
            }
            return count < Capacity ? true : false;
        }
        return false;
    }
}












