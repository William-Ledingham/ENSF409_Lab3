import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class FileManager {
	
	
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
	
	public void printOrder(int orderID, String dateOrdered, ArrayList<OrderLine> orderList)
	{
		try {
			FileWriter fw = new FileWriter("C:\\Users\\wille\\Documents\\3rd_year_courses\\ENSF_409\\ENSF409_Lab3\\Ex1_RetailStore\\src\\order.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("ORDER ID:    " + orderID + "\nDate Ordered:     " + dateOrdered + "\n\n");
			for(OrderLine order : orderList)
			{
				bw.write("Item Description:    " + order.getItem().getDescription() + "\nAmount Ordered:     " + order.getAmountOrdered() 
				+ "Supplier:     " + order.getItem().getSupplier().getCompanyName() + "\n\n");
			}
			
		} catch (Exception e) {
			System.out.printf("\nError reading supplier text file");
		}
	}

}
