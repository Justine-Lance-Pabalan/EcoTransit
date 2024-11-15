import java.util.ArrayList;
import java.util.Scanner;

// Interface defining eco-friendly behavior
interface EcoFriendly {
    double calculateCarbonFootprint(); // Carbon footprint in grams/km
}

// Base class representing a generic vehicle
abstract class Vehicle implements EcoFriendly {
    private String model;
    private int year;
    private double fuelEfficiency; // e.g., km per liter

    public Vehicle(String model, int year, double fuelEfficiency) {
        this.model = model;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    // Abstract method for calculating carbon footprint
    public abstract double calculateCarbonFootprint();
}

// Subclass for Electric Vehicles
class ElectricVehicle extends Vehicle {
    private double batteryCapacity; // e.g., kWh

    public ElectricVehicle(String model, int year, double fuelEfficiency, double batteryCapacity) {
        super(model, year, fuelEfficiency);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public double calculateCarbonFootprint() {
        return 0; // Electric vehicles have zero direct emissions
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}

// Subclass for Hybrid Vehicles
class HybridVehicle extends Vehicle {
    private double emissionsRate; // e.g., grams/km

    public HybridVehicle(String model, int year, double fuelEfficiency, double emissionsRate) {
        super(model, year, fuelEfficiency);
        this.emissionsRate = emissionsRate;
    }

    @Override
    public double calculateCarbonFootprint() {
        return emissionsRate;
    }

    public double getEmissionsRate() {
        return emissionsRate;
    }

    public void setEmissionsRate(double emissionsRate) {
        this.emissionsRate = emissionsRate;
    }
}

// Management system for handling the fleet of vehicles
class TransportationManagementSystem {
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

// Main class to interact with the user
public class EcoTransit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransportationManagementSystem tms = new TransportationManagementSystem();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Electric Vehicle");
            System.out.println("2. Add Hybrid Vehicle");
            System.out.println("3. Display Fleet");
            System.out.println("4. Display Total Emissions");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter model: ");
                    String evModel = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int evYear = scanner.nextInt();
                    System.out.print("Enter fuel efficiency (km/l): ");
                    double evEfficiency = scanner.nextDouble();
                    System.out.print("Enter battery capacity (kWh): ");
                    double evBattery = scanner.nextDouble();
                    tms.addVehicle(new ElectricVehicle(evModel, evYear, evEfficiency, evBattery));
                    System.out.println("Electric Vehicle added successfully.");
                    break;
                case 2:
                    System.out.print("Enter model: ");
                    String hvModel = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int hvYear = scanner.nextInt();
                    System.out.print("Enter fuel efficiency (km/l): ");
                    double hvEfficiency = scanner.nextDouble();
                    System.out.print("Enter emissions rate (g/km): ");
                    double hvEmissions = scanner.nextDouble();
                    tms.addVehicle(new HybridVehicle(hvModel, hvYear, hvEfficiency, hvEmissions));
                    System.out.println("Hybrid Vehicle added successfully.");
                    break;
                case 3:
                    tms.displayFleet();
                    break;
                case 4:
                    tms.displayFleetEmissions();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
