
public class Practice {
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
 public int findlength()
 {
	 if(head==null)
	 {
		 return 0;
	 }
	 int count=0;
	 ListNode current=head;
	 while(current!=null)
	 {
		count++;
		current=current.next;
	 }
	 return count;
 }
 public void insertatfirst(int value)
 {
	 ListNode newnode=new ListNode(value);
	 newnode.next=head;
	 head=newnode;
 }
	public static void main(String args[])
	{
		Practice p1=new Practice();
		p1.insertatfirst(1);
		p1.insertatfirst(11);
		p1.display();
		System.out.println("\n" + p1.findlength());
	}
	
	
	
	
	
}
