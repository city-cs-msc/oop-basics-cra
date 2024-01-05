import java.text.SimpleDateFormat;
import java.util.Date;

public class Rental
{
    private String id;

    public Rental(Customer cust, Vehicle veh)
    {
        String dateString = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        id = cust.getId() + ":" + veh.getId() + ":" + dateString;
    }

    public String getId() {
        return id;
    }
}
