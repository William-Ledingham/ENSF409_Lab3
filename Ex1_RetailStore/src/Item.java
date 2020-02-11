/**
 * Provides methods and data types to create a Tool or Item for a shop.
 * This class holds information about the item and knows who the item's supplier is.
 * 
 * @author William Ledingham
 * @version 1.0
 * @since 2020-02-11
 *
 */
public class Item {

	/**
	 * The identification number unique to this item.
	 */
	private int idNumber;
	/**
	 * Name of the item or description.
	 */
	private String description;
	/**
	 * The number of this item the shop has in stock.
	 */
	private int quantity;
	/**
	 * The price the item sells for.
	 */
	private double price;
	/**
	 * The identification number of the items supplier.
	 */
	private int supplierId;
	/**
	 * Pointer to the Supplier object that is the supplier for this item.
	 */
	private Supplier supplier;
	
	/**
	 * Construct Item object and assigns the data fields.
	 * This constructor take the supplier pointer as a argument.
	 * @param idNumber Identification Number.
	 * @param description Name or description of item.
	 * @param quantity Number of items in stock of item.
	 * @param price The price of the item.
	 * @param supplierId The identification number of the supplier.
	 * @param supplier Pointer to the Supplier object that supplies this item.
	 */
	Item(int idNumber, String description, int quantity, double price, int supplierId, Supplier supplier)
	{
		this.idNumber = idNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.supplier = supplier;
	}
	/**
	 * Constructs Item object and assigns data fields.
	 * This constructor does not take a Supplier pointer as an argument. It must be set later.
	 * @param idNumber
	 * @param description
	 * @param quantity
	 * @param price
	 * @param supplierId
	 */
	Item(int idNumber, String description, int quantity, double price, int supplierId)
	{
		this.idNumber = idNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.supplierId = supplierId;
	}
	/**
	 * Returns a String of formatted data for this item.
	 */
	public String toString()
	{
		String s = "\nID Number: " + idNumber + "     Description: " + description + "     Quantity: " + quantity
				+ "     Price: $" + price + "     Supplier: " +
				supplier.getCompanyName() + "\n";
		return s;
	}
	
	/**
	 * Returns the quantity of the item.
	 * @return Item quantity.
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * Sets the quantity of the item.
	 * @param quantity Number of items in stock.
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	/**
	 * Returns the description of the item.
	 * @return Item description.
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Sets the description of the item.
	 * @param description New name or description of item.
	 */
	public void setDescription(String description) {
		this.description = description;
	}	
	/**
	 * Returns the price of the item.
	 * @return Item price.
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * Sets the price of the item.
	 * @param price The new price of the item.
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * Returns the ID number of the item.
	 * @return Item ID number.
	 */
	public int getIdNumber() {
		return idNumber;
	}
	/**
	 * Sets the ID number of the item.
	 * @param idNumber The new ID number of the item.
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * Returns the supplier ID of the item.
	 * @return Item supplier ID.
	 */
	public int getSupplierId() {
		return supplierId;
	}
	/**
	 * Sets the supplier ID of the item.
	 * @param supplierId The new supplier ID.
	 */
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	/**
	 * Returns the pointer to the items supplier.
	 * @return Supplier pointer to item supplier.
	 */
	public Supplier getSupplier() {
		return supplier;
	}
	/**
	 * Sets the supplier of the item.
	 * @param supplier New pointer to the supplier for this item.
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
}
