public class Sphere extends Figure {
    private double radius;

    public Sphere(double radius, double r2, double r3) {
        this.radius = radius;
    }

    @Override
    double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }

    public static class Ellipsoid extends Sphere {
        private double r1;
        private double r2;
        private double r3;
        public Ellipsoid(double r1, double r2, double r3) {
            super(r1,r2,r3);
            this.r1 = r1;
            this.r2 = r2;
            this.r3 = r3;
        }
    }
}
