import java.util.regex.Pattern;

public class IsIntegerPerformanceTest {

	private static Pattern pattern = Pattern.compile("^[0-9]+$");

	public static boolean isIntegerParseInt(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException nfe) {
		}
		return false;
	}

	public static boolean isIntegerRegexNew(String str) {
		return pattern.matcher(str).matches();
	}

	public static boolean isIntegerRegex(String str) {
		return str.matches("^[0-9]+$");
	}

	public static void main(String[] args) {
		long starttime, endtime;
		int iterations = 5000000;
		starttime = System.currentTimeMillis();

		// for (int i = 0; i < iterations; i++) {
		// isIntegerParseInt("123");
		// isIntegerParseInt("not an int");
		// isIntegerParseInt("-321");
		// }
		// endtime = System.currentTimeMillis();
		// System.out.println("This operation isIntegerParseInt took " + (endtime - starttime) + " ms.");
		// starttime = System.currentTimeMillis();
		// for (int i = 0; i < iterations; i++) {
		// isIntegerRegex("123");
		// isIntegerRegex("not an int");
		// isIntegerRegex("-321");
		// }
		// endtime = System.currentTimeMillis();
		// System.out.println("This operation took isIntegerRegex " + (endtime - starttime) + " ms.");
		// starttime = System.currentTimeMillis();
		// for (int i = 0; i < iterations; i++) {
		// isIntegerRegexNew("123");
		// isIntegerRegexNew("not an int");
		// isIntegerRegexNew("-321");
		// }
		// endtime = System.currentTimeMillis();
		// System.out.println("This operation took isIntegerRegexNew " + (endtime - starttime) + " ms.");

		System.out.println(isIntegerRegexNew("53262150501244"));
	}
}
