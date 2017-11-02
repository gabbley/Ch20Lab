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
	//execute orders uses .peek

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
	
	
	
	public int getNumShares() {
		return numShares;
	}

	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public void setBuy(boolean buy) {
		this.buy = buy;
	}

	public void setMarket(boolean market) {
		this.market = market;
	}

	public boolean isLimit() {
		return !market;
	}
	
	public boolean isMarket() {
		return market;
	}
	
	public boolean isBuy() {
		return buy;
	}
	
	public boolean isSell() {
		return !buy;
	}
	
	public void subtractShares(int shares) {
		numShares -= shares;
	}


}
