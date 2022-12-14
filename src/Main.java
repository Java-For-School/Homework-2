import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bronze, silver, gold, travelExpenses, extraExpenses;
        double base, height, dollarRate;

        System.out.print("Enter amount of 10 points: ");
        bronze = scanner.nextInt();

        System.out.print("Enter amount of 100 points: ");
        silver = scanner.nextInt();

        System.out.print("Enter amount of 1000 points: ");
        gold = scanner.nextInt();

        PointsCounter counter = new PointsCounter(bronze, 10, silver, 100, gold, 1000);

        System.out.printf("User has accumulated: %d points.\n", counter.countPoints());

        System.out.print("Enter triangle base: ");
        base = scanner.nextDouble();

        System.out.print("Enter triangle height: ");
        height = scanner.nextDouble();

        TriangleCalculator triangleCalculator = new TriangleCalculator(base, height);

        System.out.printf("Triangle area is: %f.\n", triangleCalculator.calculateArea());

        System.out.print("Enter travel expenses: ");
        travelExpenses = scanner.nextInt();
        System.out.print("Enter extra expenses: ");
        extraExpenses = scanner.nextInt();
        System.out.print("Enter current Dollar rate: ");
        dollarRate = scanner.nextDouble();

        TravelExpensesCalculator travelExpensesCalculator = new TravelExpensesCalculator(travelExpenses, extraExpenses, dollarRate);
        System.out.printf("Total travel expenses in LIS: %f.\n", travelExpensesCalculator.toLIS());
    }
}
