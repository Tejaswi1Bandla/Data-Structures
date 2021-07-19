
public class Removingloop {
	public ListNode head;
	public static class ListNode{
		int data;
		ListNode next;
		ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void containingloop()
	{
		ListNode slowptr=head;
		ListNode fastptr=head;
		while(fastptr.next!=null&&fastptr!=null)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
			if(slowptr==fastptr)
			{
				removingloop(slowptr);
				return;
			}
		}
		
	}
	public void removingloop(ListNode slowptr)
	{
		ListNode current=head;
		while(current.next!=slowptr.next)
		{
			current=current.next;
			slowptr=slowptr.next;
		}
		slowptr.next=null;
		
		}
	public void conloop()
	{
		head=new ListNode(1);
		ListNode sec=new ListNode(2);
		ListNode thr=new ListNode(3);
		ListNode fr=new ListNode(4);
		head.next=sec;
		sec.next=thr;
		thr.next=fr;
		fr.next=sec;
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
	public static void main(String args[])
	{
		Removingloop r1=new Removingloop();
		r1.conloop();
		r1.containingloop();
		r1.display();
		
		
	}
	
}
