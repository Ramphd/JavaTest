package test.chapter14.rtti;

interface AAA{
	void f();
}

class BBB implements AAA{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("this is BBB's f()");
	}
	public void fff(){
		System.out.println("this is BBB's fff()");
	}
}
public class InterfaceAndRtti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA a = new BBB();
		System.out.println(a.getClass().getSimpleName());
		System.out.println(a instanceof AAA);
		System.out.println(a instanceof BBB);
		if( a instanceof BBB){
			BBB b = (BBB)a;
			b.fff();
		}
			
		
	}

}
