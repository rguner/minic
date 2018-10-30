package genel;

import java.util.ArrayList;
import java.util.List;


public class ParcalaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParcalaExpression p = new ParcalaExpression();
		//p.parcala();
		String komut="AND(EQUAL_INTEGERS(COMPARE_INTEGERS(#a,\"3\"),\"1\"),EQUAL_INTEGERS(COMPARE_INTEGERS(#a,\"10\"),\"-1\"))";
		//p.recursiveParse(komut);
		//p.parcala2();
		String komut2="AND(GREATER_THEN(#a,\"3\"),LESS_THEN(#a,\"10\"),LESS_THEN(#c,\"2\"))";
		p.recursiveParseToDb(komut2);
		p.dene();
		p.dene2();
		

	}
	
	public void parcala() 
	{
		String komut="AND(EQUAL_INTEGERS(COMPARE_INTEGERS(#a,\"3\"),\"1\"),EQUAL_INTEGERS(COMPARE_INTEGERS(#a,\"10\"),\"-1\"))";
		System.out.println(komut);
		
		
		String expression="EQUAL_INTEGERS(COMPARE_INTEGERS(";
		int index=komut.indexOf(expression);		
		int indexBir=0;
		int indexKapanis=0;
		String parametre="";
		if (index>0)
		{
			indexBir=komut.indexOf("\"),\"", index);
			parametre=komut.substring(index+expression.length(),indexBir+1);
			if (komut.substring(indexBir).startsWith("\"),\"1\")")) // "1"
				komut=komut.substring(0,index)+ "GREATER_THEN("+ parametre+ ")"+komut.substring(indexBir+7);
			else if (komut.substring(indexBir).startsWith("\"),\"-1\")")) // "-1"
				komut=komut.substring(0,index)+ "LESS_THEN("+ parametre+ ")"+komut.substring(indexBir+8);
			
			System.out.println(komut);
			
		}
		
			
	}
	
	public void parcala2() 
	{
		String komut="AND(GREATER_THEN(#a,\"3\"),LESS_THEN(#a,\"10\"))";
		System.out.println(komut);
		
		
		String expression="GREATER_THEN(";		
		int index=komut.indexOf(expression);		
		int indexKapanis=0;
		String parametre="";
		if (index>0)
		{
			indexKapanis=komut.indexOf("\")", index);
			parametre=komut.substring(index+expression.length(),indexKapanis+1);
			komut=komut.substring(0,index)+ "EQUAL_INTEGERS(COMPARE_INTEGERS("+ parametre+ "),\"1\")" + komut.substring(indexKapanis+2);
			System.out.println(komut);		
		}
		else
		{
			expression="LESS_THEN(";		
			index=komut.indexOf(expression);		
			indexKapanis=0;
			parametre="";
			if (index>0)
			{
				indexKapanis=komut.indexOf("\")", index);
				parametre=komut.substring(index+expression.length(),indexKapanis+1);
				komut=komut.substring(0,index)+ "EQUAL_INTEGERS(COMPARE_INTEGERS("+ parametre+ "),\"-1\")" + komut.substring(indexKapanis+2);
				System.out.println(komut);		
			}
			
		}
			
	}
	
	public String recursiveParseFromDb(String komut) 
	{
		String expression="EQUAL_INTEGERS(COMPARE_INTEGERS(";
		int index=komut.indexOf(expression);		
		int indexBir=0;
		String parametre="";
		if (index>0)
		{
			indexBir=komut.indexOf("\"),\"", index);
			parametre=komut.substring(index+expression.length(),indexBir+1);
			if (komut.substring(indexBir).startsWith("\"),\"1\")")) // "1"
				komut=komut.substring(0,index)+ "GREATER_THEN("+ parametre+ ")"+komut.substring(indexBir+7);
			else if (komut.substring(indexBir).startsWith("\"),\"-1\")")) // "-1"
				komut=komut.substring(0,index)+ "LESS_THEN("+ parametre+ ")"+komut.substring(indexBir+8);
			
			return recursiveParseFromDb(komut);
		}
		else
		{
			System.out.println(komut);
			return komut;
		}
	}
	
	public String recursiveParseToDb(String komut) 
	{
		String expression="GREATER_THEN(";		
		int index=komut.indexOf(expression);		
		int indexKapanis=0;
		String parametre="";
		if (index>0)
		{
			indexKapanis=komut.indexOf("\")", index);
			parametre=komut.substring(index+expression.length(),indexKapanis+1);
			komut=komut.substring(0,index)+ "EQUAL_INTEGERS(COMPARE_INTEGERS("+ parametre+ "),\"1\")" + komut.substring(indexKapanis+2);
			return recursiveParseToDb(komut);		
		}
		else 
		{			
			expression="LESS_THEN(";		
			index=komut.indexOf(expression);		
			indexKapanis=0;
			parametre="";
			if (index>0)
			{
				indexKapanis=komut.indexOf("\")", index);
				parametre=komut.substring(index+expression.length(),indexKapanis+1);
				komut=komut.substring(0,index)+ "EQUAL_INTEGERS(COMPARE_INTEGERS("+ parametre+ "),\"-1\")" + komut.substring(indexKapanis+2);
				return recursiveParseToDb(komut);		
			}
		}
		
		System.out.println(komut);
		return komut;

		
	}
	
	/**
	 * 
	 * @param errParams
	 */
	private String[] exceptionParser(String[] errParams) {

		final String TOTEM_HATA="Ramazan";
		for (int i=0;i<errParams.length;i++)
		{
			if (errParams[i]!=null)
			{
				int index=errParams[i].indexOf(TOTEM_HATA);
				if (index > 0)
					errParams[i]=errParams[i].substring(TOTEM_HATA.length()+index);
			}
		}
		
		return errParams;
		
		
	}
	
	public void dene()
	{
		String errParams[]= new String[2];
		errParams[0]=".wferfrfrfr.Ramazan Guner";
		errParams[1]="..Guner";
		
		String[] a=exceptionParser(errParams);
		System.out.println(a);
		
	}
	
	public void dene2()
	{
		String contactId="a1121233_b2_c3";
		String interactionId="";
		if (contactId.indexOf("_")>0) // "a_b_c" seklinde ise
			interactionId=contactId.substring(0,contactId.indexOf("_"));
		System.out.println(interactionId);
		
	}
	

		

}
