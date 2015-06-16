package test.chapter15.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Apple extends Fruit{}
class Fruit{}
class Reader<T>{
	T readExact(List<? extends T> list){
		return list.get(0);
	}
}
public class GenericWriting {
	static <T> void writeExact(List<T> list, T item){
		list.add(item);
	}

	static List<Apple> apples = new ArrayList<Apple>(Arrays.asList(new Apple()));
	static List<Fruit> fruits = new ArrayList<Fruit>(Arrays.asList(new Fruit()));
	static void f1(){
		writeExact(apples, new Apple());
		writeExact(fruits, new Apple());
	}
	static void www(List<? super Fruit> apples){
		apples.add(new Apple());
		apples.add(new Fruit());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader<Fruit> read = new Reader<Fruit>();
		Fruit f = read.readExact(fruits);
		Fruit a = read.readExact(apples);
		
	}

}
