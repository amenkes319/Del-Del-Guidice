import java.io.File;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		CircularLinkedList list = fillList();
		int originalSize = list.getSize();
		final int MIN = 3;
		boolean bSpecial = false;
		while (list.getSize() > 1)
		{
			int rand = (int) (Math.random() * (originalSize - MIN) + MIN);
			ListNode node = list.getHead();
			
			for (int i = 0; i < rand - 1; i++)
			{
				System.out.print("Del " + node.getValue() + ", ");
				node = node.getNext();
			}
			System.out.print("Giudice " + node.getValue() + "\n");
			
			if (node.getValue().equals("Andrew") && !bSpecial)
			{
				list.addNode(node.getValue(), true);
				bSpecial = true;
			}
			
			list.remove(node);
			
			System.out.println(list + "\n");
		}
		
		System.out.println(list.getHead().getValue() + " is your winnner!");
	}
	
	private static CircularLinkedList fillList()
	{
		CircularLinkedList list = new CircularLinkedList();
		
		try
		{
			Scanner scanner = new Scanner(new File("src\\names.txt"));
			
			while (scanner.hasNextLine())
				list.addNode(scanner.nextLine(), false);
			
			scanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
}
