package test.chapter21.Concurrency;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Quiz6 implements Runnable {
	private static Random rnd = new Random();
	private final int sleep_time = rnd.nextInt(2) + 1;

	public void run() {
		try {
			TimeUnit.SECONDS.sleep(sleep_time);
		} catch (InterruptedException e) {
			System.err.println("Interrupted: " + e);
		}
		System.out.println(sleep_time);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();

		for (int i = 0; i < 5; i++)
			exec.execute(new Quiz6());
		Thread.yield();
		exec.shutdown();
	}

}
