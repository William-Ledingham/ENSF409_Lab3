
import java.util.ArrayList;

public class Inventory {

	private ArrayList<Item> itemList;
	
	
	Inventory(ArrayList<Item> itemList)
	{
		this.itemList = itemList;
	}
	
	
	public void addItem(Item item)
	{
		itemList.add(item);
	}
	
	
}
