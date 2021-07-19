
public class insertatend {
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
    		 System.out.print(current.data + "--");
    		 current=current.next;
    	 }
    	 System.out.print("null");
     }
	public void insertatending(int value)
	{
		ListNode newnode=new ListNode(value);
		ListNode current=head;
		if(head==null)
		{
			head=newnode;
			return;
		}
		while(current.next!=null)
		{
			current=current.next;
			
		}
		current.next=newnode;
		/*if(head==null)
		{
			head=newnode;
			return;
		}
		ListNode current=head;
		while(null!=current.next)
		{
			current=current.next;
		}
		current.next=newnode;
		*/
	}
	
	public static void main(String args[])
	{
		insertatend i1=new insertatend();
		
		i1.insertatending(9999999);
        i1.insertatending(99);
		i1.insertatending(9999);
		i1.insertatending(999);
		i1.display();
	}
}
