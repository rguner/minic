package lab17;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Denemeler3 {

	public static void main(String[] args) {
		Denemeler3 denemeler3 = new Denemeler3();
		denemeler3.execute();
	}

	private void execute() {

		int processorCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Islemci sayisi --> " + processorCount);

		OptionalInt sonucInt = IntStream.rangeClosed(1, 100)
				.filter(i -> i % 10 == 0)
				.sequential()
				.findAny();

		OptionalInt sonucInt2 = IntStream.rangeClosed(1, 100)
				.filter(i -> i % 10 == 0)
				.parallel()
				.findAny();

		System.out.println("Seri " + sonucInt.getAsInt());
		System.out.println("Paralel " + sonucInt2.getAsInt());
	}

}
