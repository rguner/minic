
public class CopyObject {

	private String ad;
	private Integer no;
	private AltObject altObject;
	private Ram ram;

	@Override
	public String toString() {
		return "CopyObject [ad=" + ad + ", no=" + no + ", altObject=" + altObject + " ram=" + ram + "]";
	}

	public static void main(String[] args) {
		CopyObject c = new CopyObject();
		c.execute();
		c.copy();
	}

	public void execute() {
		ad = "ramazan";
		no = 123;
		ram = Ram.BIR;
		altObject = new AltObject();
		altObject.soyad = "guner";

	}

	private void copy() {
		CopyObject c2 = new CopyObject();
		c2.ad = this.ad;
		c2.no = this.no;
		c2.ram = this.ram;
		c2.altObject = new AltObject();
		c2.altObject.soyad = altObject.soyad;

		this.ad = "ramo";
		this.no = 99;
		this.altObject.soyad = "abb";
		this.ram = Ram.IKI;

		System.out.println(c2);

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
