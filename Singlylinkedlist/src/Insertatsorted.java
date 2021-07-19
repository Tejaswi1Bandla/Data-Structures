
public class Insertatsorted {
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
	public void display()
	{
		ListNode curre=head;
		while(curre!=null)
		{
			System.out.print(curre.data+"-->");
			curre=curre.next;
		}
		System.out.print("null");
		
	}
	public void sorting(int data)
	{
		ListNode current=head;
		ListNode prev=null;
		ListNode nod=new ListNode(data);
		
		
		while(current!=null&&current.data<nod.data)
		{
			prev=current;
				current=current.next;
				
			}
		
			prev.next=nod;
			nod.next=current;
		
	}
	public static void main(String[] args) {
		Insertatsorted i1=new Insertatsorted();
		i1.head=new ListNode(1);
		ListNode sec=new ListNode(2);
		ListNode thr=new ListNode(4);
		ListNode fou=new ListNode(5);
		i1.head.next=sec;
		sec.next=thr;
		thr.next=fou;
		i1.display();
		System.out.println();
		i1.sorting(9);

i1.display();

	}

}
