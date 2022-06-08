package generics3;

import java.util.Arrays;
import java.util.List;

public class BoxBoundedTypeAndWildcard<T extends Number> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}

	// wildcard
	public static double sumOfListWild(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}

	// wildcard
	public static <V extends Number> double sumOfListType(List<V> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}

	public static void main(String[] args) {
		BoxBoundedTypeAndWildcard<Integer> integerBox = new BoxBoundedTypeAndWildcard<Integer>();
		integerBox.set(new Integer(10));
		// integerBox.inspect("some text"); // error: this is still String!
		integerBox.inspect(12);
		System.out.println("-----------------------");
		integerBox.inspect(12.1);
		System.out.println("-----------------------");
		integerBox.<Double>inspect(13.3); // diger bi kullanım şekli.

		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfListWild(li));
		System.out.println("sum = " + sumOfListType(li));

	}
}
