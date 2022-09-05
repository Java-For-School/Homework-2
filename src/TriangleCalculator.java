public class TriangleCalculator {
    private double base;
    private double height;

    TriangleCalculator(int base, int height) { this.base = base; this.height = height; }

    public double calculateArea() { return (this.base * this.height) / 2; }
}
