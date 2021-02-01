<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int x=3; int y=5; int sum=0; int mul=0;%>
<% 
sum=x+y;
mul=x*y;
%>
Date of today is: <%= (new java.util.Date()).toLocaleString() %></br>

Sum of <%=x %> and <%=y %> is: <%=sum %><br>
Multiplication of <%=x %> and <%=y %> is: <%=mul %><br>

<%out.print("Thank you for using our application!"); %>
<%-- <%=out.print("Thank you for using our application!") %>dosent work --%>
</body>
</html>