public class Cuboid {

    private final double width, length, height;

    public Cuboid(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getVolume() {
        return width * length * height;
    }

    @Override
    public String toString() {
        return "(" + width + " x " + length + " x " + height + ")";
    }
}
