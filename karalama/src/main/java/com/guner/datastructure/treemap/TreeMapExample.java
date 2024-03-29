package com.guner.datastructure.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		// Create a TreeMap
		TreeMap<String, String> treemap = new TreeMap<String, String>();

		// Add key-value pairs to the TreeMap
		treemap.put("Key1", "Item1");
		treemap.put("Key5", "Item2");
		treemap.put("Key3", "Item3");
		treemap.put("Key4", "Item4");
		treemap.put("Key2", "Item5");
		treemap.put("Key7", "Item7");
		treemap.put("Key9", "Item9");

		// Get a set of the entries
		Set set = treemap.entrySet();

		// Get an iterator
		Iterator it = set.iterator();

		// Display elements
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.print("Key is: " + me.getKey() + " & ");
			System.out.println("Value is: " + me.getValue());
		}

		System.out.println("Intial Map: "+treemap);

		System.out.println("Head Map: "+ treemap.headMap("Key3"));

		System.out.println("Sub Map: "+treemap.subMap("Key2", "Key4"));

		System.out.println("Tail Map: "+treemap.tailMap("Key2"));

		System.out.println("Tail Map: "+treemap.tailMap("Key6"));
	}
}
