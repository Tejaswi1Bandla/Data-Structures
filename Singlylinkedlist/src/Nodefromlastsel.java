
public class Nodefromlastsel {
	private ListNode head;
	public static class ListNode{
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
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+ " --->");
			current=current.next;
		}
		System.out.println("null");
	}
	public void nodefromlast(int position)
	{
		int count=0;
		ListNode current=head;
		while(current.next!=null)
		{
			current=current.next;
			count++;
		}
		System.out.println(count);
		int diff=count-position;
		int m=0;
		ListNode ref=head;
		while(diff<0)
		{
			System.out.println("EXiting the number of nodes");
			break;
		}
		while(ref!=null)
		{
			
		if(m==diff)
		{
			System.out.println(ref.data);
			break;
		}
		else
		{
			ref=ref.next;
			m++;
		}
			
		
		}
		
		
		
		/*ListNode current=head;
		ListNode prev=null;
		while(count<position)
		{
			prev=current;
			current=current.next;
			count++;
		}
		if(current.next!=null||current.next.next!=null)
		{
			prev=current;
			current=current.next;
		}
		
		return prev;
	}*/
	}

	public static void main(String[] args) {
		Nodefromlastsel n1=new Nodefromlastsel();
		n1.head=new ListNode(11);
		ListNode sec=new ListNode(22);
		ListNode thr=new ListNode(33);
		ListNode fou=new ListNode(44);
		n1.head.next=sec;
		sec.next=thr;
		thr.next=fou;
	n1.display();
	/*ListNode Nodefromlastsel=n1.nodefromlast(4);
	System.out.println(Nodefromlastsel.data);*/
	n1.nodefromlast(0);
	

	}

}
