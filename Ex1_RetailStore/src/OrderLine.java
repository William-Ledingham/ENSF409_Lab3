
public class OrderLine {

	private Item item;
	private int amountOrdered;
	
	OrderLine(Item item, int amountOrdered)
	{
		this.item = item;
		this.amountOrdered = amountOrdered;
	}
	
	
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getAmountOrdered() {
		return amountOrdered;
	}
	public void setAmountOrdered(int amountOrdered) {
		this.amountOrdered = amountOrdered;
	}
	
}
