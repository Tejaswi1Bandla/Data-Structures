
public class Searchelement {
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
public void search(int value)
{
	int flag=0;
	if(head==null)
	{
		return ;
	}
	else
	{
			ListNode current=head;
			
			while(current!=null)
			{
				if(current.data==value)
				{
					flag=1;
					
					break;
				}
				else
				{
					flag=0;
					current=current.next;
				}
				
			}
			if(flag==1)
			{
				System.out.println("\n element is present");
			}
			else
			{
				System.out.println("\n element is not present");
			}
			
				
			
	}
		/*ListNode current=head;
		while(current!=null)
		{
			if(current.data==value)
			{
				System.out.print("present");
			}
			else {
			current=current.next;
			
		}
			
		
	}
		System.out.print("\nnot present");
}*/
}
	public static void main(String args[])
	{
		Searchelement s1=new Searchelement();
		s1.head=new ListNode(1);
		ListNode sec=new ListNode(11);
		ListNode thr=new ListNode(111);
		s1.head.next=sec;
		sec.next=thr;
		s1.display();
		s1.search(111);
		
	}
}
