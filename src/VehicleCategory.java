import java.util.ArrayList;
import java.util.List;

public class VehicleCategory
{
    private String id;
    private List<Vehicle> vehicles;

    public VehicleCategory(String i)
    {
        id = i;
        vehicles = new ArrayList<>();
    }

    public VehicleCategory(String i, List<Vehicle> veh)
    {
        id = i;
        vehicles = veh;
    }

    public String getId() {
        return id;
    }

    public void addVehicle(Vehicle veh)
    {
        vehicles.add(veh);
    }

    public void removeVehicle(Vehicle veh)
    {
        vehicles.remove(veh);
    }

    public Vehicle getAvailableVehicle()
    {
        for (int i = 0; i < vehicles.size(); i++)
        {
            Vehicle vehicle = vehicles.get(i);
            if (vehicle.isAvailable())
            {
                return vehicle;
            }
        }

        return null;
    }
}
