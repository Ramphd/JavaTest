package test.algri.sort;

import static test.algri.sort.ArrayUtil.*;

import java.util.List;

public class SortMethods {

	public <T> List<T> bubbleSort(List<T> array) {
		@SuppressWarnings("unchecked")
		T[] a = (T[]) array.toArray();
		if (array.size() > 1) {
			System.out.println("origin:" + array);
			int initSize = a.length;
			boolean done = false;// judge ok or not
			for (int i = 1; i < initSize; i++) {
				done = true;
				for (int j = 0; j < initSize - i; j++) {
					if (compare(a[j], a[j + 1]) > 0) {
						swapInt(a, j, j + 1);
						swap(array, j, j + 1);
						System.out.println("process:" + array);
						done = false;
					}
				}
				if (done)
					break;
			}
		}
		return array;
	}

	private <T> int compare(T x, T y) {
		int a1 = (java.lang.Integer) x;
		int a2 = (java.lang.Integer) y;
		System.out.println(a1 - a2);
		return (a1 - a2);
	}

	private <T> void swapInt(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
