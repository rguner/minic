<%@ page import="java.util.*"%>
<%@ page import="java.lang.reflect.*"%>
<%@ page import="java.security.CodeSource"%>
<%@ page import="java.security.ProtectionDomain"%>
<%@ page import="java.net.URL"%>
<%@ page import="java.util.ResourceBundle"%>
<%@ page import="java.util.Enumeration"%>
<%@ page import="java.io.BufferedReader"%>
<%@ page import="java.io.IOException"%>
<%@ page import="java.io.InputStream"%>
<%@ page import="java.io.InputStreamReader"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>List Versions</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
<style type="text/css">
TABLE
{	
    FONT: 8pt Verdana;
}
.smallxx {
      font-family: Arial, Helvetica;
      font-size: 7 px;
      color: #000000;
      text-decoration:none;
}

</style>
</head>
<body>
<TABLE width="100%" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#1B005C">
  <TR> 
    <TD align="left"><IMG src="img/trcell.gif" width="50" height="59">
      <font color="white">SPD-RD-SD-TM-BC-SS<br>
      <b>Applications & System Info</b> Version 1.0
      </font>
    </td>
    <td align=right valign=bottom> 
      <font class="smallxx"><a href="mailto:mustafa.tan@turkcell.com.tr"><font color=green>Bugs&Comments</font></a></font>
    </TD>
  </TR>
 </TABLE>    
<br>

<%
try {
	ArrayList appList = new ArrayList();
	appList.add("com.turkcell.toska.Version");
	appList.add("com.turkcell.tea.Version");
	appList.add("com.turkcell.tea.search.Version");
	appList.add("com.turkcell.csi.Version");
	appList.add("tr.com.turkcell.ccsi.Version");
	appList.add("com.turkcell.abi.Version");
	
	
		
%>
<table cellSpacing="0" cellPadding="3" width="90%" border="1" style="border-collapse: collapse" bordercolor="#111111" align="center">
  <tr>
    <th bgColor="#000066" width="30%"><font color="#FFFFFF">Name</font></th>
    <th bgColor="#000066" width="30%"><font color="#FFFFFF">Version</font></th>
    <th bgColor="#000066" width="30%"><font color="#FFFFFF">Classpath</font></th>
  </tr>
<%
	int i = 0;
	while (i <appList.size()) {
		String className=appList.get(i).toString();
		
		String result = "N/A";
		try
		{
			Class temp = Class.forName(className);
			Method method1 = temp.getMethod("getVersion", new Class[] {});
			Object result1 = method1.invoke(temp,null);
			result = (String) result1;

		}catch (Exception e)
		{
			//e.printStackTrace();
		}		
		
		String versionInfo = result;
		
		
		if(!versionInfo.equals("N/A")){
		
			String resultC = "N/A";
			try
			{
			    Class tempC = Class.forName(className);
			    ProtectionDomain pDomain = tempC.getProtectionDomain();
			    CodeSource cSource = pDomain.getCodeSource();
			    URL loc = cSource.getLocation();
				resultC = loc.getFile();
			}catch (Throwable e)
			{
				//e.printStackTrace();
			}		
		
			String classPathInfo = resultC;
%>

		  <tr>
		    <td bgColor="#ffffcc" width="30%" align="left"><b><%=className%></b></td>
		    <td width="30%" align="left"><%=versionInfo%></td>
		    <td width="30%" align="left"><%=classPathInfo%></td>         
		  </tr>
<%
		}
		++i;
	}
%>  
</table>
<%
		String className = request.getParameter("className");
		if(className != null) {

			String resultCC = "N/A";
			try
			{
			    Class tempCC = Class.forName(className);
			    ProtectionDomain pDomain = tempCC.getProtectionDomain();
			    CodeSource cSource = pDomain.getCodeSource();
			    URL loc = cSource.getLocation();
				resultCC = loc.getFile();
			}catch (Throwable e)
			{
				//e.printStackTrace();
			}		
		
			String classPathInfo = resultCC;			
			out.println("<b>"+className+" -> "+classPathInfo+"</b>");
		}
		
		String sysProperty = request.getParameter("sysProperty");
		if(sysProperty != null) {
			
			try
			{
				String result = System.getProperty(sysProperty);
				out.println("<b>"+sysProperty+" = "+result+"</b>");
				//System.out.println(sysProperty +"="+ result +";");
			}catch (Throwable e)
			{
				out.println(e.getMessage());
			}			
			
		}

		String propFileName = request.getParameter("propFileName");
		if(propFileName != null) {
			
			try
			{
		        ResourceBundle propFile = ResourceBundle.getBundle(propFileName);
		        Enumeration enumeration = propFile.getKeys();
		        while (enumeration.hasMoreElements()){
			        String key = (String) enumeration.nextElement();
		        	out.println("<b>"+key+"</b> = "+propFile.getString(key)+"<br>");
		        }
				
			}catch (Throwable e)
			{
				out.println(e.getMessage());
			}			
			
		}
		
		String fileName = request.getParameter("fileName");
		if(fileName != null) 
		{
			InputStream is = null;  
			BufferedReader input = null;
			try
			{
				is = this.getClass().getClassLoader().getResourceAsStream(fileName);
				URL url=this.getClass().getClassLoader().getResource(fileName);
								
		    	input =  new BufferedReader(new InputStreamReader(is));
		      
		        String line = null; //not declared within while loop
		        try 
		        {
					out.println("<b>");
		        	out.println("<br><h1>" + fileName + "<h1>");
					out.println("<h1>" + url + "<h1><br>");

		        	while (( line = input.readLine()) != null)
					{
						out.println(line+"<br>");
					}
		        	System.out.println("</b>");
				} catch (Throwable e) {
					out.println(e.getMessage());
				}
			}
			catch(Exception e)
		    {
				out.println(e.getMessage());
		    }
		    finally
		    {
		    	try {
					is.close();
					input.close();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					out.println(e.getMessage());
				}
		    	
		    }
			
		}
		
		String versionFlag = request.getParameter("showVersionInfo");
		if(versionFlag != null){
			if(Boolean.parseBoolean(versionFlag)){
				out.println("<VersionInfo>");
				out.println(URLUtil.getStaticMethodValue("com.turkcell." + request.getContextPath().substring(1) + ".Version", "getVersion"));
				out.println("</VersionInfo>");
			}
		}
		
		String listPrincipals = request.getParameter("listPrincipals");
		if(listPrincipals != null)
		{
			out.println("<table>");
			Set principalSet = weblogic.security.Security.getCurrentSubject().getPrincipals();
			Iterator iterator = principalSet.iterator();
			while (iterator.hasNext()) 
			{
				Object elem = (Object) iterator.next();
				out.println("<tr><td>");
				out.println(elem.toString());
				out.println("</td></tr>");
				
			}
			out.println("</table>");
		}
		
		String sessionParam = request.getParameter("session");
		if(sessionParam != null)
		{
			try{
				out.println("<br></br><br></br><b>");

				com.turkcell.toska.model.Customer customer=(com.turkcell.toska.model.Customer)request.getSession().getAttribute("selectedCustomer");
				com.turkcell.toska.model.Product product=(com.turkcell.toska.model.Product)request.getSession().getAttribute("selectedProduct");
				com.turkcell.toska.model.User user = (com.turkcell.toska.model.User) request.getSession().getAttribute("tea.user");
				
				out.println("<table cellSpacing='0' cellPadding='3'width='50%' border='1' style='border-collapse: collapse' bordercolor='#111111' align='center'>");
				out.println("<tr>"
				    + "<th bgColor='#000066' width='30%'><font color='#FFFFFF'>Name</font></th>"
				    + "<th bgColor='#000066' width='30%'><font color='#FFFFFF'>Value</font></th>"
				  +"</tr>");

				String sCustomerId=((customer!=null)?String.valueOf(customer.getId()):"null");
				String sProductId=((product!=null)?String.valueOf(product.getId()):"null");
				out.println("<tr><td>" + "Env variable: MAYA_ENV" + "</td><td>" +  System.getProperty("MAYA_ENV") + "</td></tr>");
				out.println("<tr><td>" + "Env variable: HostName_WLSName" + "</td><td>" +  System.getProperty("HostName_WLSName") + "</td></tr>");
				out.println("<tr><td>" + "Customer Id" + "</td><td>" +  sCustomerId + "</td></tr>");
				out.println("<tr><td>" + "Product Id" + "</td><td>" +  sProductId + "</td></tr>");
				out.println("<tr><td>" + "maya.Confirmed_ncst" + "</td><td>" +  (String)request.getSession().getAttribute("maya.Confirmed_ncst") + "</td></tr>");
				out.println("<tr><td>" + "maya.Confirmed_nprd" + "</td><td>" +  (String)request.getSession().getAttribute("maya.Confirmed_nprd") + "</td></tr>");
				out.println("<tr><td>" + "tcl" + "</td><td>" +  (String)request.getSession().getAttribute("tcl") + "</td></tr>");
				out.println("<tr><td>" + "reqTcl" + "</td><td>" +  (String)request.getSession().getAttribute("reqTcl") + "</td></tr>");
				out.println("<tr><td>" + "reqUrl" + "</td><td>" +  (String)request.getSession().getAttribute("reqUrl") + "</td></tr>");
				out.println("<tr><td>" + "applicationName" + "</td><td>" +  (String)request.getSession().getAttribute("applicationName") + "</td></tr>");
				out.println("<tr><td>" + "versionInfo" + "</td><td>" +  (String)request.getSession().getAttribute("versionInfo") + "</td></tr>");
				out.println("<tr><td>" + "isUserTEATEYID01" + "</td><td>" +  (String)request.getSession().getAttribute("isUserTEATEYID01") + "</td></tr>");
				out.println("<tr><td>" + "isUserKCMPY01" + "</td><td>" +  (String)request.getSession().getAttribute("isUserKCMPY01") + "</td></tr>");
				
				
				if (user==null)
					out.println("<tr><td>" + user + "</td><td>" +  "null" + "</td></tr>");
				else
				{
					out.println("<tr><td>" + "TAM Code"+ "</td><td>" +  user.getTamCode() + "</td></tr>");
					out.println("<tr><td>" + "TBO Code"+ "</td><td>" +  user.getTboDealerId() + "</td></tr>");
					out.println("<tr><td>" + "TBO Name"+ "</td><td>" +  user.getCostCenter().getCostCenterCode() + "</td></tr>");
					out.println("<tr><td>" + "dealerType"+ "</td><td>" +  user.getDealerType() + "</td></tr>");
					out.println("<tr><td>" + "contactId"+ "</td><td>" +  user.getContactId() + "</td></tr>");
					out.println("<tr><td>" + "contactMethod"+ "</td><td>" +  user.getContactMethod() + "</td></tr>");
					out.println("<tr><td>" + "contactMode"+ "</td><td>" +  user.getContactMode() + "</td></tr>");
					out.println("<tr><td>" + "enabledContactMode"+ "</td><td>" +  user.getEnabledContactMode() + "</td></tr>");
					out.println("<tr><td>" + "aqSid"+ "</td><td>" +  user.getAqSid() + "</td></tr>");
					out.println("<tr><td>" + "touchId"+ "</td><td>" +  user.getTouchId() + "</td></tr>");
					out.println("<tr><td>" + "callerType"+ "</td><td>" +  user.getCallerType() + "</td></tr>");															
				}
				
				out.println("</table>");
				
			}catch(Exception e){
				out.println(e.getMessage() + "  " + e.toString());
			}
			
			try
			{
				out.println("<br></br><br><center>Tüm Session Bilgileri</center></br><b>");
				out.println("<table cellSpacing='0' cellPadding='3'width='50%' border='1' style='border-collapse: collapse' bordercolor='#111111' align='center'>");
				out.println("<tr>"
				    + "<th bgColor='#000066' width='30%'><font color='#FFFFFF'>Name</font></th>"
				    + "<th bgColor='#000066' width='30%'><font color='#FFFFFF'>Value</font></th>"
				  +"</tr>");
 
				Enumeration enames = request.getSession().getAttributeNames();
				   while (enames.hasMoreElements()) 
				   {
				      try
				      {
				    	  String name = (String) enames.nextElement();
				    	  if (!name.startsWith("user.menu")) // do not show user.menu
			    		  {
				    		  Object o =request.getSession().getAttribute(name);
				    		  String value="";
				    		  if (o instanceof String)
				    		  	value=(String)o;
				    		  else if (o instanceof Integer)
					    		  value=Integer.toString((Integer)o);
				    		  else if (o instanceof Long)
					    		  value=Long.toString((Long)o);
				    		  else
				    			  value="..";
							out.println("<tr><td>" + name + "</td><td>" +  value + "</td></tr>");
				    	  }
				      }
				      catch(Exception er)
				      {
				    	  
				      }
				   }   
				
				out.println("</table>");
				
			}catch(Exception e){
				out.println(e.getMessage() + "  " + e.toString());
			}
				

		}

		
} catch (Exception e){
	out.println(e.getMessage());
}		
%>
</body>
</html>