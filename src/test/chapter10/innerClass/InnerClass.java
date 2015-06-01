package test.chapter10.innerClass;

interface P{
	
}
public class InnerClass {
	
	private class Inner implements P{
		
	}

	public P get1(){
		return new Inner();
	}
	public Inner get2(){
		return new Inner();
	}
	public static void main(String[] args){
		   InnerClass in = new InnerClass();
		 Inner i =(Inner) in.get1();
		 Inner ii = in.get2();
	} 
 }


