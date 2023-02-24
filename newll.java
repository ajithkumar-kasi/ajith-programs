package mypack1;
import java.util.LinkedList;


public class newll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(3);
		l.add(43);
		l.add(12);
		l.add(32);
		l.add(33);
		l.add(5);
		
		l.add(4);
		System.out.println(l);
		System.out.println("");
		l.pop();
		System.out.println(l);
		l.addFirst(100);
		l.addLast(200);
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.add(1, 1000);
		System.out.println(l);
	}

}
