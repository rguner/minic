package calisma4;

import java.util.ArrayList;
import java.util.List;

public class NullKontrol {

	public static void main(String[] args) {
		NullKontrol nullKontrol = new NullKontrol();
		nullKontrol.execute();
	}

	private void execute() {
		// List<String> productList = null;
		List<String> productList = new ArrayList<String>();

		for (String selectedProduct : productList) {

		}

	}

}
