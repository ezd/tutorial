<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.util.List, java.util.ArrayList"
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="header.jsp" %>

<hr>

<%

List<String>favoriteFoods=new ArrayList<String>();
favoriteFoods.add("Shiro");
favoriteFoods.add("Doro");

for(String food:favoriteFoods){
	%>
	<h3><%=food %></h3>
<% 	
}
%>

<hr>
<%@ include file="footer.html" %>

</body>
</html>