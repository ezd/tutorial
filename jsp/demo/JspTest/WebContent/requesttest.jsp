<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.util.Enumeration,java.io.*,java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- option-1 -->
<%-- The secret message is:<%=request.getParameter("msg") %> --%>
<!-- option-2 -->
The messages received are:
<ul>
<% 
Enumeration paramnames= request.getParameterNames();
while(paramnames.hasMoreElements()){
	String paramname=(String) paramnames.nextElement();
%>
	<ol><%=request.getParameter(paramname) %></ol>
<% 
}
%>
<!-- out implicit object example -->
<% out.print("Thank you for visiting"); %>

<!-- session test -->
<% 
if(request.getParameter("msg")!=null){//there is atleast one msg
session.setAttribute("responsemssege", "Msg verified");
out.print("<br><a href=\"implicitobjects.jsp\">Back</a>"); 
}else{
	response.sendRedirect("error.jsp");
}
%>

<!-- application state -->
<% 
Integer counter=(Integer)application.getAttribute("counter");
if(counter==null || counter==0){
	counter=1;
}
out.print("visited number of fimes:"+counter);
application.setAttribute("counter", counter);
counter++;
%>

</ul>
</body>
</html>