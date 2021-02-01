<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
User Name:<br>
<%=request.getParameter("username") %><br>
User Sex:<br>
<%=request.getParameter("sex") %><br>
User favorite foods:<br>
<ul>
<%String[] foods=request.getParameterValues("fvfood"); 
for(String food:foods){
%>
<li><%=food %></li>
<%
}
%>
</ul>
<br>
User nationality:<br>
<%=request.getParameter("country") %><br>
User remarks:<br>
<%=request.getParameter("remarks") %><br>


</body>
</html>