package clone;

public class ClonableObject implements Cloneable {

	public String ad;
	public String soyad;
	public Integer no;
	public NonClonableObject nonClonableObject;
	public AltClonableObject altClonableObject;

	@Override
	public Object clone() throws CloneNotSupportedException {
		// altClonableObject.clone();
		// return super.clone();
		ClonableObject clonableObject = (ClonableObject) super.clone();
		clonableObject.altClonableObject = (AltClonableObject) altClonableObject.clone();
		return clonableObject;
	}

}
