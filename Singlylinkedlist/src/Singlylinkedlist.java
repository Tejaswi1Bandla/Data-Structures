
public class Singlylinkedlist {
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
	public void display() // prints the values
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data +"->");
			current=current.next;
		}
		System.out.print("null");
	}
	public int findlength()//finding length
	{
		if(head==null)
		{
			return 0;
		}
		ListNode current=head;
		int count=0;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}

public static void main(String args[])
{
	Singlylinkedlist s1=new Singlylinkedlist();
	s1.head=new ListNode(10);
	ListNode second=new ListNode(1);
	ListNode third=new ListNode(11);
	ListNode fourth=new ListNode(4);
	//we have 4 nodes we will connect them
	s1.head.next=second;//10--1
	second.next=third;//10--1--11
	third.next=fourth;//10--1--11-4--null
	s1.display();
	
	System.out.println("\nlength is "+ s1.findlength());
}
}
