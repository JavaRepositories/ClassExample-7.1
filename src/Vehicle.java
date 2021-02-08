public class Vehicle {

    private final Cuboid size;
    private final int doors, wheels;

    public Vehicle(Cuboid size, int doors, int wheels) {
        this.size = size;
        this.doors = doors;
        this.wheels = wheels;
    }

    public Vehicle(Cuboid size, int doors) {
        this.size = size;
        this.doors = doors;
        this.wheels = 0;
    }

    public Vehicle(Cuboid size) {
        this.size = size;
        this.doors = 0;
        this.wheels = 0;
    }

    public Cuboid getSize() {
        return size;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String toString() {
        return "Size: " + size.toString() + "\n" +
                "Wheels: " + wheels + "\n" +
                "Doors: " + doors;
    }
}
