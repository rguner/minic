package dynamicproxy3;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class DynamicProxyMain3 {

	public static void main(String[] args) {

		DynamicProxyMain3 dynamicProxyMain3 = new DynamicProxyMain3();
		dynamicProxyMain3.execute();
	}

	private void execute() {

		MyProxyInterface implClass = new MyProxyInterface() {

			@Override
			public Object myMethod() {
				System.out.println("myMethod calisti");
				return Boolean.TRUE;
			}
		};

		Class[] proxyInterfaces = new Class[] { MyProxyInterface.class };
		MyProxyInterface foo = (MyProxyInterface) Proxy.newProxyInstance(MyProxyInterface.class.getClassLoader(),
				proxyInterfaces,
				new Delegator(proxyInterfaces, new Object[] { implClass }));

		System.out.println(foo.hashCode());
		System.out.println(foo.toString());
		System.out.println(foo);
		System.out.println(foo.equals(foo));
		foo.myMethod();

		// diger bir proxy tanımı
		// -------------------------------------------------------------------------------------------------------------------------------------

		MyProxyInterface3 implClass3 = new MyProxyInterface3() {

			@Override
			public Object myMethod() {
				System.out.println("myMethod3 calisti");
				return Boolean.TRUE;
			}
		};

		// aynı interface ile farklı impl yapsan bile $Proxy0 oluyor
		// farklı interface yaparsan $Proxy1 oluyor..
		Class[] proxyInterfaces3 = new Class[] { MyProxyInterface3.class };
		MyProxyInterface3 foo3 = (MyProxyInterface3) Proxy.newProxyInstance(MyProxyInterface3.class.getClassLoader(),
				proxyInterfaces3,
				new Delegator(proxyInterfaces3, new Object[] { implClass3 }));

		System.out.println(foo3.hashCode());
		System.out.println(foo3.toString());
		System.out.println(foo3);
		System.out.println(foo3.equals(foo3));
		foo3.myMethod();

		try {
			Class[] classList = getClasses("dynamicproxy3");
			System.out.println("class list :");
			for (Class c : classList) {
				System.out.println(c.getName() + " " + c.getCanonicalName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Scans all classes accessible from the context class loader which belong to the given package and subpackages.
	 *
	 * @param packageName The base package
	 * @return The classes
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	private static Class[] getClasses(String packageName) throws ClassNotFoundException, IOException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		assert classLoader != null;
		String path = packageName.replace('.', '/');
		Enumeration<URL> resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		ArrayList<Class> classes = new ArrayList<Class>();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}
		return classes.toArray(new Class[classes.size()]);
	}

	/**
	 * Recursive method used to find all classes in a given directory and subdirs.
	 *
	 * @param directory The base directory
	 * @param packageName The package name for classes found inside the base directory
	 * @return The classes
	 * @throws ClassNotFoundException
	 */
	private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
		List<Class> classes = new ArrayList<Class>();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file, packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
			}
		}
		return classes;
	}

}
