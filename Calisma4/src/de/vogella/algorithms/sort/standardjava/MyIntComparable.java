package de.vogella.algorithms.sort.standardjava;

import java.util.Comparator;

public class MyIntComparable implements Comparator<SortedObject> {

	@Override
	public int compare(SortedObject o1, SortedObject o2) {
		/* Exception in thread "main" java.lang.IllegalArgumentException: Comparison method violates its general contract! hatasi icin aç */
		// if (o1.value == 1)
		// return 1;

		if (o1.value > o2.value) {
			return 1;
		} else if (o1.value < o2.value) {
			return -1;
		} else {
			return 0;
		}

		// return o1.value - o2.value;

	}

}
