package mypack1;

public class list1 {
	node head;
	class node{
		int data;
		node next;
		node(int i){
			data=i;
			next=null;
		}
		
		}
	list1(){
		head=null;
	}
	
	public void atbegin(int i) {
		// TODO Auto-generated method stub
	
		node n=new node(i);
		if(head==null) {
			head=n;
		}else {
			n.next=head;
			head=n;
		}
		
	}
	public void display() {
		// TODO Auto-generated method stub
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public void atmid(int pos, int j) {
		// TODO Auto-generated method stub
		node n=new node(j);
		if(pos==0) {
			atbegin(j);
			return;
		}else {
			node temp=head;
			 for(int i=0;i<pos-1;i++) {
				 temp=temp.next;
			 }
			 n.next=temp.next;
			 temp.next=n;
		}
		
	}

	

	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list1 l=new list1();
		l.atbegin(6);
		l.atbegin(11);
		l.atbegin(5);
		l.atbegin(4);
		l.atbegin(3);
		l.display();
		l.atmid(2,78);
		System.out.println("");
		l.display();
	}

	
	
	}
	



	

