
public class Insertingatgivenposition {
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
					System.out.print(current.data +"-->");
					current=current.next;
				}
				System.out.print("null");
	}
	public void insert(int position,int value)
	{
		ListNode node=new ListNode(value);
		ListNode current=head;
		int count=1;
		if(position==1)
		{
			node.next=head;
			head=node;
			
		}
		else
		{
			if(count<position-1)
			{
				
				current=current.next;
				count++;
			}
			ListNode currentnext=current.next;
			current.next=node;
			node.next=currentnext;
			}
		}
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			/*if(position==1)
		{
			node.next=head;
			head=node;
		}
		else
		{
			ListNode previous=head;
			int count=1;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=node;
			node.next=current;
			
		}*/
	

	public static void main(String args[])
	{
		Insertingatgivenposition i1=new Insertingatgivenposition();
		i1.insert(1, 5);
		i1.insert(2, 3);
		i1.display();
	}
}
