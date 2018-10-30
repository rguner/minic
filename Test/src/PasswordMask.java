
public class PasswordMask {

	public static void main(String[] args) {
		PasswordMask pm = new PasswordMask();
		pm.execute();
	}

	private void execute() {

		String json = "{\"serviceId\":\"100211\",\"secretKey\":\"d1a62fef-1059-4161-8a20-519c2b48e4fa\","
				+ "\"password\":\"123456\","
				+ "\"authToken\":\"4390dbdd-f351-4bfa-8c5c-1bb8c622be89\","
				+ "\"password\":\"1rrr23456000\""
				+ "\t  "
				+ "}\n";

		System.out.println(json);
		System.out.println(convertMaskedPassword("123"));

		StringBuilder sb = new StringBuilder();

		String delims = ",";
		String[] jsonTokens = json.split(delims);
		for (int i = 0; i < jsonTokens.length; i++) {
			String s = jsonTokens[i];
			if (s.indexOf("password") > 0) {
				int index = s.indexOf("password");
				sb.append("\"password");
				String subStr = s.substring(index + "password".length());
				sb.append(convertMaskedPassword(subStr));
			} else {
				sb.append(s);
			}
			if (i == jsonTokens.length - 1) {
				sb.append("\n");
			} else {
				sb.append(",\n");
			}
		}
		System.out.println(sb.toString());
	}

	public static String convertMaskedPassword(String password) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < password.length(); i++) {
			if (Character.isWhitespace(password.charAt(i))
					|| password.charAt(i) == '{' || password.charAt(i) == '}' || password.charAt(i) == '"' || password.charAt(i) == ':') {
				sb.append(password.charAt(i));
			} else {
				sb.append("*");
			}

		}

		return sb.toString();
	}

}
