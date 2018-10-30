package clone;

public class AltClonableObject implements Cloneable {

	public String adres2;

	@Override
	public Object clone() throws CloneNotSupportedException {
		AltClonableObject a = (AltClonableObject) super.clone();
		return a;
	}

}
