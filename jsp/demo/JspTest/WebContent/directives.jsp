<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List,java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "header.jsp" %>
These are my interests:
<div>
<ul>
<% 
List<String> interests=new ArrayList<String>(); 
interests.add("Reading");
interests.add("Teaching");

for(String interst:interests){
%>
<li><%=interst %></li>
<%
}
%> 
</ul>
</div>
<%@ include file = "footer.jsp" %> 
</body>
</html>