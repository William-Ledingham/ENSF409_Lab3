import java.io.*;
import java.util.ArrayList;

/**
 * Provides methods and data field to create a Shop for hosting an inventory of items and suppliers.
 * @author William Ledingham
 * @version 1.0
 * @since 2020-02-11
 *
 */
public class Shop {
	/**
	 * Inventory of the shop that contains different items.
	 */
	private Inventory inventory;
	/**
	 * SupplierList of the shop that contains different suppliers.
	 */
	private SupplierList supplierList;
	
	/**
	 * Constructs the Shop with empty inventory and supplierList.
	 */
	Shop()
	{
		this.inventory = new Inventory();
		this.supplierList = new SupplierList();
	}
	
	/**
	 * Imports data from text files by using utility class fileManager.
	 */
	public void importDataTextFiles()
	{
		FileManager fileManager = new FileManager();
		ArrayList<Item> items = fileManager.readItemsTextFile();
		ArrayList<Supplier> suppliers = fileManager.readSupplierTextFile();
		fileManager.matchItemsAndSuppliers(items, suppliers);
		inventory.addItemList(items);
		supplierList.addSupplierList(suppliers);
	}
	
	/**
	 * Checks the quantity of an item.
	 * @param item The item to have its quantity checked.
	 */
	public void checkItemQuantity(Item item)
	{
		inventory.checkItemQuantity(item);
	}
	/**
	 * Decreases the quantity of an item by a specified amount.
	 * @param id ID of item to have quantity reduced.
	 * @param amount Amount to decrease the quantity of item.
	 */
	public void decreaseItemQuantity(int id, int amount)
	{
		inventory.decreaseItemQuantity(id, amount);
	}
	
	/**
	 * Prints the inventory of the shop which includes even item.
	 */
	public void printInventory()
	{
		System.out.printf(getInventory().toString());
	}
	/**
	 * Prints the order for the inventory to a text file.
	 */
	public void printOrderTextFile()
	{
		inventory.printOrderTextFile();
	}
	/**
	 * Searches for item using item name.
	 * @param s Item name to search for.
	 * @return Returns the item.
	 */
	public Item searchToolName(String s)
	{
		return inventory.searchToolName(s);	
	}
	/**
	 * Searches for item using item ID number.
	 * @param id Item ID to search for.
	 * @return Returns the item.
	 */
	public Item searchToolID(int id)
	{
		return inventory.searchToolID(id);
	}
	/**
	 * Returns the inventory object of the shop.
	 * @return Pointer to inventory of the shop.
	 */
	public Inventory getInventory() {
		return inventory;
	}
	/**
	 * Sets the Inventory of the shop.
	 * @param inventory New inventory.
	 */
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	/**
	 * Returns the ArrayList of suppliers
	 * @return ArrayList of suppliers.
	 */
	public SupplierList getSupplierList() {
		return supplierList;
	}
	/**
	 * Sets the supplierList to new supplierList.
	 * @param supplierList New supplierList.
	 */
	public void setSupplierList(SupplierList supplierList) {
		this.supplierList = supplierList;
	}

}
