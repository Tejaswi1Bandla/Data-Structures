
public class deleteatend {
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
	public ListNode deletelast()
	{
		if(head==null||head.next==null)
		{
			return null;
		}
		else
		{
			ListNode temp=head;
			ListNode prev=null;
			while(temp.next!=null)
			{
				prev=temp;
				temp=temp.next;
			}
			prev.next=null;
			return temp;
			
		}
	}
	
	public static void main(String args[])
	{
		deleteatend a1=new deleteatend();
		a1.head=new ListNode(1);
		ListNode sec=new ListNode(11);
		ListNode thr=new ListNode(111);
		ListNode fr=new ListNode(1111);
		a1.head.next=sec;
		sec.next=thr;
		thr.next=fr;
		a1.display();
		a1.deletelast();
		System.out.println();
		a1.display();
		
	}
}


