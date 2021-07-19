
public class delatposition {
	private ListNode head;
	private static class ListNode
	{
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
public void del(int position)
{
	if(position==1)
	{
		head=head.next;
	}
	else
	{
		ListNode current=head;
		ListNode prev=null;
		int count=0;
		while(count<position-1)
		{
			prev=current;
			current=current.next;
			count++;
			
		}
		ListNode newnode=current.next;
		prev.next=newnode;
		
	}
	/*else {
	ListNode prev=head;
	int count=1;
	while(count<position-1)
	{
		prev=prev.next;
		count++;
	}
	ListNode current=prev.next;
	prev.next=current.next;
	
	}*/
}
	public static void main(String args[])
	{
		delatposition d1=new delatposition();
		d1.head=new ListNode(2);
		ListNode sec=new ListNode(3);
		ListNode thr=new ListNode(4);
		d1.head.next=sec;
		sec.next=thr;
		d1.display();
		d1.del(2);
		
		d1.display();
		
	}
}
