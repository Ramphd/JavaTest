package test.chapter21.Concurrency;

public class Quiz11 {
	private int a = 0;
	private int b = 1;
	public synchronized void move(){
		a = a+1;
		b = b+1;
	}
	public synchronized int getB(){
		return b;
	}
	public synchronized int getA(){
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz11 q11 = new Quiz11();
	}

}
