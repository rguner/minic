package calisma4;

public class NumberPrim {

	public Number number;

	public static void main(String[] args) {
		NumberPrim np = new NumberPrim();
		np.execute();
	}

	public void execute() {
		for (long i = 0; i < Long.MAX_VALUE; i++)
			number = i;
		System.out.println(number);
	}

}
