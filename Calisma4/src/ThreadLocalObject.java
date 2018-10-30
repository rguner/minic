public class ThreadLocalObject {

	public ThreadLocalObject() {
		ThreadLocalObjectUser threadLocalObjectUser = new ThreadLocalObjectUser();
		threadLocalObjectUser.userId = new Integer(1);
		this.threadLocalObjectUser = threadLocalObjectUser;
	}

	public String ad;
	public Integer number;
	public String soyad;
	public volatile ThreadLocalObjectUser threadLocalObjectUser;

	public class ThreadLocalObjectUser {

		public volatile Integer userId;
		public String user;
	}
}
