package test.chapter21.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Quiz1 implements Runnable{
	private static int num = 0;
	private final int id = num++;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i  = 0;
		while(i++ < 3){
		System.out.println("this is run()" + id);
		Thread.yield();
		}
		return;
	}
	public Quiz1(){
		System.out.println("run"+ id +" is over");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		ExecutorService exec = Executors.newCachedThreadPool();
		while(i++ < 4){
		exec.execute(new Quiz1());
		}
		exec.shutdown();
	}
}
