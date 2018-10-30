package com.guner.java8calisma;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExcCalisma {

	public static void main(String[] args) {
		ExcCalisma excCalisma = new ExcCalisma();
		excCalisma.execute();
	}

	private void execute() {
		try {
			int i = 1 / 0;
		} catch (ArithmeticException e) {
			System.out.println("hata " + e + " " + e.getMessage());
			e.printStackTrace();
		}

		try {
			System.out.println("About to open a file");
			InputStream in = new FileInputStream("missingfile.txt");
			System.out.println("File open");
			int data = in.read();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Quitting");
		} catch (IOException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Quitting");
		}

	}

}
