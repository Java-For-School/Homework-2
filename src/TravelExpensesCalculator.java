import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class TravelExpensesCalculator {
  private int travelExpenses;
  private double dollarRate;
  TravelExpensesCalculator(int travelExpenses, int extraExpenses, double dollarRate) { this.travelExpenses = travelExpenses + extraExpenses; this.dollarRate = dollarRate; }

  public double toLIS() { return this.travelExpenses * dollarRate; }
}
