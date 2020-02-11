import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Utility class to assist the Shop in reading and printing to predefined text files.
 * @author William Ledingham
 * @version 1.0
 * @since 2020-02-11
 *
 */
public class FileManager {
	
	/**
	 * Reads text file of Items and returns an ArrayList of those Items.
	 * @return ArrayList of Items for the inventory.
	 */
	public ArrayList<Item> readItemsTextFile()
	{
		ArrayList<Item> itemList = new ArrayList<Item>();
		
		try {
			FileReader fr = new FileReader("C:\\Users\\wille\\Documents\\3rd_year_courses\\ENSF_409\\ENSF409_Lab3\\Ex1_RetailStore\\src\\items.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			while((line = br.readLine()) != null)
			{
				String[] temp = line.split(";");
				Item item = new Item(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]));
				itemList.add(item);
			}
			
		} catch (Exception e) {
			System.out.printf("\nError reading items text file");
		}
		
		return itemList;
		
	}
	
	/**
	 * Reads a text file of suppliers and returns an ArrayList of those Suppliers.
	 * @return ArrayList of Suppliers.
	 */
	public ArrayList<Supplier> readSupplierTextFile()
	{
		ArrayList<Supplier> supplierList = new ArrayList<Supplier>();
		
		try {
			FileReader fr = new FileReader("C:\\Users\\wille\\Documents\\3rd_year_courses\\ENSF_409\\ENSF409_Lab3\\Ex1_RetailStore\\src\\suppliers.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			while((line = br.readLine()) != null)
			{
				String[] temp = line.split(";");
				Supplier supplier = new Supplier(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3]);
				supplierList.add(supplier);
			}
			
		} catch (Exception e) {
			System.out.printf("\nError reading supplier text file");
		}
		
		return supplierList;
	}
	/**
	 * Matches the ArrayLists of Items and Suppliers read from the text files to each other.
	 * @param itemList ArrayList of Items to match.
	 * @param supplierList ArrayList of Suppliers to match.
	 */
	public void matchItemsAndSuppliers(ArrayList<Item> itemList, ArrayList<Supplier> supplierList)
	{
		for(Item item: itemList)
		{
			for(Supplier supplier: supplierList)
			{
				if(item.getSupplierId() == supplier.getIdNumber())
				{
					item.setSupplier(supplier);
					supplier.getItemsSoldBySupplier().add(item);
				}
			}
		}

	}
	
	/**
	 * Prints a String to the specified order text file.
	 * @param s String to be printed to text file.
	 */
	public void printOrder(String s)
	{
		try {
			PrintWriter writer = new PrintWriter("C:\\Users\\wille\\Documents\\3rd_year_courses\\ENSF_409\\ENSF409_Lab3\\Ex1_RetailStore\\src\\order.txt");
			writer.printf(s);
			writer.close();
			
		} catch (Exception e) {
			System.out.printf("\nError reading supplier text file");
		}
	
	}

}
