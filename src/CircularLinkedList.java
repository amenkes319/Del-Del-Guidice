public class CircularLinkedList
{
	private int size;
	private ListNode head;
	private ListNode tail;
	
	public CircularLinkedList()
	{
		size = 0;
		head = null;
		tail = null;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public boolean isEmpty()
	{
		return this.size == 0;
	}
	
	public void addNode(String value)
	{
		ListNode node = new ListNode(value);
		
		if (isEmpty())
		{
			this.head = node;
			this.tail = node;
			node.setNext(this.head);
		}
		else
		{
			this.tail.setNext(node);
			this.tail = node;
			this.tail.setNext(this.head);
		}
		
		this.size++;
	}
	
	public void remove(int index)
	{
		ListNode node = get(index);		

		if (node == this.tail)
		{
			this.tail = get(index + 1);
			this.head.setNext(this.tail);
		}
		else if (node == this.head)
		{
			this.head = get(index - 1);
			this.head.setNext(this.tail);
		}
		else
		{
			get(index - 1).setNext(get(index + 1));
	}
	
	public ListNode get(int index)
	{
		if (index < 0)
			return null;
		else if (index >= this.size)
		{
			index %= this.size;
			ListNode node = this.head;
			
			while (index != 0)
			{
				node = node.getNext();
				index--;
			}
			
			return node;
		}
		else
		{
			ListNode node = this.head;
			
			while (index != 0)
			{
				node = node.getNext();
				index--;
			}
			
			return node;
		}
	}
	
	public String toString()
	{
		String str = "[";
		
		for (int i = 0; i < this.size - 1; i++)
		{
			str += get(i).getValue() + ", ";
		}
		
		str += get(this.size-1).getValue() + "]";
		
		return str;
	}
}
