package com.guner.sonar.denemeler;

public class ArdardaAtama
{

	public static void main(String args[])
	{

		ArdardaAtama ardardaAtama = new ArdardaAtama();
		ardardaAtama.execute1();
		ardardaAtama.execute2();

	}

	private void execute1() {

		int i = 3;
		int j = 10;
		int index = 0;
		index = i = j++ * 3;
		System.out.println("index: " + index + "  j:" + j);

	}

	private void execute2() {

		int i = 3;
		int j = 10;
		int index = 0;
		index = i = ++i * 3;
		System.out.println("index: " + index + "  i:" + i);

	}

}
