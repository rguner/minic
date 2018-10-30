import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorCalisma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IteratorCalisma itc = new IteratorCalisma();
		itc.removeHiddenOffers();

	}
	
	private void removeHiddenOffers() 
	{
		
        List<String> sArr= new ArrayList<String>();
        sArr.add("Ramazan");
        sArr.add("Ceyhan");
        sArr.add("Sevval");
        sArr.add("Omer");
        
        System.out.println(sArr);
               
		for ( Iterator<String> iterator= sArr.iterator(); iterator.hasNext();) 
		{
            String s = iterator.next();
            if (s.equalsIgnoreCase("Sevval") || s.equalsIgnoreCase("Ceyhan"))
                iterator.remove();
		}
		
		System.out.println(sArr);
    }


}
