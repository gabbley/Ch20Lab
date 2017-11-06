import java.util.TreeMap;
import java.util.TreeSet;

public class Brokerage implements Login {

	private TreeMap<String, Trader> registeredTraders;
	private TreeSet<Trader> loggedInTraders;
	private StockExchange exchange;

	Brokerage() {
		registeredTraders = new TreeMap<String, Trader>();
		loggedInTraders = new TreeSet<Trader>();
		exchange = new StockExchange();
	}

	Brokerage(StockExchange ex) {
		registeredTraders = new TreeMap<String, Trader>();
		loggedInTraders = new TreeSet<Trader>();
		exchange = ex;
	}

	@Override
	public int addUser(String name, String password) {
		int len = name.length();
		if (len < 4 || len > 10)
			return -1;
		len = password.length();
		if (len < 2 || len > 10)
			return -2;
		if (registeredTraders.containsKey(name))
			return -3;

		registeredTraders.put(name, new Trader(this, password, name));
		return 0;
	}

	public void getQuote(String symbol, Trader trader) {
		trader.receiveMessage(exchange.getQuote(symbol));
	}

	@Override
	public int login(String name, String password) {
		Trader trader = registeredTraders.get(name);

		if (trader == null)
			return -1;
		String storedPassword = trader.getPassword();
		if (!storedPassword.equals(password))
			return -2; // screen name is not found
		if (registeredTraders.containsValue(trader))
			return -3;

		loggedInTraders.add(trader);
		trader.openWindow();
		if (!trader.hasMessages()){
			trader.receiveMessage("Welcome to Safe Trade");
		}
		return 0;
	}

	public void logout(Trader trader) {
		if (loggedInTraders.contains(trader))
			loggedInTraders.remove(trader);
	}

	public void placeOrder(TradeOrder order) {
		this.placeOrder(order);
	}

}
