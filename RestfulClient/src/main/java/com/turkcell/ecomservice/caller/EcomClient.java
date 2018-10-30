package com.turkcell.ecomservice.caller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class EcomClient {
	
	public static void main(String[] args) {
		try {

			System.out.print("Kullanim: ");
			System.out.println("java -jar RestfulClient.jar [url] [input] [runCount]");
			String urlString="http://10.201.213.81:29011/ecomservice/getBaskets.do";
			//String input = "{\"msisdn\":\"5322100234\",\"channel\":\"TSHOP\"}";
			String input = "{msisdn:5322100234,channel:TSHOP}";
			//String input="{glossary:{title:exampleglossary,GlossDiv:{title:S,GlossList:{GlossEntry:{ID:SGML,SortAs:SGML,GlossTerm:Standard,Acronym:SGML,Abbrev:ISO,GlossDef:{para:A,ghhh,GlossSeeAlso:[GML,XML]},GlossSee:markup}}}}}";
			int runCount=1;
			System.out.println("Ornek : java -jar RestfulClient.jar " + urlString + " " + input + " " + runCount );
			
			if (args.length>0)
			{
				if (args[0]!=null)
					urlString = args[0];
				if (args[1]!=null)
					input = args[1];
				if (args[2]!=null)
					runCount = Integer.valueOf(args[2]);
			}
			
			// json icin "" karakterleri yerlestiriliyor..
			input=input.replace("{", "{\"");
			input=input.replace("}", "\"}");
			input=input.replace("[", "[\"");
			input=input.replace("]", "\"]");
			input=input.replace(":", "\":\"");
			input=input.replace(",", "\",\"");
			input=input.replace(":\"{", ":{");
			input=input.replace("}\"", "}");
			input=input.replace("\"[", "[");
			input=input.replace("]\"", "]");			
			System.out.println("replaced " + input);
			input=input.replace("", "");
			
			
			System.out.println("");
			System.out.println(urlString + " " + input + " parametresiyle " + runCount + " adet cagriliyor..") ; 
			Client client = Client.create();
			WebResource webResource = client.resource(urlString);			
								
			for (int i=0;i<runCount;i++)
			{
				long t=System.currentTimeMillis();
				ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);
	
				if (response.getStatus() != 200) {
					System.out.print("Sure: " + (System.currentTimeMillis()-t));
					System.out.print(" ms. Sonuc: ");
					System.out.println("Failed : HTTP error code : "+ response.getStatus());
				}
				else
				{				
					String output = response.getEntity(String.class);
					System.out.print("Sure: " + (System.currentTimeMillis()-t));
					System.out.print(" ms. Sonuc: ");
					System.out.println(output);
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
			

		}

	}

}
