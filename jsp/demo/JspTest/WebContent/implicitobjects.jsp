<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    session="true" %> <!-- the default is true, if we turn it off it will not allow session to be used, throw error -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="requesttest.jsp?msg=secret">Go to message verification page </a><br><br>
<% out.print("Response from message verification is:"+session.getAttribute("responsemssege")); %>
</body>
</html>