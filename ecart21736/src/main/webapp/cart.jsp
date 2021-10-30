<%@page import="com.moses.Model.Item"%>
<%@page import="com.moses.Dao.ItemDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
	
		ItemDao dao = new ItemDao();
		
		Item item = (Item) dao.getItemById(id);
		
		
		
		
		response.sendRedirect("store.jsp");
		
		
	%>
	
	
</body>
</html>