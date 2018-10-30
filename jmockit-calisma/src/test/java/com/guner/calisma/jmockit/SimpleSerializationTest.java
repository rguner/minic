package com.guner.calisma.jmockit;

import static org.junit.Assert.*;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SimpleSerializationTest {

	@Test
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

		Assert.assertEquals(hmap, o);
	}

	@Test
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

		assertEquals(hmap, o);
	}
}
