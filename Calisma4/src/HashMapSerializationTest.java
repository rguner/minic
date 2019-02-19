import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HashMapSerializationTest implements Serializable {

	public static void main(String[] args) {
		HashMapSerializationTest st = new HashMapSerializationTest();
		try {
			st.testHashMap();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			st.testHashMap2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public class NotSerializableObject {

		public String s;

		public NotSerializableObject(String s) {
			this.s = s;
		}
	}

	public void testHashMap() throws Exception {
		Map<String, String> hmap = new HashMap<String, String>() {

			{
				put(new String("key"), new String("value"));
				put(new String("key2"), new String("value2"));
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
		Map<String, String> o = (HashMap<String, String>) in.readObject();
		bis.close();
		if (in != null) {
			in.close();
		}

		System.out.println(hmap);
		System.out.println(o);
	}

	public void testHashMap2() throws Exception {
		HashMap<String, NotSerializableObject> hmap = new HashMap<String, NotSerializableObject>() {

			{
				put(new String("key"), new NotSerializableObject("value"));
				put(new String("key2"), new NotSerializableObject("value2"));
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
		HashMap<String, NotSerializableObject> o = (HashMap<String, NotSerializableObject>) in.readObject();
		bis.close();
		if (in != null) {
			in.close();
		}

		System.out.println(hmap);
		System.out.println(o);

	}
}
