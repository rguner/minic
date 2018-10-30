package com.guner.sonar.denemeler;

public class MagicNumber {

	public static void main(String[] args) {
		MagicNumber magicNumber = new MagicNumber();
		magicNumber.execute1();
	}

	private void execute1() {

		int x = 1;
		int y = 2;
		int z = 3;
		int m = 9;
		int k = 10;
		int l = 0;
		int n = -1;

		int toplam = x + y + z + m + k + l + n;
		System.out.println(toplam);

	}

}
