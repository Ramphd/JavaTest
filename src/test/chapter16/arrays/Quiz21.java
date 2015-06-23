package test.chapter16.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Qa implements Comparable<Qa> {
	int a;

	public Qa() {
		this.a = new Random().nextInt(10);
	}

	public int compareTo(Qa a) {
		return (this.a > a.a ? 1 : (this.a == a.a ? 0 : -1));
	}

	public String toString() {

		return Integer.toString(a);
	}
}

class Qb implements Comparator<Qa> {

	@Override
	public int compare(Qa o1, Qa o2) {
		// TODO Auto-generated method stub
		return (o1.a > o2.a ? 1 : (o1.a == o2.a) ? 0 : -1);
	}

}

public class Quiz21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qa[] a = { new Qa(), new Qa() };
		System.out.println(Arrays.toString(a));
		int b[] = {2,1,3};
		Integer c [] = {5,5,6,8,7,5,2,3,1};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a, Collections.reverseOrder());
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a, new Qb());
//		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(b, 2));
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println(Arrays.toString(c));
	}

}
