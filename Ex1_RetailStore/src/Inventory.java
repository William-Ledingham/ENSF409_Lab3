
import java.util.ArrayList;

public class Inventory {

	private ArrayList<Item> itemList;
	private Order order;
	
	Inventory()
	{
		itemList = new ArrayList<Item>();
		order = new Order();
	}
	Inventory(ArrayList<Item> itemList)
	{
		this.itemList = itemList;
	}
	
	public void decreaseItemQuantity(int id, int amount)
	{
		Item item = searchToolID(id);
		item.setQuantity(item.getQuantity() - amount);
		if(item.getQuantity() < 40)
		{
			OrderLine newOrderLine = new OrderLine(item, 50 - item.getQuantity());
			order.addOrderLine(newOrderLine);
		}
	}
	
	public void addItemList(ArrayList<Item> itemList)
	{
		for(Item item : itemList)
		{
			this.itemList.add(item);
		}
	}
	
	public void printOrderTextFile()
	{
		order.printToTextFile();
	}

	
	public Item searchToolName(String s)
	{
		for(Item item : itemList)
		{
			if(s.compareTo(item.getDescription()) == 0)
			{
				return item;
			}
		}
		return null;
	}
	public Item searchToolID(int id)
	{
		for(Item item : itemList)
		{
			if(id == item.getIdNumber())
			{
				return item;
			}
		}
		return null;
	}
	
	public void addItem(Item item)
	{
		itemList.add(item);
	}
	
	public String toString()
	{
		String s = new String();
		for(Item item : itemList)
		{
			s += item.toString();
		}
		return s;
	}
}
