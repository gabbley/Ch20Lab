
public class Trader {

	private Brokerage brokerage;
	private String username;
	private String password;
	
	Trader(Brokerage b, String u, String p){
		brokerage = b;
		username = u;
		password = p;
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
		
	}
	
	public boolean equals(Object other) {
		
	}
	
	public boolean hasMessages() {
		
	}
	
	public void openWindow() {
		
	}
	
	public void placeOrder(TradeOrder order) {
		
	}
	
	public void quit() {
		
	}
	
	public void receiveMessage() {
		
	}
	
}
