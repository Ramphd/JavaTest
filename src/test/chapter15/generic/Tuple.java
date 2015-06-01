package test.chapter15.generic;

class TwoTuple<A,B>{
	public final A a;
	public final B b;
	public TwoTuple(A a,B b){
		this.a = a;
		this.b = b;
	}
	public String toString(){
		return  "(" + a + "," + b + ")";
	}
}

class TTuple{
	public static <A,B> TwoTuple<A,B> tuple(A a,B b){
		return new TwoTuple<A,B>(a, b);
	}
}
public class Tuple {
	static TwoTuple<String,Integer> f(){
		return TTuple.tuple("hhi", 13123123);
	}
	static TwoTuple f2(){
		return TTuple.tuple("hhi2", "sdsdsd");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f());
		System.out.println(f2());
//		TwoTuple<String,Integer> sss = (TwoTuple<String,Integer>)f2();
	}

}
