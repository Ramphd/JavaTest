package test.chapter16.arrays;

import java.util.Arrays;

class QQ19{
	private int item;
	public QQ19(int item){
		this.item = item;
	}
	public boolean equals(Object obj){
		return ((QQ19)obj).item == this.item;
	}
}


public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QQ19[] a = {new QQ19(1)};
		QQ19[] b = {new QQ19(1)};
		System.out.println(Arrays.equals(a, b));
	}

}
