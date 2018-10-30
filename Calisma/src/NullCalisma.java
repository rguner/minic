import java.util.ArrayList;
import java.util.List;

import com.asn1c.core.Null;


public class NullCalisma {
	
	public static void main(String[] args) {
		NullCalisma nullCalisma = new NullCalisma();
		nullCalisma.execute();
	}

	private void execute() {
		 List<Object> values = new ArrayList<>();
		 
		 //values=null;
		 for (Object object : values) {
			 System.out.println("deneme");
		 }
		 
		
	}

}
