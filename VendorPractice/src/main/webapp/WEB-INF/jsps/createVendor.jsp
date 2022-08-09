<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="ShowUpdatedVendor" method="post">
		<pre>


Id: <input type="text" name="id" />
Code: <input type="text" name="code" />
Name:<input type="text" name="name" />
Type: <select name="type" id="type">
<option value="Select">Select</option>
<option value="Contractor">Contractor</option>
<option value="Permanent">Regular</option>
</select>
Email: <input type="text" name="email" />
Phone:<input type="text" name="phone" />
Address:<textarea id="addr" name="address"></textarea>
<input type="submit" value="submit" />


</pre>


	</form>
	<a href="showVendors">View All</a>


</body>
</html>