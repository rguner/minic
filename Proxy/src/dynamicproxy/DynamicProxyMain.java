package dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyMain {

	public static void main(String[] args) {

		DynamicProxyMain dynamicProxyMain = new DynamicProxyMain();
		dynamicProxyMain.execute();
	}

	private void execute() {

		MyProxyInterface implClass = new MyProxyInterface() {

			@Override
			public Object myMethod() {
				System.out.println("myMethod calisti");
				return Boolean.TRUE;
			}
		};

		// implClass.myMethod();

		MyProxyInterface foo = (MyProxyInterface) MyDynamicProxyClass.newInstance(implClass, new Class[] { MyProxyInterface.class });
		// System.out.println(foo.hashCode());
		System.out.println(foo.getClass().getName());
		foo.myMethod();

		String s = String.format("[ProxyInvocationHandler: %s, Interfaces: %s]",
				Proxy.getInvocationHandler(foo).getClass().getSimpleName(),
				foo.getClass().getInterfaces()[0].getCanonicalName());
		System.out.println(s);

		MyProxyInterface foo2 = (MyProxyInterface) MyDynamicProxyClass.newInstance(implClass, new Class[] { MyProxyInterface.class });
		System.out.println(foo2.getClass().getName());
		foo2.myMethod();

	}

}
