import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bronze, silver, gold;
        double base, height;

        System.out.println("Enter amount of 10 points: ");
        bronze = scanner.nextInt();

        System.out.println("Enter amount of 100 points: ");
        silver = scanner.nextInt();

        System.out.println("Enter amount of 1000 points: ");
        gold = scanner.nextInt();

        PointsCounter counter = new PointsCounter(bronze, 10, silver, 100, gold, 1000);

        System.out.printf("User has accumulated: %d points.\n", counter.countPoints());

        System.out.println("Enter triangle base: ");
        base = scanner.nextDouble();

        System.out.println("Enter triangle height: ");
        height = scanner.nextDouble();

        TriangleCalculator triangleCalculator = new TriangleCalculator(base, height);

        System.out.printf("Triangle area is: %f.", triangleCalculator.calculateArea());


    }
}
