public class Driver {

    public static void main(String[] args) {
        Car mustang = new Car(new Cuboid(6, 12, 5), "Ford", "Mustang", EnergyType.ELECTRIC);
        System.out.println(mustang + "\n\n");

        Car tesla = new Car(new Cuboid(6, 12, 5), "Tesla", "Model X", EnergyType.ELECTRIC);
        System.out.println(tesla + "\n\n");

        Plane plane = new Plane(new Cuboid(20, 80, 15), 4, 120, 1000);
        System.out.println(plane);
    }
}
