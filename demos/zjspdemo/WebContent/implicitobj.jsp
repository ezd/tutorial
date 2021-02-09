<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
it is working....
<a href="requesttest.jsp?msg=secret&secretKey=123456">Go to request test</a><br>
<%out.print("you are on home page"); %><br>
<%
Integer mycount= (Integer)application.getAttribute("count");
if(mycount==null||mycount==0){
	mycount=1;
}else{
	mycount+=1;
}
out.println("Number of times accessed:"+mycount);
application.setAttribute("count", mycount);

%> <br>
Error msg:<%=session.getAttribute("error") %>
</body>
</html>