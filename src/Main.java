public class Main
{
    public static void main(String[] args)
    {
        CarRentalAgency cra = new CarRentalAgency();

        Customer ivo = cra.storeCustomer("Ivo");
        Rental rentalIvo = cra.recordRental("small", ivo.getId());
        System.out.println(rentalIvo.getId());

        Customer pivo = cra.storeCustomer("Pivo");
        Rental rentalPivo = cra.recordRental("small", pivo.getId());
        System.out.println(rentalPivo.getId());


    }
}
