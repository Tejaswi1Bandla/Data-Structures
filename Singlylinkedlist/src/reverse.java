
public class reverse {
	private static ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void display(ListNode head)
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
	public  ListNode reversing()
	{
		if(head==null)
		{
			return head;
		}
		else
		{
		ListNode current=head;
		ListNode last=null;
		ListNode prev=null;
		while(current!=null)
		{
			last=current.next;
			current.next=prev;
			prev=current;
			current=last;
			
		}
		//head=prev;
		return prev;
		
		
		/*while(current!=null)
		{
			last=current.next;
			current.next=prev;
			prev=current;
			current=last;
		}
		return prev;*/
		}
		
	}
public static void main(String args[])
{
	reverse r1=new reverse();
	head=new ListNode(22);
	ListNode sec=new ListNode(33);
	ListNode thr=new ListNode(44);
	head.next=sec;
	sec.next=thr;
	r1.display(head);
	System.out.println(" ");
	//r1.reversing(head);
	ListNode revers=r1.reversing();
	//reverse.reversing re=r1.new reversing(head);
	//System.out.print(reverse.data);
	r1.display(revers);
}
}
