package test.algri.sort;

import java.util.Random;

public class ArrayUtil {
	Random rand = new Random(47);
	public static int[] createArrays(int initSize){
//		this.initSize = initSize;
		int[] array = new int[initSize];// init array space
		Random rand = new Random(47);
		// init array
		for (int i = 0; i < initSize; i++) {
			array[i] = rand.nextInt(99);
		}
		return array;
	}
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
