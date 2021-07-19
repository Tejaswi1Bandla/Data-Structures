

public class Loopinsll {
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
		ListNode cur=head;
		while(cur!=null)
		{
			System.out.print(cur.data+"-->");
			cur=cur.next;
		}
		System.out.print("null");
	}
	public void Loocheck()
	{
		ListNode current=head;
		ListNode prev=head;
		int flag=0;
		while(current!=null&&current.next!=null)
		{
			prev=prev.next;
			current=current.next.next;
			if(prev==current)
			{
				flag=1;
				
				break;
			}
			else
			{
				flag=0;
			}
		
			}
		if(flag==0)
		{
		System.out.println("Loop is not present");
		}
				else
				{
					System.out.println("Loop is present");
				}
			
		}
		
	
	public void containsloop()
	{
		head=new ListNode(1);
		ListNode sec=new ListNode(2);
		ListNode thr=new ListNode(4);
		ListNode fou=new ListNode(5);
	    head.next=sec;
		sec.next=thr;
		thr.next=fou;
		fou.next=sec;
	}

	public static void main(String[] args) {
		Loopinsll l1=new Loopinsll();
		l1.containsloop();
		
		l1.Loocheck();
	}

	}


