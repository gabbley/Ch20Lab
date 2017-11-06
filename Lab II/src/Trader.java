import java.util.ArrayList;

public class Trader {

	private Brokerage brokerage;
	private String username;
	private String password;
	public ArrayList<String> mail;
	private TraderWindow myWindow;

	Trader(Brokerage b, String u, String p) {
		brokerage = b;
		username = u;
		password = p;
		mail = new ArrayList<String>();
	}

	public String toString() {
		return brokerage + ": " + username;
	}

	public Brokerage getBrokerage() {
		return brokerage;
	}

	public void setBrokerage(Brokerage brokerage) {
		this.brokerage = brokerage;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void getQuote(String symbol) {

	}

	public int compareTo(Trader other) {
		return this.getUsername().compareToIgnoreCase(other.getUsername());
	}

	public boolean equals(Object other) {
		return (this.compareTo((Trader) other) == 0);
	}

	public boolean hasMessages() {
		return (mail.size() > 0);
	}

	public void openWindow() {
		myWindow = new TraderWindow(this);
		removeMessages();
	}

	public void placeOrder(TradeOrder order) {

	}

	public void quit() {

	}

	public void receiveMessage(String msg) {
		if (hasMessages())
			mail.add(msg);
		if (myWindow != null) {
			removeMessages();
		}
	}

	public void removeMessages() {
		while (mail.size() > 0)
			myWindow.showMessage(mail.remove(0));
	}
}
