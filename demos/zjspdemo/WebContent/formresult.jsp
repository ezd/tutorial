<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Name:<%=request.getParameter("username") %><br>
Sex:<%=request.getParameter("sex") %><br>
Favorite foods:<br>
<ul>

<% String[] foods=request.getParameterValues("ffood"); 

for(String food:foods)
{
%>
<li><%=food %></li>
<%
}
%>
<br>
Nationality : <%=request.getParameter("country") %><br>
User remarks: <%=request.getParameter("remarks") %>

</ul>
</body>
</html>