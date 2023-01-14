public class Sphere extends Figure {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getVolume() {
        return 0;
    }
}
