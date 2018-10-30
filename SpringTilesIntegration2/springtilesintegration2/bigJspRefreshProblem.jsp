<html>
<head>
<title>Big Jsp Refresh problem</title>
</head>
<body>
<%
for(int i=0;i<20000;i++)
	out.println("<b>Data "  + i + " </b>");
%>
</body>
</html>