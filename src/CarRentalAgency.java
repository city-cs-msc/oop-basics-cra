import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRentalAgency
{
    private Map<String, VehicleCategory> categories;
    private List<Customer> customers;
    private List<Rental> rentals;

    public CarRentalAgency()
    {
        categories = new HashMap<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();

        setupData();
    }

    public Customer storeCustomer(String name)
    {
        String id = Integer.toString(customers.size());
        Customer customer = new Customer(id, name);

        customers.add(customer);

        return customer;
    }

    public Rental recordRental(String categoryId, String customerId)
    {
        VehicleCategory vehCat = categories.get(categoryId);
        Customer customer = customers.get(Integer.parseInt(customerId));

        Vehicle vehicle = vehCat.getAvailableVehicle();
        vehicle.setAvailable(false);

        Rental rental = new Rental(customer, vehicle);
        rentals.add(rental);

        return rental;
    }

    private void setupData()
    {
        VehicleCategory smallVC = new VehicleCategory("small");
        Vehicle smallV1 = new Vehicle("smallV1");
        smallVC.addVehicle(smallV1);

        Vehicle smallV2 = new Vehicle("smallV2");
        smallVC.addVehicle(smallV2);

        Vehicle smallV3 = new Vehicle("smallV3");
        smallVC.addVehicle(smallV3);

        categories.put(smallVC.getId(), smallVC);

        VehicleCategory bigVC = new VehicleCategory("big");
        Vehicle bigV1 = new Vehicle("bigV1");
        bigVC.addVehicle(bigV1);

        Vehicle bigV2 = new Vehicle("bigV2");
        bigVC.addVehicle(bigV2);

        Vehicle bigV3 = new Vehicle("bigV3");
        bigVC.addVehicle(bigV3);

        categories.put(bigVC.getId(), bigVC);
    }
}
