<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="jstl is working...fine"/>

<c:set var="name" scope="session" value="kebed.tesema"></c:set>
<c:set var="salary" scope="session" value="${2000+100}"/>

<c:if test="${salary>2000 }">
<p>your salary is <c:out value="${salary}"/>. it is good </p>
</c:if>

<c:if test="${salary<2000 }">
<p>your salary is <c:out value="${salary}"/>. it is bad </p>
</c:if>
<hr>

<c:choose>
<c:when test="${salary<2000}">
<p>it is small salary!</p>
</c:when>
<c:when test="${2000<salary && salary<3000}">
<p>it is medium salary!</p>
</c:when>

<c:when test="${salary>4000}">
<p>it is large salary!</p>
</c:when>

</c:choose>
<hr>
About your name:<br>
<c:if test="${fn:contains(name,'.') }">
<c:out value="invalid character . found at ${fn:indexOf(name,'.') } index"/><br>
Before change: <c:out value="${name }"/><br>
<c:set var="name" value="${fn:replace(name,'.', '  ') }" />
After change: <c:out value="${name }"/><br>
After Upper case: <c:out value="${fn:toUpperCase(name)}"/><br>
</c:if>

</body>
</html>