package test.chapter21.Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Quiz5 implements Callable<Integer>{
	private int n;
	public Quiz5(int n){
		this.n = n;
	}
	private int fibSum(int n){
		int sum = 0;
		for(int i = 0 ; i <n ; i++)
			sum = sum + fib(i);
		
		return sum;
	}
	
	private int fib(int n){
		if(n < 2) return 1;
		return fib(n-2) + fib(n-1);
	}
	@Override
	public Integer call(){
		// TODO Auto-generated method stub
		//return fibSum(n);
		return 13;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		Future<Integer> fi = exec.submit(new Quiz5(10));

		System.out.println(fi.isDone());
		
			while(!fi.isDone()){
//				System.out.println(fi.get());
			System.out.println(fi.isDone());
			}
			exec.shutdown();

	}
	
}
