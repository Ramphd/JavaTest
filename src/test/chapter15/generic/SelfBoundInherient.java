package test.chapter15.generic;

class A11 <T extends A11<T>>{
	
	void set(T arg){
		System.out.println(arg.getClass());
	}
}
class B11 extends A11<B11>{
	
}

public class SelfBoundInherient {
	
	void test(B11 b1,B11 b2 ,A11<B11> a1){
		b1.set(b2);
		b2.set(b1);
		a1.set(b2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SelfBoundInherient().test(new B11(), new B11(), new A11<B11>());
	}

}
