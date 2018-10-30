<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test JSP uygulamasi</title>
<!--  http://guner.turkcell.com.tr:9010/classloader2/webapp/deneme.jsp -->
</head>
<body>

<%
Thread.sleep(2000);
for (int i=0;i<20; i++)
{
	java.util.Date date= new java.util.Date();	
	out.println("<b>"+ date + "</b><br>");
}

%>

<%@ include file="denemeIncluded.jsp"%>


</body>
</html>	