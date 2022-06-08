package generics;

/**
 * Generic version of the Box class.
 * 
 * @param <L> the type of the value being boxed
 */
public class Box2<L> {

	// L stands for "Type"
	private L l;

	public void set(L l) {
		this.l = l;
	}

	public L get() {
		return l;
	}
}
