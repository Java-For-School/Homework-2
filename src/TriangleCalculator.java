public class TriangleCalculator {
    private double base;
    private double height;

    TriangleCalculator(double base, double height) { this.base = base; this.height = height; }

    public double calculateArea() { return (this.base * this.height) / 2; }
}
