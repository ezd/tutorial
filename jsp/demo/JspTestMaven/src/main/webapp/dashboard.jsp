<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,com.ethioclick.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><th>Name</th><th>Sex</th><th>foods</th><th>country</th><th>remarks</th></tr>
<%
List<User> users= (List<User>) session.getAttribute("users"); 
for(User user:users)
{
%>
<tr><td><%=user.getName()%></td><td><%=user.getSex() %></td><td><%=user.getFoods() %></td><td><%=user.getCountry() %></td><td><%=user.getRemark() %></td><tr>
<%} %>
</table>
</body>
</html>