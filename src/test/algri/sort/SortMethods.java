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
		System.out.println("insert-moves:" + moves);
		return Arrays.asList(a);
	}
	
	public List<T> shellSort()  {
		if(length > 1){
			System.out.print("shell--origin:" + array);
			for(int r = length/2;r >= 1 ;r/=2 ){
				for(int i = r;i<length;i++){
					T temp = a[i];
					int j = i-r;
					while(j >= 0 && compare(temp,a[j])<0){
						a[j+r] = a[j];
						j-=r;
					}
					a[j+r] = temp;
				}
				moves++;
			}
		}
		System.out.println("shell-moves:" + moves);
		return Arrays.asList(a);
	}

	public List<T> quickSort()  {
		System.out.print("quick-origin:" + array);
		quickSortDetail(0,length-1);
		System.out.println("moves:" + moves);
		return array;
	}
	private void quickSortDetail(int start ,int end){

		if(length > 1){		
			int left = start + 1;
			int right = end;
			T base_value = a[start];
			while(true){
				while(compare(base_value,a[right])<0) right--;
				while(compare(base_value,a[left]) >0 && left < right) left++;
				if(left >= right) break;
				swapInt(a, left, right);
				swap(array,left,right);
				if(a[left] == base_value) right--;// very important steps to avoid 
				else left++;					  //some same-value element
				}
			swapInt(a, start, right);
			swap(array,start,right);
			moves++;
			if(start < left -1)	quickSortDetail(start, left -1);	
			if(right+1 < end) quickSortDetail(right + 1, end);
		}
		
	}
	
	public List<T> heapSort(){
		System.out.print("heap---origin:" + array);
		if(length > 1){
			int heapSize = length;
			maxHeapInit();
			for(int i = length - 1;i>=1;i--){
				swapInt(a, 0, i);
				heapSize-=1;
				buildMaxHeap(a, 0,heapSize);
				moves++;
			}
		}
		System.out.println("moves:" + moves);
		return Arrays.asList(a);
		
	}
	private void  maxHeapInit(){
		for(int i = length>>1 -1 ; i>=0;i--){
			buildMaxHeap(a,i,length);
		}
	}
	private void buildMaxHeap(T[] a, int i,int size){
		
		int left_node = 2*i + 1;
		int right_node = 2*i + 2;
		int biggestIndex;
		if(left_node < size && compare(a[left_node],a[i]) > 0){
			biggestIndex = left_node;
		}else{
			biggestIndex = i;
		}
		if(right_node < size && compare(a[right_node],a[biggestIndex])>0){
			biggestIndex = right_node;
		}
		if(biggestIndex != i){
			swapInt(a, i, biggestIndex);
			buildMaxHeap(a, biggestIndex,size);
		}
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
