package com.guner.sonar.denemeler;

public class Increment {

	public static void main(String[] args) {
		Increment increment = new Increment();
		increment.execute();
		increment.bitwiseAdd();
	}

	private void execute() {
		int i = 0;
		i = i++;
	}

	private void bitwiseAdd() {
		int result = 0;
		int[] b = { 0, 1, 2, 3, 4 };
		for (int i = 0; i < 4; i++)
			result = ((result << 8) + b[i]);
	}
}
