package test.chapter16.arrays;

import java.util.Arrays;

public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2},{3,4,5}};
		int b[][] = {{1,1,1,1},{1}};
//		System.arraycopy(a, 2, b, 2, 3);
//		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.deepEquals(a, b));
	}

}
