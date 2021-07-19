
public class middlenodes {
private ListNode head;
private static class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public void display()
{
	ListNode current=head;
	while(current!=null)
	{
		System.out.print(current.data+"-->");
		current=current.next;
	}
	System.out.print("null");
}
public ListNode findmid()
{
	ListNode current=head;
	ListNode prev=head;
	while(current!=null && current.next!=null)
	{
		prev=prev.next;
		current=current.next.next;
	}
	return prev;
}
public static void main(String args[])
{
	middlenodes m1=new middlenodes();
	m1.head=new ListNode(3);
	ListNode sec=new ListNode(88);
	ListNode three=new ListNode(44);
	m1.head.next=sec;
	sec.next=three;
	m1.display();
	ListNode middle=m1.findmid();
	System.out.print(middle.data);
	
}
}
