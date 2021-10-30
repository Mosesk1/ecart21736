<%@page import="com.moses.Dao.ItemDao"%>
<%@page import="com.moses.Model.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Bk</title>
</head>
<body>
<h1>LIST OF ALL ON Shoping Cart</h1>
<a href="/ecart21736/item-record.jsp">Add New</a>
<br>
<br>
<%
List<Item> itemList=ItemDao.getAllItems();
%>
<table>
<thead>
<tr>
<th>code</th>
<th>name</th>
<th>brandUnit</th>
<th>unitPrice</th>
<th>quantity</th>
<th>registrationDate</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<%
for (Item item:itemList){ %>
<tr>
<td><%=item.getCode() %></td>
<td><%=item.getName() %></td>
<td><%=item.getBrandUnit() %></td>
<td><%=item.getUnitPrice() %></td>
<td><%=item.getQuantity() %></td>
<td><%=item.getRegistrationDate() %></td>

 <td>
 <a href="/ecart21736/cart.jsp?id=<%=item.getCode() %>">add to cart</a>
 </td>
 </tr>
<% } %>
</tbody>



</table>
</body>
</html>