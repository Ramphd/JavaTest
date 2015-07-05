package test.chapter21.Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AAA implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "123";
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newSingleThreadExecutor();
		Future<String> fs = exec.submit(new AAA());
//			System.out.println("do");
//			System.out.println(fs.isDone());
		
			try {
				while(!fs.isDone()){
				System.out.println(fs.isDone());
				fs.get();
				}
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		exec.shutdown();
	}
	
}
