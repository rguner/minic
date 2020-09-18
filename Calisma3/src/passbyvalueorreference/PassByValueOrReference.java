package passbyvalueorreference;

import java.util.concurrent.atomic.AtomicInteger;

public class PassByValueOrReference {

	public static void main(String[] args) {

		PassByValueOrReference passByValueOrReference = new PassByValueOrReference();
		passByValueOrReference.execute();

		passByValueOrReference.executeInt();
		passByValueOrReference.executeInteger();
		passByValueOrReference.executeString();
		passByValueOrReference.executeAtomicInt();

	}

	private void executeInt() {

		int i = 10;
		System.out.println("i --> " + i);
		executeIntMethod(i);
		System.out.println("i --> " + i);

	}

	private void executeIntMethod(int a) {
		a = 20;
	}

	private void executeInteger() {

		Integer i = 10;
		System.out.println("integer --> " + i);
		executeIntegerMethod(i);
		System.out.println("integer --> " + i);

	}

	private void executeIntegerMethod(Integer a) {
		a = 20;
	}

	private void executeString() {

		String str = "ramazan";
		System.out.println("str --> " + str);
		executeStringMethod(str);
		System.out.println("str --> " + str);

	}

	private void executeStringMethod(String s) {
		s = "guner";
	}

	private void executeAtomicInt() {

		AtomicInteger i = new AtomicInteger(10);
		System.out.println("AtomicInteger --> " + i);
		executeAtomicIntMethod(i);
		System.out.println("AtomicInteger --> " + i);

	}

	private void executeAtomicIntMethod(AtomicInteger a) {
		a.getAndIncrement();
	}

	private void execute() {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		sb1.append("execute1 taraf�ndan eklendi.");
		sb2.append("execute1 taraf�ndan eklendi.");
		execute2(sb1, sb2);
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());

	}

	private void execute2(StringBuffer sb1, StringBuffer sb2) {
		sb1.append("execute2 taraf�ndan eklendi.");
		sb2 = new StringBuffer();
		sb2.append("execute2 taraf�ndan eklendi.");
	}

}
