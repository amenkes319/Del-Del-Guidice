import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Client
{
	public static void main(String[] args)
	{
		System.out.println("abc".compareTo("a"));
		CircularLinkedList list = fillList();
		
		final int MIN = 3;
		
		while (list.getSize() > 3)
		{
			
		}
	}
	
	private static CircularLinkedList fillList()
	{
		CircularLinkedList list = new CircularLinkedList();
		
		try
		{
			Scanner scanner = new Scanner(new File("src\\names.txt"));
			
			while (scanner.hasNextLine())
				list.addNode(scanner.nextLine());
			
			scanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
}
