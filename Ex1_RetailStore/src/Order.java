import java.util.ArrayList;

public class Order {
	private ArrayList<OrderLine> orderLineList;
	private int orderID;
	private String dateOrdered;
	
	Order()
	{
		
	}
	
	public void addOrderLine(OrderLine orderLine)
	{
		orderLineList.add(orderLine);
	}
	
	
	public String getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	

}
