import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class FileManager {
	
	
	public ArrayList<Item> readItemsTextFile()
	{
		/*
		File itemsFile = new File("C:\\Users\\wille\\Documents\\3rd_year_courses\\ENSF_409\\ENSF409_Lab3\\items.txt");
		Scanner sc = new Scanner(itemsFile);
		while(sc.hasNextLine())
		{
			String[] line = sc.split(";");
		}
		*/
		
		Item item1 = new Item(1, "testItem", 60, 1, 5);
		Item item2 = new Item(2, "testItem2", 70, 2, 5);
		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);
		return itemList;
		
	}
	
	public ArrayList<Supplier> readSupplierTextFile()
	{
		Supplier supplier = new Supplier(5, "testcompany", "test", "test");
		ArrayList<Supplier> supplierList = new ArrayList<Supplier>();
		supplierList.add(supplier);
		return supplierList;
	}

}
