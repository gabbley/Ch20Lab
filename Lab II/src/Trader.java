
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
	
}
