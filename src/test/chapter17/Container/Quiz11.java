package test.chapter17.Container;

import java.util.PriorityQueue;
import java.util.Random;

class Q1 implements Comparable<Q1>{
	private Integer item;
	public static Random rand  = new Random();
	public Q1(){
		this.item = rand.nextInt(100);
	}

	public int compareTo(Q1 o) {
		// TODO Auto-generated method stub
		return this.item > o.item ? +1 : this.item == o.item ? 0 : -1;
	}
	public String toString(){
		return item.toString();
	}
}
public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Q1> q = new PriorityQueue<Q1>();
		for(int i = 0 ; i < 5; i++)
			q.offer(new Q1());
		System.out.println(q);
		Q1 q1 ;
		while ((q1 = q.poll())!=null)
			System.out.print(q1 + ",");

	}

}
