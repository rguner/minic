import java.util.Arrays;
import java.util.List;

public class NullArastirma {

	public static void main(String[] args) {
		NullArastirma nullArastirma = new NullArastirma();
		nullArastirma.execute1();
	}

	private void execute1() {
		List forbiddenOfferIdList = null;
		String s = "";
		if (true)
			s = "";

		try {
			forbiddenOfferIdList = Arrays.asList(s.split(";"));
			System.out.println("kullaniciya gosterilmeyecek offer listesi: " + forbiddenOfferIdList);
		} catch (Exception exc) {
			System.out
					.println("cmsden forbiddenOfferIdList degeri alinirken/alinan deger diziye donusturulurken hata olustu. paketler gosterilirken filtresiz sekilde devam ediliyor."
							+ exc);

		}

	}
}
