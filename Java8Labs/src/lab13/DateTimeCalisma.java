package lab13;

import java.time.Instant;

public class DateTimeCalisma {

	public static void main(String[] args) {
		DateTimeCalisma dateTimeCalisma = new DateTimeCalisma();
		dateTimeCalisma.execute();
	}

	private void execute() {
		Instant instant = Instant.now();
		for (int i = 0; i < 100; i++) {
			System.out.println(Instant.now().toEpochMilli() + " " + System.currentTimeMillis());

		}
	}
}
