import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class TravelExpensesCalculator {
  private int travelExpenses;
  private int dollarRate;
  TravelExpensesCalculator(int travelExpenses, int dollarRate) { this.travelExpenses = travelExpenses; this.dollarRate = dollarRate; }

  public int toLIS() { return this.travelExpenses * dollarRate; }
}
