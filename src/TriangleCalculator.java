public class TriangleCalculator {
    private int base;
    private int height;

    TriangleCalculator(int base, int height) { this.base = base; this.height = height; }

    public static double calculateArea() { return (this.base * this.height) / 2; }
}
