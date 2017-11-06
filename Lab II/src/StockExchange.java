import java.util.HashMap;

public class StockExchange {

	private HashMap<String, Stock> stocks;

	public StockExchange() {
		stocks = new HashMap<String, Stock>();
	}

	public void listStock(String symbol, String name, double price) {
		if (stocks.get(symbol) != null)
			stocks.put(symbol, new Stock(symbol, name, price));
		else
			throw new IllegalArgumentException("Stock Does Not Exist");
	}

	public String getQuote(String symbol) {
		return stocks.get(symbol).getQuote();
	}

	public void placeOrder(TradeOrder order) {
		if (stocks.get(order.getSymbol()) != null)
			stocks.get(order.getSymbol()).placeOrder(order);
		else
			throw new IllegalArgumentException("Stock Does Not Exist");
	}

}
