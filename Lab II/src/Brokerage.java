import java.util.TreeMap;
import java.util.TreeSet;

public class Brokerage implements Login{

	private TreeMap<String, Trader> registeredTraders;
	private TreeSet<Trader> loggedInTraders;
	
	Brokerage(){
		registeredTraders = new TreeMap<String, Trader>();
		loggedInTraders = new TreeSet<Trader>();
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
			return -2;
					
		registeredTraders.put(name, new Trader(this, password, name));
		return 0;
	}
	@Override
	public int login(String name, String password) {
		Trader trader = registeredTraders.get(name);
		loggedInTraders.add(trader);
		return 0;
	}
	
}
