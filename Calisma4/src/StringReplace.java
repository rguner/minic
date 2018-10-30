
public class StringReplace {

	public static void main(String[] args) {
		StringReplace sr = new StringReplace();
		sr.execute();
	}

	public static void main(int i) {

	}

	private void execute() {

		String m = "90/532/2100234";
		String m1 = m.replaceFirst("90/", "").replaceAll("/", "");
		System.out.println(m1);

		String str = "7.5";

		String clean = str.replaceAll(".", "");

		System.out.println(str + "-" + clean);

		String clean2 = str.replaceAll("\\.", "");

		System.out.println(str + "-" + clean2);
	}

}
