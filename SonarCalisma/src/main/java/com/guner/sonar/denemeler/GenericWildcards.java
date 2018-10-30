package com.guner.sonar.denemeler;

import java.util.Arrays;
import java.util.List;

public class GenericWildcards
{

	public static void wildcardTest1(List<Number> box)
	{

	}

	public static void wildcardTest2(List<? extends Number> box)
	{

	}

	public static void main(String args[])
	{
		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		List<Integer> intList = Arrays.asList(intArray);
		List<Double> doubleList = Arrays.asList(doubleArray);
		List<Character> charList = Arrays.asList(charArray);

		// GenericWildcards.wildcardTest1(intList); hata verir, çünkü List<Integer>, List<Number> ın üst classı olmaz. bu nedenle wildcardlar var.
		// GenericWildcards.wildcardTest1(doubleList); bu da hata verir, aynı nedenle..

		GenericWildcards.wildcardTest2(intList);
		GenericWildcards.wildcardTest2(doubleList);
		// GenericWildcards.wildcardTest2(charList); // bunu hata vermesi normal, ? extens Number'a uymuyor...

	}
}
