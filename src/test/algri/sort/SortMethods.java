package test.algri.sort;

import static test.algri.sort.ArrayUtil.*;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class SortMethods<T> {
	T[] a = null;//define array a
	List<T> array = null;//define List array
	int length = 0;
	int moves = 0;
	boolean done = false;// judge OK or NOT
	
	public SortMethods(int size) {//constructor method initiate members
		this.array = (List<T>) createArrays(size);//initiate List
		this.a = (T[]) array.toArray();//initiate array
		this.length = a.length;
	}

	public List<T> bubbleSort() {
		if (length > 1) {
			System.out.print("bubble-origin:" + array);
			for(int i = 1; i < length; i++) {
				done = true;
				++moves;
				for (int j = 0; j < length - i; j++) {
					if (compare(a[j], a[j + 1]) > 0) {
						swapInt(a, j, j + 1);
						swap(array, j, j + 1);
						// System.out.println("process:" + array);
						done = false;
					}
				}
				if (done){
					moves-=1;
					break;
				}
			}
			System.out.println("bubble-moves:" + moves);
		}
		return array;
	}

	public List<T> selectSort() {
	
		if(length > 1){
			int index = 0;
			System.out.print("select-origin:" + array);
			for(int i = 0;i < length-1 ; i++){
				index = i;
				++moves;
				for(int j = i + 1 ; j < length;j++){
					if(compare(a[index],a[j])>0){
						index = j;
					}
				}
				swapInt(a, index, i);
				swap(array,index,i);
			}
			
			System.out.println("select-moves:" + moves);
		}
//		printArray(a);
		return array;
	}

	public List<T> insertSort() {
		if(length > 1){
			System.out.print("insert-origin:" + array);
			T insertValue;
			for(int i = 1;i < length ; i++){
				insertValue = a[i];
				int j = i - 1;
				while(j >=0 && compare(insertValue,a[j])<0){
					a[j+1] = a[j];
					j--;
				}
				a[j+1] = insertValue;
				moves++;
			}
		}
		System.out.println("moves:" + moves);
		return Arrays.asList(a);
	}
	private int compare(T x, T y) {
		int a1 = (java.lang.Integer) x;
		int a2 = (java.lang.Integer) y;
		// System.out.println(a1 - a2);
		return (a1 - a2);
	}

	private void swapInt(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private void printArray(T[] a){
		for(T s :a){
			System.out.print(" "+s);
		}
		System.out.println();
	}
}
