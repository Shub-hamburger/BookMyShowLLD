import java.util.Date;

public class Ticket {
    private static int counter = 0;
    private int id;
    private String owner;
    private Date bookingTime;
    private int numberOfSeats;
    private Show bookedShow;

    public Ticket() {
        counter++;
        this.id = counter;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Show getBookedShow() {
        return bookedShow;
    }

    public void setBookedShow(Show bookedShow) {
        this.bookedShow = bookedShow;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "owner='" + owner + "'" +
                ", bookingTime=" + bookingTime +
                ", numberOfSeats=" + numberOfSeats +
                ", bookedShow=" + bookedShow +
                '}';
    }
}
