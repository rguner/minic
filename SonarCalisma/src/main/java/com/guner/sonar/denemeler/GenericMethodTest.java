package com.guner.sonar.denemeler;

public class GenericMethodTest
{

	// generic method printArray
	public static <E> void printArray(E[] inputArray)
	{
		// Display array elements
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static <E, F> void printParameters(E e, F f)
	{
		System.out.printf("%s ", e);
		System.out.printf("%s ", f);
		System.out.println();
	}

	// bounded type parameter
	public static <E extends Integer, F extends Integer> void printParameters2(E e, F f)
	{
		System.out.printf("%s ", e);
		System.out.printf("%s ", f);
		System.out.println();
	}

	// & ile interfaceler de eklenebiliyor..
	public static <E extends Number & Comparable<Integer>> void printParameter(E e)
	{
		System.out.printf("%s ", e);
		System.out.println();
	}

	public static void main(String args[])
	{
		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(intArray); // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray); // pass a Double array

		System.out.println("\nArray characterArray contains:");
		printArray(charArray); // pass a Character array

		printParameters("Ramazan", 20);

		// printParameters2("Ramazan", 20); derleme hatası veriyor..
		printParameters2(20, 50);

		GenericMethodTest genericMethodTest = new GenericMethodTest();
		Integer2 int2 = genericMethodTest.new Integer2();
		printParameter(int2);
	}

	public class Integer2 extends Number implements Comparable<Integer> {

		// public class Integer2 extends Number implements Comparable<Long> { bu olursa printParameter(int2); hata verir. Hem Number extend etmeli,
		// hem de Comparable<Integer> implement etmeli.

		@Override
		public int compareTo(Integer o) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int intValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public long longValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public float floatValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double doubleValue() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}
