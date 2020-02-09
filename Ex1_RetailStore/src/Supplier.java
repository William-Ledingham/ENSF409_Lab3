import java.util.ArrayList;

public class Supplier {

	private int idNumber;
	private String companyName;
	private String address;
	private String salesContact;
	private ArrayList<Item> itemsSoldBySupplier;
	
	
	Supplier(int idNumber, String companyName, String address, String salesContact)
	{
		this.idNumber = idNumber;
		this.companyName = companyName;
		this.address = address;
		this.salesContact = salesContact;
		this.itemsSoldBySupplier = new ArrayList<Item>();
	}
	
	
	
	
	
	
	
	
	
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalesContact() {
		return salesContact;
	}
	public void setSalesContact(String salesContact) {
		this.salesContact = salesContact;
	}
	public ArrayList<Item> getItemsSoldBySupplier() {
		return itemsSoldBySupplier;
	}
	public void setItemsSoldBySupplier(ArrayList<Item> itemsSoldBySupplier) {
		this.itemsSoldBySupplier = itemsSoldBySupplier;
	}
	
}
