package calisma4;

public class EnumExample {

	public static void main(String[] args) {
		EnumExample enumExample = new EnumExample();
		enumExample.execute();
	}

	private void execute() {
		EnumType e1 = EnumType.LOGIN;
		e1.setDeneme("deneme1");
		System.out.println(e1.toString());

	}

	public enum EnumType {
		LOGIN("local", "login"),
		LOGOUNT("local", "logout");

		private EnumType(String url, String method) {
			this.setUrl(url);
			this.method = method;
		}

		public String getDeneme() {
			return deneme;
		}

		public void setDeneme(String deneme) {
			this.deneme = deneme;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		private String url;
		private String method;

		private String deneme;

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("EnumType[url=" + url);
			builder.append(", method=" + method);
			builder.append(", deneme=" + deneme);
			builder.append("]");
			return builder.toString();
		}

	}

	public enum EnumType2 {
		LOGIN,
		LOGOUT;

	}

}
