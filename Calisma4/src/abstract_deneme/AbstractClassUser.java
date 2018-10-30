package abstract_deneme;

public class AbstractClassUser {

	public static void main(String[] args) {
		AbstractClassUser abstractClassUser = new AbstractClassUser();
		abstractClassUser.execute();
	}

	private void execute() {
		AbstractDeneme abstractDeneme = AbstractDeneme.getInstance();
		System.out.println("ad " + abstractDeneme.ad);

	}

}
