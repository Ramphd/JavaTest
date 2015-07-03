package test.chapter17.Container;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class SumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(1, 2);
		hm.put(2, 3);
		Set<Entry<Integer, Integer>> st = hm.entrySet();
		Iterator<Entry<Integer, Integer>> it =  st.iterator();
		System.out.println(st);
		LinkedList ll = new LinkedList();
	}

}
