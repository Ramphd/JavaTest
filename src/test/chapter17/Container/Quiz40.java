package test.chapter17.Container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class Ts implements Comparable<Ts>{
	public static Random rand = new Random();
	private int str1;
	private int str2;
	public Ts()
	{
		this.str1 = rand.nextInt(100);
		this.str2 = rand.nextInt(100);
	}
	@Override
	public int compareTo(Ts o) {
		// TODO Auto-generated method stub
		
		return str1 > o.str1 ? +1 : str1 == o.str1 ? 0:-1;
	}
	public String toString(){
		return Integer.toString(str1);
		
	}
	@Override
	public int hashCode(){
		return ((Integer)str1).hashCode();
	}
	public boolean equals(Object o){
		return o instanceof Ts && ((Ts)o).str1 == str1;
	}
}

public class Quiz40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ts[] ts = new Ts[]{new Ts(),new Ts(),new Ts(),new Ts(),new Ts()};
		ArrayList<Ts> ats = new ArrayList<Ts>(Arrays.asList(ts));
		Arrays.sort(ts);
		Collections.sort(ats);
		System.out.println(Arrays.toString(ts));
		System.out.println(ats);
		
	}

}
