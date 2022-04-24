import java.util.ArrayList;
import java.util.Date;

public class Theater {
    private static int counter = 0;
    private int id;
    private String name;
    private String location;
    private int capacity;
    private ArrayList<Show> shows;

    public Theater(String name, String location, int capacity) {
        counter++;
        this.id = counter;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.shows = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Show> getShows(Date date) {
        ArrayList<Show> todayShows = new ArrayList<>();
        for(Show show: shows) {
            if(show.getShowTime() == date) {
                todayShows.add(show);
            }
        }
        return todayShows;
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public void updateShow() {

    }
}
