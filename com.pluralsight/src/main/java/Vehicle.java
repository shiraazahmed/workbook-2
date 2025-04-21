public class Vehicle {
    public static void main(String[] args) {
        System.out.println("Hello");
        Vehicle vehicle = new Vehicle(10000,"Ford", "Shelby Truck");
        System.out.println(vehicle.toString());
        System.out.println(vehicle);

    }
        private int id;
        private String make;
        private String model;

        public Vehicle(int id, String make, String model) {
            this.id = id;
            this.make = make;
            this.model= model;
        }

        public int getId() {
            return id;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public String toString () {
            return "Vehicle{" +
                    "id=" + getId() +
                    ", make='" + getMake() + '\'' +
                    ", model='" + getModel() + '\'' +
                    '}';
        }


}
