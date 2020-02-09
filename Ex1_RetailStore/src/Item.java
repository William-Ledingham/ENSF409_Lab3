
public class Item {

	private int idNumber;
	private String description;
	private int quantity;
	private int price;
	private int supplierId;
	private Supplier supplier;
	
	
	
	
	
	Item(int idNumber, String description, int quantity, int price, int supplierId, Supplier supplier)
	{
		this.idNumber = idNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.setSupplier(supplier);
	}
	Item(int idNumber, String description, int quantity, int price, int supplierId)
	{
		this.idNumber = idNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.supplierId = supplierId;
	}
	
	public String toString()
	{
		String s = "\nID Number: " + idNumber + "\nDescription: " + description + "\nQuantity: " + quantity
				+ "\nPrice: " + price + "\nSupplier: " +
				supplier.getCompanyName() + "\n";
		return s;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
}
