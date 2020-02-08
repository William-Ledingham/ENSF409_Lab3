
public class Item {

	private int idNumber;
	private String description;
	private int quantity;
	private int price;
	private Supplier supplier;
	
	
	
	
	
	Item(int idNumber, String description, int quantity, int price, Supplier supplier)
	{
		this.idNumber = idNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
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
	
}
