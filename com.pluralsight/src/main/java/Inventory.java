public class Inventory {
    public static void main(String[] args) {
        System.out.println("Inventory Information Loading..");
        Inventory[] inventory = new Inventory[20];
        int inventoryCount = 6;

        inventory[0] = new Inventory(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[1] = new Inventory(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Inventory(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Inventory(101124, "Honda Civic", "White", 70000, 7500);
        inventory[4] = new Inventory(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[5] = new Inventory(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        System.out.println("Vehicles in inventory:");
        for (int i = 0; i < inventoryCount; i++) {
            inventory[i].displayDetails();
        }


    }

    private int vehicleId;
    private String vehicleMake;
    private String vehicleColor;
    private int vehicleOdometer;
    private float vehiclePrice;


    public Inventory(int vehicleId, String vehicleMake, String vehicleColor, int vehicleOdometer, float vehiclePrice) {
        this.vehicleId = vehicleId;
        this.vehicleMake = vehicleMake;
        this.vehicleColor = vehicleColor;
        this.vehicleOdometer = vehicleOdometer;
        this.vehiclePrice = vehiclePrice;
    }
    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Make/Model: " + vehicleMake);
        System.out.println("Color: " + vehicleColor);
        System.out.println("Odometer: " + vehicleOdometer);
        System.out.println("Price: $" + vehiclePrice);
        System.out.println();
    }
    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public int getVehicleOdometer() {
        return vehicleOdometer;
    }

    public float getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public void setVehicleOdometer(int vehicleOdometer) {
        this.vehicleOdometer = vehicleOdometer;
    }

    public void setVehiclePrice(float vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
}


