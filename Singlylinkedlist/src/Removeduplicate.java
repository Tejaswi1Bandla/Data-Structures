

public class Removeduplicate {
	public static ListNode head;
	public static class ListNode{
		int data;
		ListNode next;
		ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void display()
	{
		ListNode curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.print("null");
	}
 public void dupli()
 {
	 ListNode current=head;
	
	ListNode prev=current.next;
	while(current!=null&&current.next!=null)
	 if(current.data==prev.data)
	 {
		 prev=current.next.next;
		 current.next=prev;
	 }
	 else
	 {
		 current=current.next;
		 prev=current.next;
	 }
		 
 }
 
	public static void main(String[] args) {
		Removeduplicate r1=new Removeduplicate();
		head=new ListNode(1);
		ListNode sec=new ListNode(2);
		ListNode thr=new ListNode(2);
		ListNode fou=new ListNode(4);
		head.next=sec;
		sec.next=thr;
		thr.next=fou;
		r1.display();
		System.out.println();
		r1.dupli();
		r1.display();

	}

}
