class Test extends Thread {

	boolean keepRunning = true;

	public void run() {
		while (keepRunning) {
			System.out.println(".");
		}

		System.out.println("Thread terminated.");
	}

	public static void main(String[] args) throws InterruptedException {
		String s = "ramazan-guner";
		String[] a = s.split("-");
		System.out.println(a[0]);
		Test t = new Test();
		t.start();
		Thread.sleep(3000);
		t.keepRunning = false;
		System.out.println("keepRunning set to false.");

		String webLink = "http://ramazan?abc=ded";
		if (webLink.contains("?")) {
			String[] weblinkArr = webLink.split("\\?");
			webLink = weblinkArr[0];
		}
		System.out.println(webLink);
	}
}
