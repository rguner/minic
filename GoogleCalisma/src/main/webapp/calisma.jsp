<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Hello World!</h2>
selam1

<c:set var="deviceRelatedServiceItems" value="ramazan" scope="request" />
<c:set var="corporate" value="true" scope="request" />

<c:if test="${ not empty deviceRelatedServiceItems}">
	selam
</c:if>

<c:if test="${not corporate && not empty deviceRelatedServiceItems}">
ikinci....
</c:if>


</body>
</html>
