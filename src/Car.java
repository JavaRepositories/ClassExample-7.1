public class Car extends Vehicle {

    private final String make, model;
    private final EnergyType energy;

    public Car(Cuboid size, int doors, String make, String model, EnergyType type) {
        super(size, doors, 4);
        this.make = make;
        this.model = model;
        this.energy = type;
    }

    public Car(Cuboid size, String make, String model, EnergyType type) {
        super(size, 4, 4);
        this.make = make;
        this.model = model;
        this.energy = type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public EnergyType getEnergyType() {
        return energy;
    }

    @Override
    public String toString() {
        return make + " " + model + "\n" +
                "Energy: " + energy.name().toLowerCase() + "\n" +
                super.toString();
    }
}
