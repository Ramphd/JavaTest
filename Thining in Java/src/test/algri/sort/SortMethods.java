package test.algri.sort;

public class SortMethods {

	public int[] bubbleSort(int[] array) {
		if (array.length > 0) {
			int initSize = array.length;
			int temp;
			for (int i = 1; i < initSize; i++) {
				for (int j = 0; j < initSize - i; j++) {
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}
		return array;
	}



	

}
