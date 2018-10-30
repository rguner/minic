
public class NullKontrol {

	public static void main(String[] args) {
		NullKontrol nk = new NullKontrol();
		nk.execute();

	}

	private void execute() {
		Integer intg = new Integer(20);
		// Integer intg2 = null;
		if (null == intg) {
			System.out.println("null");
		} else {
			System.out.println("null degil");
		}
	}

}
