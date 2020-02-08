import java.util.ArrayList;

public class FrontEnd {

	public static void main(String[] args) {
		
		Supplier supplier = new Supplier(1, "testcompany", "test", "test");		
		Item item1 = new Item(1, "testItem", 1, 1, supplier);
		Item item2 = new Item(2, "testItem2", 2, 2, supplier);

		ArrayList<Item> itemList = new ArrayList();
		itemList.add(item1);
		itemList.add(item2);
		ArrayList<Supplier> supplierArrayList = new ArrayList();
		supplierArrayList.add(supplier);
		Inventory inventory = new Inventory(itemList);
		SupplierList supplierList = new SupplierList(supplierArrayList);
		
		Shop shop = new Shop(inventory, supplierList);

	}

}
