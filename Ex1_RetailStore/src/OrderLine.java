
/**
 * Provides data fields and methods to create a order line for items that need to be ordered.
 * @author William Ledingham
 *@version 1.0
 *@since 2020-02-11
 */
public class OrderLine {

	/**
	 * Item of the order line that needs to be ordered.
	 */
	private Item item;
	/**
	 * The amount of items to order.
	 */
	private int amountOrdered;
	
	/**
	 * Constructs the Orderline with the item and amount to order.
	 * @param item Item to order.
	 * @param amountOrdered Amount of items to order.
	 */
	OrderLine(Item item, int amountOrdered)
	{
		this.item = item;
		this.amountOrdered = amountOrdered;
	}
	
	/**
	 * Returns the Item part of the order line.
	 * @return Item of order line.
	 */
	public Item getItem() {
		return item;
	}
	/**
	 * Sets the Item part of the order line.
	 * @param item New item.
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	/**
	 * Returns the amount of items ordered.
	 * @return
	 */
	public int getAmountOrdered() {
		return amountOrdered;
	}
	/**
	 * Sets the amount of items to order.
	 * @param amountOrdered New amount to order.
	 */
	public void setAmountOrdered(int amountOrdered) {
		this.amountOrdered = amountOrdered;
	}
	/**
	 * Returns a formatted String of the data for the order line.
	 */
	public String toString()
	{
		String s = "Item Description:    " + item.getDescription() + "\nAmount Ordered:     " + amountOrdered 
		+ "\nSupplier:     " + item.getSupplier().getCompanyName() + "\n\n";
		return s;
	}
	
}
