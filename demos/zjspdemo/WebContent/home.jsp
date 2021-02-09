<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%! int x=3; int y=6;  %>

<% 
int sum=0;
sum=x+y;

%>


<%
if(sum%2==0){
%>
<p style="color:red">
<%
} 
else {
%>
<p style="color:green">
<%} %>
The sum of <%=x %> and <%=y %> is <%=sum %>
</p>

</body>
</html>