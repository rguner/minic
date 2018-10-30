package com.guner.calisma.jmockit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SimpleSerialization {

	public static void main(String[] args) {
		SimpleSerialization simpleSerialization = new SimpleSerialization();
		try {
			simpleSerialization.testHashMap();
			simpleSerialization.testHashMapInnerClass();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testHashMap() throws Exception {
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("key", "value");

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = null;
		out = new ObjectOutputStream(bos);
		out.writeObject(hmap);
		byte[] yourBytes = bos.toByteArray();
		if (out != null) {
			out.close();
		}
		bos.close();

		ByteArrayInputStream bis = new ByteArrayInputStream(yourBytes);
		ObjectInput in = null;
		in = new ObjectInputStream(bis);
		HashMap<String, String> o = (HashMap<String, String>) in.readObject();
		bis.close();
		if (in != null) {
			in.close();
		}

	}

	public void testHashMapInnerClass() throws Exception {
		HashMap<String, String> hmap = new HashMap<String, String>() {

			{
				put(new String("key"), new String("value"));
			}
		};

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = null;
		out = new ObjectOutputStream(bos);
		out.writeObject(hmap);
		byte[] yourBytes = bos.toByteArray();
		if (out != null) {
			out.close();
		}
		bos.close();

		ByteArrayInputStream bis = new ByteArrayInputStream(yourBytes);
		ObjectInput in = null;
		in = new ObjectInputStream(bis);
		Object o = in.readObject();
		bis.close();
		if (in != null) {
			in.close();
		}

	}
}
