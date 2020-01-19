public class ListNode
{
	private ListNode next;
	private String value;

	public ListNode(String value)
	{
		this.value = value;
	}
	
	public ListNode getNext()
	{
		return this.next;
	}

	public void setNext(ListNode next)
	{
		this.next = next;
	}

	public String getValue()
	{
		return this.value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}
}