class Linkedlist{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int val){
			data=val;
			next=null;
		}
		
	}
	Linkedlist(){
		head=null;
	}
	public void atBegin(int val) {
		Node newNode=new Node(val);
		// TODO Auto-generated method stub
		if(head==null) {//when list id empty
			head=newNode;
		}
		else {//when list is non empty
			newNode.next=head;
			head=newNode;
		}
		
	}
	public void display() {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void insert(int pos, int val) {
		Node n=new Node(val);
		if(pos==0) {
			atBegin(val);
			return;
		}
	
		Node temp=head;
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
			
		}
		n.next=temp.next;
		temp.next=n;
		
	}
	
	
}










public class linkdlist {
	public static void main(String[] args) {
		Linkedlist l=new Linkedlist();
		l.atBegin(9);
		l.atBegin(3);
		l.atBegin(6);
		l.display();
		System.out.println(" ");
		l.insert(1,67);
		l.display();
		

		
	}

	

}
