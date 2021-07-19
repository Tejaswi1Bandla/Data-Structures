

public class Findingloop {
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
public boolean findingloop()
{
	ListNode fastptr=head;
	ListNode slowptr=head;
 while(fastptr!=null&&fastptr.next!=null)
 {
		fastptr=fastptr.next.next;
		slowptr=slowptr.next;
		if(fastptr==slowptr)
		{
			return true;
			
		}
		
		
		
	}
 return false;
}
public ListNode containingloop()
{
	ListNode fastptr=head;
	ListNode slowptr=head;
 while(fastptr!=null&&fastptr.next!=null)
 {
		fastptr=fastptr.next.next;
		slowptr=slowptr.next;
		if(fastptr==slowptr)
		{
			return findingthestarting(slowptr);
			
		}
		
		
		
	}
 return null;
}
 public ListNode findingthestarting(ListNode slowptr)
 {
	 ListNode current=head;
	 while(slowptr!=current)
	 {
		 slowptr=slowptr.next;
		 current=current.next;
		 
	 }
	return current;
 }


public void containsloop()
{
	ListNode first=new ListNode(1);
	ListNode sec=new ListNode(2);
	ListNode thr=new ListNode(4);
	ListNode fou=new ListNode(5);
	head=first;
    first.next=sec;
	sec.next=thr;
	thr.next=fou;
	fou.next=sec;
}
	public static void main(String[] args) {
		Findingloop f1=new Findingloop();
		//f1.display();
		f1.containsloop();
		System.out.println(f1.findingloop());
		System.out.println(f1.containingloop().data);

	}

}
