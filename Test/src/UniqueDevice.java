
public class UniqueDevice {

	private String deviceId;
	private String simSerialNumber;
	private String secureId;

	public long hashCodeR() {
		final long prime = 31;
		long result = 1;
		result = prime * result + (long) deviceId.hashCode();
		return result;
	}

	public long hashCodeLong() {
		long h = 1;
		if (deviceId != null & deviceId.length() > 0) {

			for (int i = 0; i < deviceId.length(); i++) {
				h = 63 * h + deviceId.charAt(i);
			}
		} else
			h = 0;
		return h;
	}

	public static void main(String[] args) {
		UniqueDevice un = new UniqueDevice();
		un.deviceId = "34cf5ba49330ab8d";
		System.out.println(un.hashCodeR());
		System.out.println(un.hashCodeLong());
	}

}
