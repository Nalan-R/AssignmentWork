package practice;

class Node{
	int data;
	Node next;
}
public class LL_middle {
	Node head;
	
	public void add(int val) {
		Node a=new Node();
		a.data=val;
		a.next=null;
		
		if(head==null)
			head=a;
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=a;
		}
	}
	
	public void middle() {
		Node last=head;
		Node middle=head;
		int count=0;
		while(last!=null) {
			count++;
			last=last.next;
		}
		for(int i=0;i<=count/2;i++) {
			middle=head;
			head=middle.next;
		}
		System.out.println("Middle Element : "+ middle.data);
	}
	
	public static void main(String[] args) {
		LL_middle list=new LL_middle();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//list.add(60);
		//list.add(70);
		//list.add(80);
		
		list.middle();
	}

}
