<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>${pageTitle}</h2>
selam1

<c:set var="deviceRelatedServiceItems" value="ramazan" scope="request" />

<c:if test="${ not empty deviceRelatedServiceItems}">
	selam
</c:if>


link
<br>

<h3>${selfLink}</h3>

${yorum}
${puan}


</body>
</html>
