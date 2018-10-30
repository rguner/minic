package de.vogella.algorithms.sort.standardjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Simple2 {

	public static void main(String[] args) {
		List<SortedObject> list = new ArrayList<SortedObject>();
		for (int i = 0; i < 100001; i++) {
			list.add(new SortedObject(20, "ramazan2"));
			list.add(new SortedObject(30, "ramazan3"));
			list.add(new SortedObject(1, "ramazan1"));
			list.add(new SortedObject(3, "ramazan3"));
			list.add(new SortedObject(2, "ramazan11"));
			list.add(new SortedObject(32, "ramazan3"));
			list.add(new SortedObject(21, "ramazan22"));
			list.add(new SortedObject(31, "ramazan3"));
			list.add(new SortedObject(32, "ramazan4"));
		}

		// System.setProperty("java.util.Arrays.useLegacyMergeSort", "true"); timsort/mergesort
		Collections.sort(list, new MyIntComparable());
		for (SortedObject sortedObject : list) {
			System.out.println(sortedObject.value + " " + sortedObject.text);
		}
	}

}
