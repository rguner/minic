package generics;

public class Usage {

	public static void main(String[] args) {
		Box2<String> box = new Box2<>();
		box.set("ramazan");
		System.out.println(box.get());

		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");

		System.out.println(p1.getKey() + " " + p1.getValue());
		System.out.println(p2.getKey() + " " + p2.getValue());

	}
}
