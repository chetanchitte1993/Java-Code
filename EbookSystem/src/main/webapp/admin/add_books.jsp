<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin:Add Books</title>
<%@include file ="allCss.jsp" %>
</head>
<body style="background-color:#f0f2f2;">
<%@include file ="navbar.jsp" %>

<div class="container p-2">
	<div class="row">
		<div class="col-md-4 offset-md-4">
			<div class="card">
				<div class="card-body">
				<h4 class="text-center">Add Books</h4>
				<c:if test="${not empty succMsg }">
				<p class ="text-center text-success">${succMsg}</p>
				<c:remove var="sucessMsg" scope="session" />
				</c:if>
				
				<c:if test="${not empty failedMsg }">
				<p class ="text-center text-danger">${failedMsg}</p>
				<c:remove var="failedMsg" scope="session" />
				</c:if>
				
				<form action="../add_books" method="post" enctype="multipart/form-data">
				 
							<div class="form-group">
								<label for="exampleInputBookName">Book Name</label>
								 <input type="text" class="form-control" maxlength="30" id="exampleInputBookName" name="bname">
							</div>
									
								<div class="form-group">
									<label for="exampleAuthorName">Author Name</label> 
									<input type="text" class="form-control" maxlength="50" id="exampleAuthorName" name="author">
								</div>
								<div class="form-group">
									<label for="examplePrice">Price</label>
									 <input type="number" class="form-control" maxlength="4" id="examplePrice" name="price">
								</div>
								
								<div class="form-group">
									<label for="inputState">Books Categories</label>
									 <select id="inputState" name="categories" class="from-control">
										 <option selected>---Select---</option>
										 <option value="new">New Book</option>
									 </select>
								</div>
								
								<div class="form-group">
									<label for="inputState">Books Status</label>
									 <select id="inputState" name="status" class="from-control">
									 <option selected>---Select---</option>
									 <option value="Active">Active</option>
									 <option value="Inactive">Inactive</option>
									 </select>
								</div>
								<div class="form-group">
									 <label for="exampleFromControlFile1">Upload Photo</label>
									 <input name="bimg" type="file" class="form-control-file" id="exampleFromControlFile1">
								</div>
								<button type="submit" class="btn btn-primary">Add</button>
						</form>
				</div>
			</div>
		</div>
	</div>
</div>
	
<div style="margin-top: 20px;"><%@include file="footer.jsp"%></div>
</body>
</html>