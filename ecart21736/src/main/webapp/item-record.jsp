<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%
    	Map<String, String> errors = (Map) session.getAttribute("errors");
    	pageContext.setAttribute("error", errors);
    	session.removeAttribute("errors");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:black ; color:white ;font-size:20px">
<a href="/ecart21736/store.jsp">Shop List</a>
<h2>Online Shoping  Cart Information System </h2>

<form action="RecordServlet" method="post">
 <label>code </label>
 <input type="text" name="code"  placeholder="Enter only 4 digits"><label>${error["codeerror"]}</label>
 <br>
 <br>
 <label>Name</label>
 <input type="text" name="name"  placeholder="Enter the name of the product">
 <br>
 <br>
 <label>Brand</label>
 <input type="text" name="brandUnit"  placeholder="Enter The Brand">
 <br>
 <br>
 <label>Unit Price</label>
 <input type="text" name="unitPrice"  placeholder="Enter your UnitPrice">
 <br>
 <br>
 <label>quantity</label>
 <input type="text" name="quantity"  placeholder="Enter the quantity">
 <br>
 <br>
 
  <label>Selling Price</label>
 <input type="text" name="sellingPrice"   placeholder="Enter your sellingPrice">
 <br>
 <br>
 <input type="submit" value="SAVE">

</form>

</body>
</html>