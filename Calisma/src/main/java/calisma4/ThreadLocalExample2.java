package calisma4;

import java.io.Serializable;

public class ThreadLocalExample2 implements Serializable {

	private static final long serialVersionUID = -2920700405299343293L;

	private static final ThreadLocal<String> threadLocalRequestContextHolder = new ThreadLocal<>();

	public static void main(String[] args) {
		threadLocalRequestContextHolder.set("deneme");
		System.out.println(threadLocalRequestContextHolder.get());
	}
}
