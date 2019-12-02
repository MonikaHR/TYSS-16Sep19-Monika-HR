<%@page import="com.tyss.retailermanagementsystem.dto.ProductBean"%>
<%@page import="com.tyss.retailermanagementsystem.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%
    RetailerBean bean = (RetailerBean)session.getAttribute("bean");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./updatePassword">Update Password</a>
<a href="./logout" style="float: right;">Logout</a>
<h2>WELCOME <%=bean.getName()%></h2>
<fieldset>
		<legend>Search Product Here-------</legend>
		<form action="./search">
			<table>
				<tr>
					<td>ID:</td>
					<td><input name = "id" type = "number"></td>
					<td><input type = "submit" value = "Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>


	<%ProductBean productBean =(ProductBean)request.getAttribute("bean"); %>
	<%
	if (productBean !=null){
	%>
	<table>
		<tr>
			<th>PID</th>
			<th>PName</th>
			<th>Price</th>
		</tr>
		<tr>
			<td><%=productBean.getPid() %></td>
			<td><%=productBean.getPname() %></td>
			<td><%=productBean.getPriceperUnit() %></td>
		</tr>
	</table>
	<% 
	}
	%>
	<h3>${msg}</h3>

</body>
</html>