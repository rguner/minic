package abstract_deneme;

public abstract class AbstractDeneme {

	public String ad = "ramazan";

	public static final AbstractDeneme getInstance() {

		return new AbstractDeneme() {};
	}

}
