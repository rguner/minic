package clone;

public class NewOrClone {

	// private static final int BUYUK_SAYI = Integer.MAX_VALUE/20;
	private static final int BUYUK_SAYI = 5;

	public static void main(String[] args) {
		NewOrClone newOrClone = new NewOrClone();
		// newOrClone.execute1();
		// newOrClone.execute2();
		newOrClone.exucuteClonableObject();
	}

	private void exucuteClonableObject() {
		ClonableObject clonableObject = new ClonableObject();
		clonableObject.ad = "ramazan";
		clonableObject.soyad = "guner";
		clonableObject.no = 1200;

		NonClonableObject nonClonableObject = new NonClonableObject();
		nonClonableObject.adres = "Kucukyali";
		clonableObject.nonClonableObject = nonClonableObject;

		AltClonableObject altClonableObject = new AltClonableObject();
		altClonableObject.adres2 = "Istanbul";
		clonableObject.altClonableObject = altClonableObject;

		for (int i = 0; i < BUYUK_SAYI; i++) {
			try {
				ClonableObject clonableObject2 = (ClonableObject) clonableObject.clone();
				if (i == 2) {
					clonableObject2.ad = "Ceyhan";
					clonableObject2.soyad = "Fidan";
					clonableObject2.altClonableObject.adres2 = "Pamukova";
				}
				System.out.println("Id: " + clonableObject2 + " deger: " + clonableObject2.ad + " "
						+ clonableObject2.soyad + " " + clonableObject2.no + " "
						+ clonableObject2.nonClonableObject + " "
						+ clonableObject2.nonClonableObject.adres + " "
						+ clonableObject2.altClonableObject + " "
						+ clonableObject2.altClonableObject.adres2);

			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
