<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
<fieldset>
<form action="./changepassword" method="post">
<table>
<a href="./home">home</a>&nbsp&nbsp&nbsp&nbsp&nbsp
<h4><%=msg%></h4>

<a href="./logout" >Logout</a>

<tr><td>New Password</td>
<td><input type="password" name="newpassword"></td></tr>


<tr><td>Confirm Password</td>
<td><input type="password" name="Confirmpassword"></td></tr>

<tr><td><input type="submit" name="Change" value="change"></td></tr>
</table>
</form>
</fieldset>

</body>
</html>