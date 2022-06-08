package calisma4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTester {

	public static void main(String[] args) {
		SerializableTester serializableTester = new SerializableTester();
		serializableTester.execute();
	}

	private void execute() {

		// String myObject = "ramazan";

		SerializableObject myObject = new SerializableObject();

		try {
			new ObjectOutputStream(new ByteArrayOutputStream()).writeObject(myObject);
			System.out.println("Serializable ok");

		} catch (IOException e) {
			System.err.println("Serializable Nok");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
