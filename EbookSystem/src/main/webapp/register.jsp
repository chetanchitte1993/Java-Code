<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ebook System: Register</title>
<%@include file="allCss.jsp"%>
</head>
<style type="text/css">
#CNAForms {
	box-shadow: 0px 0px 30px gray;
	margin-top: 30px;
	margin-bottom: 30px;
}

i.fa, b {
	color: teal;
}
</style>
<body style="background-color: #f0f1f2;">
	<%@include file="navbar.jsp"%>
	<div class="container p-2">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div c lass="card">
					<div class="card-body">
						<h4 class="text-center">
							<b>Registration Page</b>
						</h4>
						<c:if test="${not empty succMsg}">
						<p class="text-center text-sucess">${succMsg }</p>
						<c:remove var="succMsg" scope="session"/>
						</c:if>
						
						<c:if test="${not empty failedMsg }">
						<p class="text-center text-danger">${failedMsg }</p>
						<c:remove var="failedMsg" scope="session"/>
						</c:if>
						
						
						<form action="register" method="post">
							<div class="form-group">
								<label for="exampleInputFullName">Enter Full Name</label>
								 <input type="text" class="form-control" maxlength="100" id="exampleInputFullName" required="required" name="name">
							</div>
									
								<div class="form-group">
									<label for="exampleInputEmail">Email address</label> 
									<input type="email" class="form-control" maxlength="50" id="exampleInputEmail" required="required" name="email">
								</div>
								<div class="form-group">
									<label for="exampleInputContact">Contact No</label>
									 <input type="text" class="form-control" maxlength="12" id="exampleInputContact" required="required" name="phhno">
								</div>
								
								<div class="form-group">
									<label for="exampleInputPassword">Password</label>
									 <input type="password" class="form-control"maxlength="8" id="exampleInputPassword" required="required" name="password">
								</div>
								<div class="form-check">
									<input type="checkbox" class="form-check-input" name="check" id="exampleCheck">
									 <label class="form-check-label" for="exampleCheck">Agree Terms and Condition</label>
								</div>
								<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>

</body>
</html>