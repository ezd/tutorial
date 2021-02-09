<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int i=5; %>

<%

if(i%2==0){	
out.print("<p style=\"color:red; \">this is even number</p>");
}else{
	out.print("<p style=\"color:blue; \">this is odd number</p>");
}
%>

<%
int x=3;

while(x>0){
%>	
<p style="font-size: <%=(x)*10 %>px"> while this is text - <%=(i+1) %></p>	
<% 

x--;
}

%>

</body>
</html>