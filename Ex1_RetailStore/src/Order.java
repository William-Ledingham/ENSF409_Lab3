import java.util.ArrayList;

/**
 * Provides methods and data fields to create an Order that stores and manages a list of order lines.
 * @author William Ledingham
 * @version 1.0
 * @since 2020-02-11
 *
 */
public class Order {
	/**
	 * ArrayList of OrderLine's that are the items for the order.
	 */
	private ArrayList<OrderLine> orderLineList;
	/**
	 * Unique identification number for the order.
	 */
	private int orderID;
	/**
	 * Data the order was created.
	 */
	private String dateOrdered;
	
	/**
	 * Constructs the Order with default values of the date ordered and order ID.
	 * Has a empty list of order lines for future additions.
	 */
	Order()
	{
		dateOrdered = "2020-02-14";
		orderID = 100;
		orderLineList = new ArrayList<OrderLine>();
	}
	/**
	 * Adds an orderLine to the list of orderLine's part of the order.
	 * @param orderLine New orderLine to add.
	 */
	public void addOrderLine(OrderLine orderLine)
	{
		orderLineList.add(orderLine);
	}
	/**
	 * Prints the order to a text file.
	 * Implemented by sending string to fileManager class.
	 */
	public void printToTextFile()
	{
		FileManager file = new FileManager();
		file.printOrder(toString());
		System.out.printf("\nDone printing to text file\n");
	}

	/**
	 * Returns the date the order was placed.
	 * @return Date ordered.
	 */
	public String getDateOrdered() {
		return dateOrdered;
	}
	/**
	 * Sets the order date of the order.
	 * @param dateOrdered
	 */
	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	/**
	 * Returns the order ID.
	 * @return Order ID.
	 */
	public int getOrderID() {
		return orderID;
	}
	/**
	 * Sets the order ID of the order.
	 * @param orderID New order ID.
	 */
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	/**
	 * Returns a formatted String of all the orderLines in the order.
	 */
	public String toString()
	{
		String s = "ORDER ID:    " + orderID + "\nDate Ordered:     " + dateOrdered;
		
		for(OrderLine orderLine : orderLineList)
		{
			s += "\n\n" + orderLine.toString();
		}
		return s;
	}

}
