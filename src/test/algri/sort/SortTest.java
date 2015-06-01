package test.algri.sort;

import static test.algri.sort.ArrayUtil.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bubbleSort method
//		printArray(new SortMethods<Integer>(5).bubbleSort());
//		printArray(new SortMethods<Integer>(10).selectSort());
//		printArray(new SortMethods<Integer>(15).insertSort());

//		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		int[] a = {1,2,3};
		List<int[]> b =  Arrays.asList(a);
		a[0] = 0;
		System.out.println(b.get(0)[0]);
	}

}
