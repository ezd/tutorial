<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.util.Enumeration"
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

</ul>
</body>
</html>