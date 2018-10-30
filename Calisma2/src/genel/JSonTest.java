package genel;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;


public class JSonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JSonTest j= new JSonTest();
		j.jsonDeneme();
		
		
		

	}

	private void jsonDeneme() {
		Map model = new HashMap();
		model.put("contactId", "Id1");
		model.put("productId","123");
		model.put("ramId",null);
		
		JSONObject jsonObject = JSONObject.fromObject( model );
		System.out.println(jsonObject);
		
		
		
		System.out.println(model.get("contactId"));
		System.out.println(model.get("ramazan"));
		System.out.println(model.get("productId"));
		System.out.println(model.get("ramId"));
		
		
	}

}
