package test.chapter17.Container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Quiz7 {
	public static String[] conr = "China America Japan Korea".split(" "); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(conr));
		LinkedList<String> ll = new LinkedList<String>(Arrays.asList(conr));
		for(Iterator<String> it = al.iterator();it.hasNext();)
			System.out.print(it.next()+" ");
			System.out.println("*");
		for(Iterator<String> it = ll.iterator();it.hasNext();)
			System.out.print(it.next()+" ");
			System.out.println("*");
			int alindex  = 0;
		for(ListIterator<String> it2 = ll.listIterator(ll.size());it2.hasPrevious();){
			al.add(alindex,it2.previous());
			alindex +=2;
		}
			System.out.println(al);
	}

}
