package com.guner.java8calisma;

public class SimpleThread {

	public static void main(String[] args) {
		SimpleThread st = new SimpleThread();
		st.execute();

	}

	public void execute() {

		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		};

		task.run();

		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(task);
			thread.start();
		}

		System.out.println("Done!");
	}

}
