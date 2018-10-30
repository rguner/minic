package com.guner.sonar.denemeler;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

	public static void main(String[] args) {
		ForLoop forLoop = new ForLoop();
		forLoop.execute();
	}

	private void execute() {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		int i;
		for (i = 3; list.size() <= i; i++) {
			// System.out.println(list.get(i));
			// System.out.println("deneme" + i);
		}
		System.out.println("deneme" + i);

	}

}
