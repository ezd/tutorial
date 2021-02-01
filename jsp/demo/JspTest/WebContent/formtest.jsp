<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="formresult.jsp" method="post">
Name:<input type="text" name="username" required="true"/></br>
Sex: Male<input type="radio" name="sex" value="male" checked="checked">Female<input type="radio" name="sex" value="female"><br>
Favorite food:<br>
Shiro<input type="checkbox" name="fvfood" value="shiro"><br>
Doro<input type="checkbox" name="fvfood" value="doro"><br>
Misir<input type="checkbox" name="fvfood" value="misir" ><br>
Nationality:
<select  name="country">
<option value="US">USA</option>
<option value="UAE">UAE</option>
<option value="GM">Germany</option>
</select><br>
Remarks:<br>
<textarea rows="3" name="remarks">
</textarea>
<br>
<input type="submit" value="Submit">
</form>
</body>
</html>