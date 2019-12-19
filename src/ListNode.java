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
		return next;
	}

	public void setNext(ListNode next)
	{
		this.next = next;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}
}