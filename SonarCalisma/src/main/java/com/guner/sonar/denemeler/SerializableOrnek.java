package com.guner.sonar.denemeler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializableOrnek implements Serializable {

	private static final long serialVersionUID = -3972064037281577576L;
	private String text1 = "text1";
	private SerializableOrnek2 serializableOrnek2;
	private transient SerializableOrnek3 serializableOrnek3;
	private List<SerializableOrnek2> serializableOrnek2List;

	public static void main(String[] args) {
		SerializableOrnek serializableOrnek = new SerializableOrnek();
		serializableOrnek.serializeObject();
		serializableOrnek.deserializeObject();
	}

	private void serializeObject() {

		try
		{
			serializableOrnek2 = new SerializableOrnek2();
			serializableOrnek2.setText2("text2From SerializableOrnek");

			setSerializableOrnek3(new SerializableOrnek3());

			List<SerializableOrnek2> list = new ArrayList<SerializableOrnek2>();
			list.add(serializableOrnek2);
			list.add(serializableOrnek2);
			list.add(serializableOrnek2);

			// serialize oluyor
			// serializableOrnek2List = list;

			// serialize oluyor
			serializableOrnek2List = list.subList(0, 2);

			FileOutputStream fileOut = new FileOutputStream("d://dev//temp//1//SerilazibleOrnek.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(this);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in d://dev//temp//1//SerilazibleOrnek.ser");
		} catch (IOException i)
		{
			i.printStackTrace();
		}

	}

	private void deserializeObject() {
		SerializableOrnek s;
		try
		{
			FileInputStream fileIn = new FileInputStream("d://dev//temp//1//SerilazibleOrnek.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			s = (SerializableOrnek) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i)
		{
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c)
		{
			System.out.println("SerializableOrnek class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized SerializableOrnek...");
		System.out.println("text1 " + s.text1);
		System.out.println("SerializableOrnek2 " + s.getSerializableOrnek2());
		System.out.println("SerializableOrnek3 " + s.getSerializableOrnek3());
		System.out.println("serializableOrnek2List " + serializableOrnek2List.size());
	}

	public SerializableOrnek2 getSerializableOrnek2() {
		return serializableOrnek2;
	}

	public void setSerializableOrnek2(SerializableOrnek2 serializableOrnek2) {
		this.serializableOrnek2 = serializableOrnek2;
	}

	public SerializableOrnek3 getSerializableOrnek3() {
		return serializableOrnek3;
	}

	public void setSerializableOrnek3(SerializableOrnek3 serializableOrnek3) {
		this.serializableOrnek3 = serializableOrnek3;
	}

}
