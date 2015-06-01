package test.algri.sort;

import static test.algri.sort.ArrayUtil.*;

public class SortTest {
//	static int a[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printArray(new SortMethods().bubbleSort(createArrays(6)));

		printArray(new SortMethods().bubbleSort(createArrays(10)));

	}

}
