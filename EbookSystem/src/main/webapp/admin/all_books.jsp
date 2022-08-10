<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin:All Books</title>
<%@include file ="allCss.jsp" %>
</head>
<body>
<%@include file ="navbar.jsp" %>
<h3 class="text-center"> Hello Admin </h3>

<table class="table table-striped">
  <thead class="bg-primary">
    <tr>
      <th scope="col">ID</th>	
      <th scope="col">Image</th>
      <th scope="col">Book Name</th>
      <th scope="col">Author Name</th>
      <th scope="col">Price</th>
      <th scope="col">Book Categories</th>
      <th scope="col">Status</th>
      <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
  </tbody>
</table>
<div style="margin-top: 300px;"><%@include file="footer.jsp"%></div>
</body>
</html>