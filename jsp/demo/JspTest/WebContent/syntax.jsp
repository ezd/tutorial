<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- if else syntax -->
<% int x=10;
if(x%2==0){
%>
<p>The number is even</p>
<% } else { %>
<p>The number is odd</p>
<%} %>

<% 
if(x%2==0){
out.print("The number is even number");
}else{
	out.print("The number is odd number");
}
%>
<!-- forloop syntax -->
<%-- <% for(int i=0;i<3;i++){ %>
<p style="font-size: <%=(i+1)*10%>px ">the text</p>
<%} %> --%>

<!-- while loop syntax -->
<% int i=3; 
while(i>0){ %>
<p style="font-size: <%=(i+1)*10%>px ">the text</p>
<%
i--;
} %>


</body>
</html>