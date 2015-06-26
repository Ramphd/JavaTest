package test.chapter17.Container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Quiz1 {
	public static String[] conr = "China America Japan Korea".split(" "); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>(Arrays.asList(conr));
		List<String> ll = new LinkedList<String>(Arrays.asList(conr));
		Collections.sort(al);
		Collections.sort(ll);
		System.out.println(al);
		System.out.println(ll);
		Collections.shuffle(al);
		Collections.shuffle(ll);
		System.out.println(al);
		System.out.println(ll);
	}

}
