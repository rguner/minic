package concurrentmodificationexc;

import java.util.ArrayList;
import java.util.List;

public class IteratorExample2 {

	public static void main(String args[]) {
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		// Iterator<String> it = myList.iterator();
		// while (it.hasNext()) {
		// String value = it.next();
		// System.out.println("List Value:" + value);
		// if (value.equals("3"))
		// myList.remove(value);
		// }

		// concurrent modification çıkmıyor ama doğru da sonuç göstermiyor :) List Value 4 de olmalıydı.
		// List Value:1
		// List Value:2
		// List Value:3
		// List Value:5

		for (int i = 0; i < myList.size(); i++) {
			String value = myList.get(i);

			System.out.println("List Value:" + value);
			if (value.equals("3"))
				myList.remove(value);
		}

	}
}
