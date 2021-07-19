
public class Insertatfirst {
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
		public void insertfirst(int value)
		{
			ListNode newNode=new ListNode(value);
			newNode.next=head;
			head=newNode;
		}
		
		public static void main(String args[])
		{
			Insertatfirst i1=new Insertatfirst();
			i1.insertfirst(11);
			i1.insertfirst(111);
			i1.insertfirst(1111);
			i1.insertfirst(11111);
			i1.display();
		}

	}



