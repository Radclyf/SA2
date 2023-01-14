public class RectangularSolid extends Figure{
    private double length;
    private double width;
    private double height;

    public RectangularSolid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double getSurfaceArea() {
        return 2 * (length * width + width * height + length * height);
    }

    @Override
    double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Rectangular Solid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }

    public static class Cube extends RectangularSolid {
        private double s1;

        public Cube(double s1) {
            super(s1, s1, s1);
            this.s1 = s1;
        }

        @Override
        double getSurfaceArea() {
            return 6 * s1 * s1;
        }

        @Override
        double getVolume() {
            return  s1 * s1 * s1;
        }

        @Override
        public String toString() {
            return "Cube (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
        }
    }
}
