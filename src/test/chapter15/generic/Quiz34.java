package test.chapter15.generic;


abstract class SelfBound<T extends SelfBound<T>>{

	abstract T ff(T arg);
	T get(){
		return ff(null);
	}

}
public class Quiz34 extends SelfBound<Quiz34> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz34 q3 = new Quiz34();
		System.out.println(q3 == q3.get());
	}

	@Override
	Quiz34 ff(Quiz34 arg) {
		if(arg == null)
			return this;
		// TODO Auto-generated method stub
		return arg;
	}

}
