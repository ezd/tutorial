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
<% out.print("Response from message verification is:"+session.getAttribute("responsemssege")); %><br>

<% 
Integer counter=(Integer)application.getAttribute("counter");
if(counter==null || counter==0){
	counter=1;
}else{
	counter+=1;
}
out.print("visited number of fimes:"+counter);
application.setAttribute("counter", counter);

%>

</body>
</html>