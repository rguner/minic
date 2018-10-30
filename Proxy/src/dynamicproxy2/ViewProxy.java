package dynamicproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class ViewProxy implements InvocationHandler {

	private Map map;
	private Object obj;

	public static Object newInstance(Map map, Object obj, Class[] interfaces) {
		return Proxy.newProxyInstance(map.getClass().getClassLoader(),
				interfaces,
				new ViewProxy(map, obj));
	}

	public ViewProxy(Map map, Object obj) {
		this.map = map;
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		// try {
		// return m.invoke(obj, args);
		// } catch (NoSuchMethodException e) { // ignore }

		// }
		Object result;
		String methodName = m.getName();
		if (methodName.startsWith("get")) {
			String name = methodName.substring(methodName.indexOf("get") + 3);
			return map.get(name);
		} else if (methodName.startsWith("set")) {
			String name = methodName.substring(methodName.indexOf("set") + 3);
			map.put(name, args[0]);
			return null;
		} else if (methodName.startsWith("is")) {
			String name = methodName.substring(methodName.indexOf("is") + 2);
			return (map.get(name));
		}
		return null;
	}

}
