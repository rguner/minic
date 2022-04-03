package com.guner.core.objects.requirenonnull;// Java program to demonstrate Objects.requireNonNull(Object o)
// and Objects.requireNonNull(Object o, String message) methods

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

	public void setKey(K key) {
		this.key = Objects.requireNonNull(key);
	}
	
	public void setValue(V value) {
		this.value = Objects.requireNonNull(value, "no value");
	}
}

class GFG
{
	public static void main(String[] args)
	{
		Pair<String, String> p1 =
					new Pair<String, String>("GFG", "geeksforgeeks.org");
		
		p1.setKey("Geeks");
		
		// below statement will throw NPE with customized message
		p1.setValue(null);
		
	}
}
