import java.text.DecimalFormat;

public class StockTester {

	public static void main (String[] args) {
		Stock s = new Stock("HELP", "Tutoring, Inc.", 1000.50);
		System.out.print(s.getQuote());
	}
	
}
