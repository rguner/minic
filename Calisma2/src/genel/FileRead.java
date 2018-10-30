package genel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class FileRead {
	
	public void getContents() 
	{
		InputStream is = null;  
		BufferedReader input = null;
	    try
	    {
	    	is = this.getClass().getClassLoader().getResourceAsStream("ehcache.xml");
	    	input =  new BufferedReader(new InputStreamReader(is));
	      
	        String line = null; //not declared within while loop
	        try 
	        {
	        	System.out.println("<b>");
	        	while (( line = input.readLine()) != null)
				{
					System.out.println(line+"<br>");
				}
	        	System.out.println("</b>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    finally
	    {
	    	try {
				is.close();
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }
	}	    
	
	public static void main(String[] args) 
	{
		System.out.println("Basla..");
		FileRead f = new FileRead();
		f.getContents();
	}
	
	
	
	


}
