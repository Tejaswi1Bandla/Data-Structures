
public class deleteatfirst {
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
public ListNode delete()
{
	if(head==null)
	{
		return null;
	}
	else
	{
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp; // returns the deleted node
	}
}
public static void main(String args[])
{
	deleteatfirst d1=new deleteatfirst();
	d1.head=new ListNode(2);
	ListNode sec=new ListNode(12);
    ListNode thr=new ListNode(22);
    d1.head.next=sec;
    sec.next=thr;
    d1.display();
	d1.delete();
	System.out.println();
	d1.display();
}
}
