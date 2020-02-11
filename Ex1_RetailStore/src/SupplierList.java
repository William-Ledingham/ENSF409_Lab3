import java.util.ArrayList;

/**
 * Provides data fields and methods for creating a Supplier List for the storage and management of a list of suppliers.
 * @author William Ledingham
 *@version 1.0
 *@since 2020-02-11
 */
public class SupplierList {

	/**
	 * ArrayList of Suppliers.
	 */
	private ArrayList<Supplier> supplierList;
	
	/**
	 * Construct the SupplierList with a empty supplierList.
	 */
	SupplierList()
	{
		supplierList = new ArrayList<Supplier>();
	}
	/**
	 * Adds a new supplier to the list of suppliers.
	 * @param newSupplier New supplier to be added to list.
	 */
	public void addSupplier(Supplier newSupplier)
	{
		supplierList.add(newSupplier);
	}
	/**
	 * Adds a ArrayList of new Suppliers to the existing list.
	 * @param supplierList List of new Suppliers.
	 */
	public void addSupplierList(ArrayList<Supplier> supplierList)
	{
		for(Supplier supplier : supplierList)
		{
			addSupplier(supplier);
		}
	}
	
}
