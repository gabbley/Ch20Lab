import java.text.DecimalFormat;

public class TradeOrder {

	private int numShares;
	private double price;
	private String symbol;
	private boolean buy;
	private boolean market;
	public Trader trader;

	TradeOrder(Trader t, String s, boolean buy, boolean market, int shares, double price) {

		trader = t;
		symbol = s;
		this.buy = buy;
		numShares = shares;
		this.market = market;
		this.price = price;

	}

	public String toString() {
		String buyOrSell, marketOrLimit;
		if (buy)
			buyOrSell = "buy";
		else
			buyOrSell = "sell";
		if (market)
			marketOrLimit = "market";
		else
			marketOrLimit = "limit";
		return symbol + "\n" + buyOrSell + "\n" + numShares + "\n" + marketOrLimit + "\n" + Stock.money.format(price);
	}
}
