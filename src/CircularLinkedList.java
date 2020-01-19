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
	
	public ListNode getHead()
	{
		return this.head;
	}
	
	public boolean isEmpty()
	{
		return this.size == 0;
	}
	
	public void addNode(String value, boolean isSpecial)
	{
		ListNode node = new ListNode(value);
		
		if (!isSpecial)
		{
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
		}
		else
		{
			node.setNext(this.head);
			this.head = node;
			this.tail.setNext(this.head);
		}
		
		this.size++;
	}
	
	public void remove(ListNode node)
	{
		ListNode prevNode = null;
		ListNode temp = this.head;
		
		for (int i = 0; i < this.size; i++)
		{
			if (temp.getNext() == node)
				prevNode = temp;
			else
				temp = temp.getNext();
		}
		
		if (node == this.tail)
		{
			this.tail = prevNode;
			this.tail.setNext(this.head);
			this.size--;
		}
		else if (node == this.head)
		{
			this.head = node.getNext();
			this.tail.setNext(this.head);
			this.size--;
		}
		else if (node != this.tail && node != this.head)
		{
			prevNode.setNext(node.getNext());
			this.size--;
		}
	}
	
	public String toString()
	{
		String str = "[";
		ListNode node = this.head;
		
		for (int i = 0; i < this.size - 1; i++)
		{
			str += node.getValue() + ", ";
			node = node.getNext();
		}
		
		str += this.tail.getValue() + "]";
		
		return str;
	}
}
