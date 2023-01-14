public class RectangularPyramid extends Figure{
    private double length1;
    private double width1;
    private double height1;

    public RectangularPyramid(double length1, double width1, double height1){
        this.length1 = length1;
        this.width1 = width1;
        this.height1 = height1;
    }
    @Override
    double getSurfaceArea() {
        return length1 * width1 + length1 * Math.sqrt(Math.pow(width1 / 2, 2) + Math.pow(height1, 2) + width1) * Math.sqrt(Math.pow(1 / 2, 2) + Math.pow(height1, 2));
    }

    @Override
    double getVolume() {
        return length1 * width1 * height1 / 3;
    }

    @Override
    public String toString() {
        return "Rectangular Pyramid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }


}
