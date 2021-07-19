
public class sorting {
private ListNode head;
public static class ListNode
{
	int data;
	ListNode next;
	public ListNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public void display()
{
	ListNode nw=head;
	while(nw!=null)
	{
		System.out.print(nw.data+"-->");
		nw=nw.next;
	}
	System.out.print("null");
}
public void sorting()
{
	ListNode current=head;
	ListNode nextnode=null;
	int temp;
	while(current!=null)
	{
		nextnode=current.next;
		while(nextnode!=null)
		{
		if(current.data>nextnode.data)
		{
			temp=nextnode.data;
			nextnode.data=current.data;
			current.data=temp;
		}
		nextnode=nextnode.next;
	}
		current=current.next;
	}
	
}
	public static void main(String[] args) {
		sorting s1=new sorting();
		s1.head=new ListNode(111);
		ListNode sec=new ListNode(22);
		ListNode thr=new ListNode(3);
		ListNode fou=new ListNode(4);
		s1.head.next=sec;
		sec.next=thr;
		thr.next=fou;
		s1.sorting();
		s1.display();
		

	}

}
