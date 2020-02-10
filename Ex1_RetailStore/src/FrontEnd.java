import java.util.ArrayList;
import java.util.Scanner;

public class FrontEnd {

	
	public static void main(String[] args) {
		
		Shop shop = new Shop();
		shop.importDataTextFiles();
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.printf("\n1. List all tools\n2. Search for tool by toolName\n3. "
					+ "Search for tool by toolID\n4. Check item quantity\n5. Decrease Item quantity\n6. Print Order to Text File\n7. Quit\n");
			int input = Integer.parseInt(sc.nextLine());
			switch(input)
			{
			case 1:
				shop.printInventory();
				break;
			case 2:
				System.out.printf("Enter Tool Name:\n");
				String searchTool = sc.nextLine();
				Item item2 = shop.searchToolName(searchTool);
				if(item2 == null)
				{
					System.out.printf("No tool with such a name.\n");
				}
				else
				{
					System.out.printf(item2.toString());
				}
				break;
			case 3:
				System.out.printf("Enter Tool ID:\n");
				int id3 = Integer.parseInt(sc.nextLine());
				Item item3 = shop.searchToolID(id3);
				if(item3 == null)
				{
					System.out.printf("No tool with such a ID.\n");
				}
				else
				{
					System.out.printf(item3.toString());
				}
				break;
			case 4:
				System.out.printf("Enter Tool ID:\n");
				int id4 = Integer.parseInt(sc.nextLine());
				Item item4 = shop.searchToolID(id4);
				if(item4 == null)
				{
					System.out.printf("No tool with such a ID.\n");
				}
				else
				{
					System.out.printf("Tool ID %d has a quantity of: %d\n",item4.getIdNumber(), item4.getQuantity());
				}
				break;
			case 5:
				System.out.printf("Enter Tool ID:\n");
				int id5 = Integer.parseInt(sc.nextLine());
				System.out.printf("Enter amount to decrease quantity:\n");
				int amount = Integer.parseInt(sc.nextLine());

				shop.getInventory().decreaseItemQuantity(id5, amount);
				System.out.printf("Tool ID %d has a quantity of: %d\n",shop.searchToolID(id5).getIdNumber(), shop.searchToolID(id5).getQuantity());
				
				break;
			case 6:
				shop.printOrderTextFile();
				System.out.printf("\nDone printing to text file\n");
				break;
			case 7:
				return;
			default:
				break;
			}
		}
	
	}

}
