package practice;

public class ReverseLL {
	Node0 head;
	
	class Node0{
		int data;
		Node0 next;
		
		Node0(int val){
			this.data=val;
			this.next=null;
		}
	}
	
	public void add(int val) {
		Node0 a=new Node0(val);
		
		if(head==null)
			head=a;
		else {
			Node0 last=head;
			while(last.next!=null){
				last=last.next;
			}
			last.next=a;
		}
	}
	
	public void print() {
		Node0 temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void reverse() {
		Node0 prev=null;
		Node0 current=null;
		Node0 ptr=head;
		while(ptr!=null) {
			current=ptr;
			ptr=ptr.next;
			
			current.next=prev;
			prev=current;
			head=current;	
		}	
	}
	
	public static void main(String[] args) {
		ReverseLL list=new ReverseLL();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();
		
		System.out.println();
		System.out.println("After Reversing");
		list.reverse();
		list.print();
	}
}
