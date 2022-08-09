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


	<form action="/ShowUpdatedVendor" method="post">
		<pre>


Id: <input type="text" name="id" value="${vendor.id}" readonly/>
Code: <input type="text" name="code" value="${vendor.code}"/>
Name:<input type="text" name="name" value="${vendor.name}"/>
Type: <select name="type" id="type" >
<option ${vendor.type=='Select'?'selected':''}>Select</option>
<option ${vendor.type=='Contractor'?'selected':''}>Contractor</option>
<option ${vendor.type=='Permanent'?'selected':''}>Regular</option>
</select>
Email: <input type="text" name="email" value="${vendor.email}"/>
Phone:<input type="text" name="phone" value="${vendor.phone}"/>
Address:<textarea id="address" name="address">${vendor.address}</textarea>
<input type="submit" value="submit" />


</pre>


	</form>
	<a href="showVendors">View All</a>


</body>
</html>