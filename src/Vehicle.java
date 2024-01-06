public class Vehicle
{
    private String id;
    private boolean available;

    public Vehicle(String i)
    {
        id = i;
        setAvailable(true);
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean a) {
        available = a;
    }
}
