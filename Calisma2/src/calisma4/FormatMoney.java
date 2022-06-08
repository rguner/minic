import java.text.NumberFormat;
import java.util.Locale;

public class FormatMoney {

	public static void main(String[] args) {
		System.out.println("selam");
		System.out.println(formatMoneyAmount(12.3));
		System.out.println(formatMoneyAmount(-22.3));
	}

	public static String formatMoneyAmount(double amount) {
		Locale locale = new Locale("tr", "TR");
		NumberFormat format = NumberFormat.getCurrencyInstance(locale);

		String amountTxt = format.format(amount);
		String amountTxtValue = "";
		for (int i = 0; i < amountTxt.length(); i++) {
			if (Character.isDigit(amountTxt.charAt(i)) || amountTxt.charAt(i) == '.' || amountTxt.charAt(i) == ',')
				amountTxtValue = amountTxtValue + amountTxt.charAt(i);
		}

		amountTxt = ((amount < 0) ? "-" : "") + amountTxtValue;

		if (amountTxt.endsWith(",00"))
			return (amountTxt.replace(",00", ""));
		return (amountTxt);
	}

}
