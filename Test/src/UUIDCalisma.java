import java.util.UUID;

public class UUIDCalisma {

	public static void main(String[] args) {
		UUIDCalisma u = new UUIDCalisma();
		// u.execute();
		u.hash();
	}

	private static String value;

	/*
	 * public long hashCode() { long h = 0; if (h == 0 && value.length > 0) { char val[] = value; for (int i = 0; i < value.length; i++) { h = 31 * h + val[i];
	 * } hash = h; } return h; }
	 */

	private void hash() {

	}

	private void execute() {

		UUID ui = new UUID(15, 1);
		System.out.println(ui);
		System.out.println(ui + " " + ui.hashCode());
		Long lng = new Long(121313);
		System.out.println(lng.hashCode());

		String ramazan = "ramazan";
		String ramazam = "ramazam";
		String ramazanguner = "ramazangunerdedededededewfwefrwfregege5ggregegtgtrgtrgrgtt";

		System.out.println(ramazan.hashCode());
		System.out.println(ramazam.hashCode());
		System.out.println(ramazanguner.hashCode());

		UUID ul = UUID.fromString("00000000-0000-000f-0000-000000000001");
		System.out.println(ul);

	}

}
