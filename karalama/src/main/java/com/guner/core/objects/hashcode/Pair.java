package com.guner.core.objects.hashcode;// Java program to demonstrate Objects.hashCode(Object o) object

import java.util.Objects;

class Pair<K, V>
{
	public K key;
	public V value;

	public Pair(K key, V value)
	{
		this.key = key;
		this.value = value;
	}


	@Override
	public int hashCode()
	{
		return (Objects.hashCode(key) ^ Objects.hashCode(value));

		/* without Objects.hashCode(Object o) method
		return (key == null ? 0 : key.hashCode()) ^
		(value == null ? 0 : value.hashCode()); */
	}


	public int hashCode2()
	{
		return Objects.hash(key, value);
	}

}

class GFG
{
	public static void main(String[] args)
	{
		Pair<String, String> p1 =
				new Pair<String, String>("GFG", "geeksforgeeks.org");
		Pair<String, String> p2 =
				new Pair<String, String>("Code", null);
		Pair<String, String> p3 = new Pair<String, String>(null, null);
		Pair<String, String> p4 =
				new Pair<String, String>("GFG", "geeksforgeeks.org");
		Pair<String, String> p5 =
				new Pair<String, String>("GFG", "geeksforgeeks.org");

		System.out.println("HashCode---------------------");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		System.out.println(p5.hashCode());
		System.out.println("HashCode2--------------------");
		System.out.println(p1.hashCode2());
		System.out.println(p2.hashCode2());
		System.out.println(p3.hashCode2());
		System.out.println(p4.hashCode2());
		System.out.println(p5.hashCode2());
	}
}
