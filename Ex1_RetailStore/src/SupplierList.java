import java.util.ArrayList;

public class SupplierList {

	private ArrayList<Supplier> supplierList;
	
	SupplierList()
	{
		supplierList = new ArrayList<Supplier>();
	}
	SupplierList(ArrayList<Supplier> supplierList)
	{
		this.supplierList = supplierList;
	}
	
	public void addSupplier(Supplier newSupplier)
	{
		supplierList.add(newSupplier);
	}
	
	public void addSupplierList(ArrayList<Supplier> supplierList)
	{
		for(Supplier supplier : supplierList)
		{
			addSupplier(supplier);
		}
	}
	
}
