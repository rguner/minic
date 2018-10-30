package inheritence;

public class Class1 implements IntDeneme {

	@Override
	public void yaz() {
		if (this instanceof IntDeneme)
			System.out.println("Class1 IntDenemeyi implemente eder");
		System.out.println("yaz");

	}

}
