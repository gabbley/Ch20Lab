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
		if (order.isBuy()) {
			buyOrders.add(order);
		}
		else if (order.isSell()){
			sellOrders.add(order);
		}
		
		//TODO send message to trader
	}
	
	public String toString() {
		String result = company + " (" + symbol + ")\n";
		result += "Price:\t" + money.format(lastPrice);
		result += "\thi: " + money.format(highPrice);
		result += "\tlo: " + money.format(lowPrice);
		
		
		
		
		{
		TradeOrder order = sellOrders.peek();
		if (order.isLimit())
			result += money.format(order.getPrice());
		else
			result += "market";
		result += " size: " + order.getNumShares();
		}
		else
		{
			result += "none";
		}
		
		result += " Bid: ";
		
		if (!buyOrders.isEmpty()) {
			TradeOrder order = buyOrders.peek();
			if (order.isLimit())
				result += money.format(order.getPrice());
			else
				result += "market";
			result += " size: " + order.getNumShares();
			
		}
		else {
			result += "none";
		}
		
		return result;
		
		
		return symbol + ", " + name + ", " + money.format(lastPrice);
	}


	@Override
	public int compareTo(Stock o) {
		return (int) (lastPrice - this.lastPrice);
	}
	
	
	
}
