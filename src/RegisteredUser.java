import java.util.ArrayList;

public class RegisteredUser extends User {
    private ArrayList<Ticket> bookingHistory;
    public RegisteredUser(String name) {
        super(name);
        this.bookingHistory = new ArrayList<>();
    }

    public ArrayList<Ticket> getBookingHistory() {
        return bookingHistory;
    }

    public String showBookingHistory() {
        return bookingHistory.toString();
    }

    public void cancelTicket(Ticket ticket) {
        if (bookingHistory.contains(ticket))
            bookingHistory.remove(ticket);
        else
            return;
    }
}
