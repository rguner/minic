import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches
{

	public static void main(String args[]) {

		// String to be scanned to find the pattern.
		String line = "This order was placed for javascript:\naaaRR..\t\b\tRRRrmwswsw\t<sddcript>ramazanjassvascript:aleaart()";
		String pattern = "<script\\s*>|</script\\s*>|javascript:|eval\\s*\\(.*\\)|alert\\s*\\(.*\\)|prompt\\s*\\(.*\\)|\\.\\.\\s*";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(line);
		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
		} else {
			System.out.println("NO MATCH");
		}
	}
}
