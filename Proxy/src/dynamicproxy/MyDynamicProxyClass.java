package dynamicproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyDynamicProxyClass implements
		java.lang.reflect.InvocationHandler {

	Object obj;

	public MyDynamicProxyClass(Object obj) {
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		try {
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println(obj + " classında invoke basladi..");
			// do something
			Object result = m.invoke(obj, args);

			Arrays.stream(Thread.currentThread()
					.getStackTrace())
					.forEach(System.out::println);

			System.out.println(obj + " classında invoke bitti..");

			// proxy üzerindeki her metod çağrımı stackoverflow verir, invoke'a girdigi icin.
			// proxy.hashCode(); // Exception in thread "main" java.lang.StackOverflowError

		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw e;
		}
		// return something
		return obj;
	}

	static public Object newInstance(Object obj, Class[] interfaces) {
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(),
				interfaces,
				new MyDynamicProxyClass(obj));
	}
}
