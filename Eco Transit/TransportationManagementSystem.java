import java.util.ArrayList;

public class TransportationManagementSystem {
    private ArrayList<Vehicle> fleet;

    public TransportationManagementSystem() {
        fleet = new ArrayList<>();
    }

    // Add a vehicle to the fleet
    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    // Remove a vehicle from the fleet by model name
    public void removeVehicle(String model) {
        fleet.removeIf(vehicle -> vehicle.getModel().equals(model));
    }

    // Display all vehicles in the fleet
    public void displayFleet() {
        System.out.println("\n--- Fleet Details ---");

        if (fleet.isEmpty()) {
            System.out.println("No vehicles in the fleet.");
            return;
        }

        for (Vehicle vehicle : fleet) {
            System.out.println("Model: " + vehicle.getModel() + ", Year: " + vehicle.getYear() +
                               ", Carbon Footprint: " + vehicle.calculateCarbonFootprint() + " g/km");
        }
    }

    // Calculate and display the total carbon footprint of the fleet
    public void displayFleetEmissions() {
        System.out.println("\n--- Fleet Emissions Summary ---");
        if (fleet.isEmpty()) {
            System.out.println("No vehicles in the fleet to calculate emissions.");
            return;
        }
        
        double totalEmissions = 0;
        for (Vehicle vehicle : fleet) {
            totalEmissions += vehicle.calculateCarbonFootprint();
        }
        
        System.out.println("Total Fleet Carbon Footprint: " + totalEmissions + " g/km");
    }
        
}
