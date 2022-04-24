import java.util.Date;

public class Show {
    private static int counter = 0;
    private int id;
    private Date showTime;
    private int availableSeats;
    private Movie movie;
    private Theater theater;

    public Show(Date showTime, Movie movie, Theater theater) {
        counter++;
        this.id = counter;
        this.showTime = showTime;
        this.movie = movie;
        this.theater = theater;
        this.availableSeats = theater.getCapacity();
        theater.getShows().add(this);
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Date getShowTime() {
        return showTime;
    }

    public Ticket bookTicket(RegisteredUser user, int seats) {
        if (seats > 0 && availableSeats >= seats) {
            availableSeats -= seats;
            Ticket ticket = new Ticket();
            ticket.setOwner(user.getName());
            ticket.setBookedShow(this);
            ticket.setBookingTime(new Date());
            ticket.setNumberOfSeats(seats);
            System.out.println("Successfully booked");
            user.getBookingHistory().add(ticket);
            return ticket;
        }
        else {
            System.out.println("Seats not available");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", showTime=" + showTime +
                ", movie=" + movie.getName() +
                ", theater=" + theater.getName() +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
