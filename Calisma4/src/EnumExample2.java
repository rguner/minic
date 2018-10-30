public class EnumExample2 {

	public static void main(String[] args) {
		EnumExample2 enumExample = new EnumExample2();
		enumExample.execute();
	}

	private void execute() {
		// int currentMood = 1;
		int currentMood = Mood.HAPPY.id | Mood.SAD.id;
		if ((currentMood & (Mood.HAPPY.id | Mood.OPTIMISTIC.id | Mood.ENERGETIC.id)) != 0) {
			System.out.println("ok");
		} else {
			System.out.println("ok degil");
		}

	}

	enum Mood {

		HAPPY(1), SAD(2), CALM(4), SLEEPY(8), OPTIMISTIC(16), PENSIVE(32), ENERGETIC(64);

		private int id;

		Mood(int id) {
			this.id = id;
		}
	}

}
