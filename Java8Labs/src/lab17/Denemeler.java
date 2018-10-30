package lab17;

import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author oracle
 */
public class Denemeler {

	public static void main(String[] args) {

		List<SalesTxn> tList = SalesTxn.createTxnList();

		int toplam = IntStream.rangeClosed(1, 8)
				.peek(i -> {
					synchronized (Denemeler.class) { // system.outlar yarida kalmasın diye, anlayabilmek icin..
						System.out.print(i);
						System.out.println(" " + Thread.currentThread().getName());
					}
				})
				.parallel()
				.reduce(0, (sum, element) -> sum + element);

		System.out.println("Toplam --> " + toplam);

	}
}
