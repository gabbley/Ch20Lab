import java.text.DecimalFormat;
import java.util.PriorityQueue;

public class Stock implements Comparable<Stock>{

	private String symbol;
	private String name;
	private double lastPrice, lowPrice, highPrice;
	private int dayVolume;
	
	private PriorityQueue<TradeOrder> buyOrders;
	private PriorityQueue<TradeOrder> sellOrders;
	
	public static DecimalFormat money = new DecimalFormat("$#,##0.00");
	
	Stock (String s, String n, double p){
		symbol = s;
		name = n;
		lowPrice = p;
		highPrice = p;
		lastPrice = p;
		dayVolume = 0;
		buyOrders = new PriorityQueue<TradeOrder>();
		sellOrders = new PriorityQueue<TradeOrder>();
		
	}
	
	public String getQuote(){
		return this.toString();
	}
	
	public void placeOrder(TradeOrder order) {
		
	}
	
	public String toString() {
		return symbol + ", " + name + ", " + money.format(lastPrice);
	}


	@Override
	public int compareTo(Stock o) {
		// TODO Auto-generated method stub
		return (int) (lastPrice - this.lastPrice);
	}
	
	
	
}
