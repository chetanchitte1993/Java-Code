<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="allCss.jsp" %>
</head>
<style type="text/css">
			#CNAForms{box-shadow:0px 0px 30px gray;margin-top:30px;margin-bottom:30px;}
			i.fa,b{color:teal;}
		</style>
<body style="background-color:#f0f1f2;">
<%@include file="navbar.jsp" %>
<div class="container">
	<div class="row mt-2">
		<div class="col-md-4 offset-md-4">
			<div class="card">
				<div class="card-body">
				<h4 class="text-center"><b>Login</b></h4>
				
				<c:if test="${not empty failedMsg}">
				<h5 class="text-center text-danger">${failedMsg}</h5>
				<c:remove var="failedMsg" scope="session"/>
				</c:if>
				
				<form action ="LoginServlet" method="post">
					<div class="form-group">
                			<b>Email id</b>
           					   <div class="input-group">
                					  <input id="TxtEmailId" type="text" placeholder="Enter Email id" maxlength="50" class="form-control" required="required" name="email"/>
            			  	   </div>
            		</div>
            		<div class="form-group">
						<b>Password</b>
              				<div class="input-group">
                    			
                    				<input id="TxtPassword" type="password" placeholder="Enter Password" maxlength="15" class="form-control" required="required" name="password"/>
                			</div>
                	</div>
                		<div class="text-center">
                			<button type="submit" class="btn btn-primary">Submit</button><br>
                			<a href="register.jsp">Create Account</a>
                		</div>
                	</form>
            		</div> 
				</div>		
			</div>
		</div>
	 </div>
</body>
</html>