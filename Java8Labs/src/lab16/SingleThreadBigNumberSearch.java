package lab16;

import java.util.concurrent.ThreadLocalRandom;

public class SingleThreadBigNumberSearch {

	public static void main(String[] args) {
		SingleThreadBigNumberSearch singleThreadBigNumberSearch = new SingleThreadBigNumberSearch();
		singleThreadBigNumberSearch.execute();
	}

	private void execute() {
		int[] data = new int[1024 * 1024 * 256]; // 1G
		for (int i = 0; i < data.length; i++) {
			data[i] = ThreadLocalRandom.current().nextInt();
		}
		int max = Integer.MIN_VALUE;
		for (int value : data) {
			if (value > max) {
				max = value;
			}
		}
		System.out.println("Max value found:" + max);

	}

}
