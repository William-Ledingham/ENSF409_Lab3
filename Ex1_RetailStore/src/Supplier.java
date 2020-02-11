import java.util.ArrayList;

/**
 * Contains data fields and methods for creating a supplier to hold information about the supplier for an item.
 * @author William Ledingham
 * @version 1.0
 * @since 2020-02-11
 *
 */
public class Supplier {

	/**
	 * Unique identification number for a supplier.
	 */
	private int idNumber;
	/**
	 * The name of the supplier.
	 */
	private String companyName;
	/**
	 * Address of the supplier.
	 */
	private String address;
	/**
	 * Sale Contact of the supplier.
	 */
	private String salesContact;
	/**
	 * ArrayList of items sold by the supplier.
	 */
	private ArrayList<Item> itemsSoldBySupplier;
	
	/**
	 * Constructs a Supplier and assigns the data members.
	 * Leaves the list of items sold by the supplier blank for future addition.
	 * @param idNumber ID number of the supplier.
	 * @param companyName Company Name of the supplier.
	 * @param address Address of supplier.
	 * @param salesContact Sales Contact of supplier.
	 */
	Supplier(int idNumber, String companyName, String address, String salesContact)
	{
		this.idNumber = idNumber;
		this.companyName = companyName;
		this.address = address;
		this.salesContact = salesContact;
		this.itemsSoldBySupplier = new ArrayList<Item>();
	}
	/**
	 * Returns the ID number of the supplier.
	 * @return Supplier ID number.
	 */
	public int getIdNumber() {
		return idNumber;
	}
	/**
	 * Sets the ID number of the supplier
	 * @param idNumber New ID number.
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * Returns the Company Name of the supplier.
	 * @return Supplier Company Name.
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * Sets the Company Name of the supplier.
	 * @param companyName New company name.
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * Returns the Address of the supplier.
	 * @return Supplier Address.
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Sets the Address of the supplier
	 * @param address New Address.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * Returns the Sales Contact of the supplier.
	 * @return Supplier Sales Contact.
	 */
	public String getSalesContact() {
		return salesContact;
	}
	/**
	 * Sets the Sales Contact of the supplier
	 * @param salesContact New sales contact.
	 */
	public void setSalesContact(String salesContact) {
		this.salesContact = salesContact;
	}
	/**
	 * Returns the ArrayList of Items sold by the supplier.
	 * @return Items sold by supplier.
	 */
	public ArrayList<Item> getItemsSoldBySupplier() {
		return itemsSoldBySupplier;
	}
	/**
	 * Sets the ArrayList of items that the supplier sells.
	 * @param itemsSoldBySupplier New list of items.
	 */
	public void setItemsSoldBySupplier(ArrayList<Item> itemsSoldBySupplier) {
		this.itemsSoldBySupplier = itemsSoldBySupplier;
	}
	
}
