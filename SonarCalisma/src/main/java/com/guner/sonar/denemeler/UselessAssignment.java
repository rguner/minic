package com.guner.sonar.denemeler;

public class UselessAssignment {

	public static void main(String[] args) {
		UselessAssignment uselessAssignment = new UselessAssignment();
		// uselessAssignment.execute();

		uselessAssignment.execute2();
	}

	public void execute() {

		for (int i = 0; i < 5; i++) {

			boolean multipleValidAlteration = false;

			System.out.println("Bir");

			int j = 3;

			if (j == 0) {
				System.out.println("İki");
			} else {
				multipleValidAlteration = false;
				for (int k = 0; k < 12; k++) {

					if (k % 5 == 0) {
						System.out.println("Üç");
					} else {
						System.out.println("Dört");
						multipleValidAlteration = true;
						break;
					}

					if (!multipleValidAlteration) {
						System.out.println("Beş");
					}
				}
			}
		}
	}

	public void execute2() {

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			for (int k = 0; k < 12; k++) {
				if (k % 5 == 1) {
					System.out.println(i + " " + k);
					break;
				}
			}
		}
	}
}
