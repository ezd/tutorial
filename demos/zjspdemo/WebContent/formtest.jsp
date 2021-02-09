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

Name: <input name="username"/><br>
Sex: Male<input type="radio" name="sex" value="M" checked="checked">Female<input type="radio" name="sex" value="F"><br>
Favorite foods:<br>
Shiro wet<input type="checkbox" name="ffood" value="shiro"><br>
Doro wet<input type="checkbox" name="ffood" value="doro"><br>
siga wet<input type="checkbox" name="ffood" value="siga"><br>

Nationality:
<select name="country">
<option value="GE">Germany</option>
<option value="USA">USA</option>
<option value="FR">France</option>
</select><br>
Remarks:<br>
<textarea rows="3" name="remarks" ></textarea>
<br>
<input type="submit" value="Submit">
</form>


</body>
</html>