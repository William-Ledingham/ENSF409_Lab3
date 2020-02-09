import java.io.*;
import java.util.ArrayList;


public class Shop {
	
	private Inventory inventory;
	private SupplierList supplierList;
	
	Shop()
	{
		this.inventory = new Inventory();
		this.supplierList = new SupplierList();
	}
	
	public void readTextFiles()
	{
		FileManager fileManager = new FileManager();
		ArrayList<Item> items = fileManager.readItemsTextFile();
		ArrayList<Supplier> suppliers = fileManager.readSupplierTextFile();
		
		for(Item item: items)
		{
			for(Supplier supplier: suppliers)
			{
				if(item.getSupplierId() == supplier.getIdNumber())
				{
					item.setSupplier(supplier);
					supplier.getItemsSoldBySupplier().add(item);
				}
			}
		}
		
		for(Item item: items)
		{
			getInventory().addItem(item);
		}
		for(Supplier supplier: suppliers)
		{
			getSupplierList().addSupplier(supplier);
		}
		
	}
	
	public void decreaseItemQuantity(int id, int amount)
	{
		inventory.decreaseItemQuantity(id, amount);
	}
	
	public void printInventory()
	{
		System.out.printf(getInventory().toString());
	}
	
	public Item searchToolName(String s)
	{
		return inventory.searchToolName(s);	
	}
	public Item searchToolID(int id)
	{
		return inventory.searchToolID(id);
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public SupplierList getSupplierList() {
		return supplierList;
	}

	public void setSupplierList(SupplierList supplierList) {
		this.supplierList = supplierList;
	}

}
