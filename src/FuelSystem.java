public class FuelSystem {

    public boolean prepareFuel() {
        System.out.println("Checking fuel...");

        boolean fuelAvailable = true;

        if (!fuelAvailable) {
            System.out.println("Error: Not enough fuel!");
            return false;
        }

        System.out.println("Fuel system: Fuel is ready");
        return true;
    }
}