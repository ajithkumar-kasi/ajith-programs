package mypack1;
import java.util.*;
public class collectionexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a=new ArrayList<>(20);
		ArrayList<Integer> a1=new ArrayList<>(List.of(10,20,30,50));
		a.add(1);
		a.add(6);
		a.add(8);
		a.add(7);
		a.add(4);
		a.add(5);
		a.add(3);
		
		System.out.println(a.contains(1));
		System.out.println(a);
		
		System.out.println(a);
		System.out.println(a.indexOf(7));
		System.out.println(a.lastIndexOf(3));
		
		
	}

}
