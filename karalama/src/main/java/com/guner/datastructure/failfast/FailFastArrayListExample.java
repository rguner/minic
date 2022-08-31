package com.guner.datastructure.failfast;// Java code to demonstrate remove
// case in Fail-fast iterators

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastArrayListExample {
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);


		// If you remove an element via Iterator remove() method, exception will not be thrown.
		// However, in case of removing via a particular collection remove() method, ConcurrentModificationException will be thrown.
		// Below code snippet will demonstrate this:

		// iterator'den silme
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 2) {
				// will not throw Exception
				itr.remove();
			}
		}

		System.out.println(al);

		// collection'dan silme
		itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 3) {
				// will throw Exception on
				// next call of next() method
				al.remove(3);
			}
		}
	}
}
