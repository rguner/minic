package inheritence;

public class Class2 extends Class1 {

	public static void main(String[] args) {
		Class2 class2 = new Class2();
		class2.execute();
	}

	private void execute() {
		if (this instanceof IntDeneme)
			System.out.println("Class2 IntDenemeyi implemente eder");
		if (this instanceof IntDeneme2)
			System.out.println("Class2 IntDenemeyi2 implemente eder");
		yaz();

	}
}
