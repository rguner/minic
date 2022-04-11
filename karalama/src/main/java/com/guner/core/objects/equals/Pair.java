package com.guner.core.objects.equals;// Java program to demonstrate equals(Object a, Object b) method

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
	public boolean equals(Object o)
	{
		if (!(o instanceof Pair)) {
			return false;
		}
		Pair<?, ?> p = (Pair<?, ?>) o;
		return Objects.equals(p.key, key) && Objects.equals(p.value, value);
		
	}
}

class GFG
{
	public static void main(String[] args)
	{
		Pair<String, String> p1 =
				new Pair<String, String>("GFG", "geeksforgeeks.org");
		
		Pair<String, String> p2 =
				new Pair<String, String>("GFG", "geeksforgeeks.org");
		
		Pair<String, String> p3 =
				new Pair<String, String>("GFG", "www.geeksforgeeks.org");
		
		System.out.println("p1 equals p2 " + p1.equals(p2));
		System.out.println("p2 equals p3 " + p2.equals(p3));
		System.out.println("p1 == p2 " + (p1==p2) );
		System.out.println("p2 == p3 " + (p2==p3) );

	}
}
