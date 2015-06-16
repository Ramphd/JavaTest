package test.chapter15.generic;

class Hee<T>{
	T item;
	Hee(){}
	Hee(T item){
		this.item = item;
	}
	T get(){
		return item;
	}
}


public class CaptureConversion {
	static void f2(Hee<?> hee){
		
		System.out.println(hee.get().getClass().getSimpleName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hee<?> rwa = new Hee<Double>(1.0);
		System.out.println(rwa.get());
	}

}
