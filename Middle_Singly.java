package practice;

public class Middle_Singly {
      Node1 head;
      
      class Node1{
    	  int data;
    	  Node1 next;
    	  
    	  Node1(int data){
    		  this.data=data;
    		  this.next=null;
    	  }
      }
      
      public void push(int data){
    	  Node1 s=new Node1(data);
    	  s.next=head;
    	  head=s;
      }
      
      public void middle() {
    	  Node1 fast=head;
    	  Node1 slow=head;
    	  while(fast!=null && fast.next!=null) {
    		  fast=fast.next.next;
    		  slow=slow.next;
    	  }
    	  System.out.println("Middle Element : "+slow.data);
      }
      
      public void print(){
    	  Node1 temp=head;
    	  while(temp!=null){
    		  System.out.println(temp.data);
    		  temp=temp.next;
    	  }
      }
	public static void main(String[] args) {
		Middle_Singly list=new Middle_Singly();
		
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		list.print();
		list.middle();
	}

}
