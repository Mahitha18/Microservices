<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Vendors</title>
</head>
<body>
<h2>Vendors</h2>
<table>
<tr>
<th>id</th>
<th>Code</th>
<th>Type</th>
<th>Email</th>
<th>Phone</th>
<th>Address</th>

</tr>
<c:forEach items="${vendors}" var="vendor">
<tr>
<td>${vendor.id}</td>
<td>${vendor.code}</td>
<td>${vendor.type}</td>
<td>${vendor.email}</td>
<td>${vendor.phone}</td>
<td>${vendor.address}</td>
<td><a href="deleteVendors?id=${vendor.id}">delete</a></td>
<td><a href="UpdateVendor?id=${vendor.id}">update</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>