package test.algri.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayUtil {
	Random rand = new Random(47);
	public static List<Integer> createArrays(int initSize){
//		this.initSize = initSize;
		Integer[] array = new Integer[initSize];// init array space
		Random rand = new Random(47);
		// init array
		for (int i = 0; i < initSize; i++) {
			array[i] = rand.nextInt(99);
		}
		return Arrays.asList(array);
	}
	public static <T> void printArray(List<T> array) {

		System.out.println("sorted-result:" +array);
	}
	public  static <T> void swap(List<T>array,int i,int j){
		T temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j,temp);
	}
	
}
