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
//		printArray(new SortMethods<Integer>(7).selectSort());
//		printArray(new SortMethods<Integer>(9).insertSort());
//		printArray(new SortMethods<Integer>(11).shellSort());
//		printArray(new SortMethods<Integer>(13).quickSort());
		printArray(new SortMethods<Integer>(10).heapSort());

	}

}
