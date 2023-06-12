package reservaHotel.src.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import reservaHotel.src.model.exceptions.DomainException;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {

    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
        if (!checkout.after(checkin)) {
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public Long duration() {
        long diff = getCheckout().getTime() - getCheckin().getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout) throws DomainException {
        Date now = new Date();
        if (getCheckin().before(now) || getCheckout().before(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!getCheckout().after(getCheckin())) {
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Room " + getRoomNumber()
                + ", checkin: " + sdf.format(getCheckin())
                + ", checkout: " + sdf.format(getCheckout())
                + ", " + duration() + " nights";

    }

}
