public class Plane extends Vehicle {

    private final int turbines, seats;
    private final double capacity;

    public Plane(Cuboid size, int turbines, int seats, double capacity) {
        super(size, 2, 2);
        this.turbines = turbines;
        this.seats = seats;
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getSeats() {
        return seats;
    }

    public int getTurbines() {
        return turbines;
    }

    @Override
    public String toString() {
        return "Airplane\n" +
                "Capacity: " + seats + "\n" +
                "Seats: " + capacity + "\n" +
                "Turbines: " + turbines + "\n" +
                super.toString();
    }
}
