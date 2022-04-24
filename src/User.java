abstract public class User {
    private static int counter = 0;
    private int id;
    private String name;

    public User(String name) {
        counter++;
        this.id = counter;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
