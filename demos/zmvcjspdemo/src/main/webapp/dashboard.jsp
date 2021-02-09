<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,com.ethioclick.test.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

List<User> users= (List<User>)session.getAttribute("users");


%>

<table>
<tr><th>Name</th><th>Sex</th><th>Foods</th><th>Country</th><th>Remarks</th></tr>
<%

for(User user:users)
{
%>
<tr><td><%=user.getName() %></td> <td><%=user.getSex() %></td><td><%=user.getFoods() %></td><td><%=user.getCountry() %></td><td><%=user.getRemarks() %></td></tr>
<%} %>
</table>

</body>
</html>