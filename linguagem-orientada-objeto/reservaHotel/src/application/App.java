package reservaHotel.src.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import reservaHotel.src.model.entities.Reservation;
import reservaHotel.src.model.exceptions.DomainException;

public class App {
    public static void main(String[] args) {

        Scanner input;
        SimpleDateFormat sdf;
        Reservation reservation;

        int number;
        Date checkin;
        Date checkout;

        Locale.setDefault(Locale.US);
        input = new Scanner(System.in);
        sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number:");
            number = input.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(input.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(input.next());

            reservation = new Reservation(number, checkin, checkout);
            System.out.println(reservation);

            System.out.println();

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(input.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(input.next());

            reservation.updateDates(checkin, checkout);
            System.out.println(reservation);

        } catch (ParseException e) {
            System.err.println(e.getMessage());

        } catch (DomainException e) {
            System.err.println("Error in reservation: " + e.getMessage());

        }

        input.close();

    }
}
