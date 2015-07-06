package test.chapter21.Concurrency;

class QQQ{
	public void f1(){
		synchronized (this) {
			System.out.println("f1");
		}
	}
	public void f2(){
		synchronized (this) {
			
		int i = 0;
			while(i< 5){
			System.out.println("f2");
			i++;
			}
			}
	}
	public void f3(){
		synchronized (this) {
			System.out.println("f3");
		}
	}
}

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final QQQ q = new QQQ();
		new Thread(){
			public void run(){
				q.f1();
			}
		}.start();
		q.f2();
	}

}
