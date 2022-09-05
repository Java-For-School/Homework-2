import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TravelExpensesCalculator {
  private int travelExpenses;
  private int dollarRate;

  TravelExpensesCalculator(int travelExpenses, int dollarRate) { this.travelExpenses = travelExpenses; this.dollarRate = dollarRate; }
  TravelExpensesCalculator(int travelExpenses) {

  }

  private void fetchDollarRate() throws IOException {
    URL url = new URL("https://api.apilayer.com/exchangerates_data/convert?to=ILS&from=USD&amount=1");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    con.setRequestProperty("apikey", "0o8HAecaYagFFum5aWkReO9tcSBzW6Mb"); 
  }
}
