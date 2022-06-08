package generics2;

public class Box<T> {

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

	public <V> void inspectTwoParameter(V v, Integer i) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("V: " + v.getClass().getName());
	}

	public <V, Y> void inspectThreeParameter(V v, Y y) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("V: " + v.getClass().getName());
		System.out.println("Y: " + y.getClass().getName());
	}

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(new Integer(10));
		// integerBox.inspect("some text"); // error: this is still String!
		integerBox.inspect(12);
		System.out.println("-----------------------");
		integerBox.inspect(12.1);
		System.out.println("-----------------------");
		integerBox.<Double>inspect(13.3); // diger bi kullanım şekli.
		System.out.println("-----------------------");
		integerBox.inspectTwoParameter("ramazan", 2);
		System.out.println("-----------------------");
		integerBox.<String>inspectTwoParameter("ramazan", 2); // diger bi kullanım şekli.
		System.out.println("-----------------------");
		integerBox.inspectThreeParameter("ramazan", "erkan");
		System.out.println("-----------------------");
		integerBox.<String, String>inspectThreeParameter("ramazan", "erkan");// diger bi kullanım şekli.
	}
}
