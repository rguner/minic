public class CloneObject implements Cloneable {

	private String ad;
	private Integer no;
	private AltObject altObject;
	private Ram ram;

	@Override
	public String toString() {
		return "CloneObject [ad=" + ad + ", no=" + no + ", altObject=" + altObject + " ram=" + ram + "]";
	}

	public static void main(String[] args) {
		CloneObject c = new CloneObject();
		c.execute();
		try {
			System.out.println(System.identityHashCode(c) + " " + c.hashCode() + " " + c);
			CloneObject d = (CloneObject) c.clone();
			d.ad = "ahmet";
			System.out.println(System.identityHashCode(d) + " " + d.hashCode() + " " + d);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void execute() {
		ad = "ramazan";
		no = 123;
		ram = Ram.BIR;
		altObject = new AltObject();
		altObject.soyad = "guner";

	}

	public class AltObject {

		@Override
		public String toString() {
			return "AltObject [soyad=" + soyad + "]";
		}

		public String soyad;
	}

	public enum Ram {
		BIR,
		IKI;
	}

}
