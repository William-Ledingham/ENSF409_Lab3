import java.util.Scanner;
/**
 * Front end for the retail store application.
 * Provides menu for interacting with the Shop and its inventory.
 * @author William Ledingham
 * @version 1.0
 * @since 2020-02-11
 *
 */
public class FrontEnd {

	/**
	 * The Shop that holds all the data.
	 */
	private Shop shop;
	/**
	 * Scanner for user input.
	 */
	private Scanner sc;
	
	/**
	 * Constructs the front end with a new shop and imports the data for that shop.
	 */
	FrontEnd()
	{
		shop = new Shop();
		shop.importDataTextFiles();
		sc = new Scanner(System.in);
	}
	
	/**
	 * Prompts user for Tool Name.
	 * @return String of the users answer.
	 */
	private String userEnterToolName()
	{
		System.out.printf("Enter Tool Name:\n");
		return sc.nextLine();
	}
	/**
	 * Prompts user for Tool ID.
	 * @return Int of the users answer.
	 */
	private int userEnterToolID()
	{
		System.out.printf("Enter Tool ID:\n");
		return Integer.parseInt(sc.nextLine());
	}
	
	/**
	 * Searches the shop for tool by name and prints result.
	 */
	private void searchToolByName()
	{
		String name = userEnterToolName();
		Item item = shop.searchToolName(name);
		System.out.println(item);
	}
	/**
	 * Searches the shop for tool by ID and prints result.
	 */
	private void searchToolByID()
	{
		Item item = shop.searchToolID(userEnterToolID());
		System.out.println(item);
		
	}
	/**
	 * Checks the item quantity of a tool specified by user.
	 * Prints result.
	 */
	private void checkItemQuantity()
	{
		Item item = shop.searchToolID(userEnterToolID());
		shop.checkItemQuantity(item);
		
	}
	/**
	 * Decreases an item quantity specified by user.
	 * Prints result
	 */
	private void decreaseItemQuantity()
	{
		int id = userEnterToolID();
		System.out.printf("Enter amount to decrease quantity:\n");
		int amount = Integer.parseInt(sc.nextLine());
		shop.decreaseItemQuantity(id, amount);		
	}
	
	
	/**
	 * Menu for user to interact with shop through commands.
	 */
	public void menu()
	{
		while(true)
		{
			System.out.printf("\n1. List all tools"
					+ "\n2. Search for tool by toolName"
					+ "\n3. Search for tool by toolID"
					+ "\n4. Check item quantity"
					+ "\n5. Decrease Item quantity"
					+ "\n6. Print Order to Text File"
					+ "\n7. Quit\n");
			int input = Integer.parseInt(sc.nextLine());
			switch(input)
			{
			case 1:
				shop.printInventory();
				break;
			case 2:
				searchToolByName();
				break;
			case 3:
				searchToolByID();
				break;
			case 4:
				checkItemQuantity();
				break;
			case 5:
				decreaseItemQuantity();
				break;
			case 6:
				shop.printOrderTextFile();
				break;
			case 7:
				return;
			default:
				break;
			}
		}
	}
	
	/**
	 * Main that starts the front end of the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		FrontEnd frontEnd = new FrontEnd();		
		frontEnd.menu();
	}

}
