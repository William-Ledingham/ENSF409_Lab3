
import java.util.ArrayList;

/**
 * Provides methods and data types to create a Inventory for the storage and management of Items.
 * @author William Ledingham
 * @version 1.0
 * @since 2020-02-11
 *
 */
public class Inventory {

	/**
	 * ArrayList of items in the inventory.
	 */
	private ArrayList<Item> itemList;
	/**
	 * Order object for ordering new items for the inventory.
	 */
	private Order order;
	/**
	 * Constructs the inventory with a blank ArrayList of items and a blank order.
	 */
	Inventory()
	{
		itemList = new ArrayList<Item>();
		order = new Order();
	}
	/**
	 * Checks the quantity of a item and places an order if less than desired amount.
	 * @param item The item to have its quantity checked.
	 */
	public void checkItemQuantity(Item item)
	{
		if(item.getQuantity() < 40)
		{
			OrderLine newOrderLine = new OrderLine(item, 50 - item.getQuantity());
			order.addOrderLine(newOrderLine);
			System.out.printf("Order place for item. Quantity is: %d", item.getQuantity());
		}
		else
		{
			System.out.printf("Item ID of %d has a quantity is %d", item.getIdNumber(), item.getQuantity());
		}
	}
	
	/**
	 * Deceases the quantity of a item in the inventory by a specified amount.
	 * @param id ID of item to have quantity decreased.
	 * @param amount The amount to decease the quantity by.
	 */
	public void decreaseItemQuantity(int id, int amount)
	{
		Item item = searchToolID(id);
		item.setQuantity(item.getQuantity() - amount);
		System.out.printf("Tool ID %d has a quantity of: %d\n", item.getIdNumber(), item.getQuantity());
		if(item.getQuantity() < 40)
		{
			OrderLine newOrderLine = new OrderLine(item, 50 - item.getQuantity());
			order.addOrderLine(newOrderLine);
			System.out.printf("An order line has been added.\n");
		}
		
	}
	
	/**
	 * Adds items in an ArrayList to the existing inventory.
	 * @param itemList ArrayList of new items to add.
	 */
	public void addItemList(ArrayList<Item> itemList)
	{
		for(Item item : itemList)
		{
			this.itemList.add(item);
		}
	}
	/**
	 * Tells the order object to print its contents to a text file.
	 */
	public void printOrderTextFile()
	{
		order.printToTextFile();
	}

	/**
	 * Searches the inventory by the specified name.
	 * @param s Description of the item to search for.
	 * @return Item pointer.
	 */
	public Item searchToolName(String s)
	{
		for(Item item : itemList)
		{
			if(s.compareTo(item.getDescription()) == 0)
			{
				return item;
			}
		}
		System.out.println("No tool with such a name.");
		return null;
	}
	/**
	 * Searches the inventory by the specified ID
	 * @param id ID of the item to search for.
	 * @return Item pointer.
	 */
	public Item searchToolID(int id)
	{
		for(Item item : itemList)
		{
			if(id == item.getIdNumber())
			{
				return item;
			}
		}
		System.out.println("No tool with such a ID.");
		return null;
	}
	/**
	 * Adds item to the inventory list.
	 * @param item Item to be added to the list.
	 */
	public void addItem(Item item)
	{
		itemList.add(item);
	}
	/**
	 * Returns a String of all the items in the inventory.
	 */
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
