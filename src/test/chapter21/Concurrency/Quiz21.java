package test.chapter21.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Q1 implements Runnable{

	public synchronized void f1() throws InterruptedException{
		
				System.out.println("Q1 is waiting");
				this.wait();
				System.out.println("Q1 is alive");
		
	}
	public synchronized void f2(){
	this.notifyAll();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			f1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class Q2 implements Runnable{
	Q1 r;
	
	public Q2(Q1 r){
		this.r = r;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(r) { r.notifyAll();}
	}
	
}
public class Quiz21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		Q1 q1 = new Q1();
		Q2 q2 = new Q2(q1);
		exec.execute(q1);
		exec.execute(q2);
		TimeUnit.SECONDS.sleep(1);
		exec.shutdownNow();
	}
}


