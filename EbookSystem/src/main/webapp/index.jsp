<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ebook System: Index Page</title>

<%@include file="allCss.jsp"%>
<style type="text/css">
.back-img {
	background-image: url("./photos/Photo.jpg");
	height: 50vh;
	width: 100%;
	background-size: cover;
	background-repeat: no-repeat;
}
.crd-ho:hover{
background-color: #fae1dc;

</style>

</head>
<body style="background-color:#f0e9e4">
	<%@include file="navbar.jsp"%>
	<div class="container-fluid back-img">
			<h2 class="text-center text-white">EBook System</h2>
	</div>
	
	
	<!---start recent book--->
	
	<div class="container" >
		<h3 class="text-center">Recent Book</h3>
		<div class="row">
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/java.jpg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>JAVA</p>
						<p>JAMES PETTERSON</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-2"><i class="fas fa-cart-plus"></i>Add Card</a><a
								href="" class="btn btn-success btn-sm ml-1">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">299</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/linux.jpg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>LINUX</p>
						<p>ROBERT</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-2"><i class="fas fa-cart-plus"></i>Add Card</a><a
								href="" class="btn btn-success btn-sm ml-1">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">349</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/node_js.jpg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>NODE JS</p>
						<p>GREG LIM</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-2"><i class="fas fa-cart-plus"></i>Add Card</a><a
								href="" class="btn btn-success btn-sm ml-1">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">299</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/sql.jpg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>SQL</p>
						<p>JOSEN PRICE</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-2"><i class="fas fa-cart-plus"></i>Add Card</a><a
								href="" class="btn btn-success btn-sm ml-1">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">399</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="text-center mt-1">
		<a herf=" " class="btn btn-danger btn-sm text-white">View All</a>
		
		</div>
	</div>
	<hr>
	<!-- End recent book -->
	
	<!---start New book--->
	
	<div class="container" >
		<h3 class="text-center">New Book</h3>
		<div class="row">
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/ios.jpg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>IOS</p>
						<p>JASSI FEILER</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-2"><i class="fas fa-cart-plus"></i>Add Card</a><a
								href="" class="btn btn-success btn-sm ml-1">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">345</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/android.jpg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>ANDROID</p>
						<p>JOHN HORTON</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-2"><i class="fas fa-cart-plus"></i>Add Card</a><a
								href="" class="btn btn-success btn-sm ml-1">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">299</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/ansi.jpg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>ANSI C++</p>
						<p>IVOR HORTON</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-2"><i class="fas fa-cart-plus"></i>Add Card</a><a
								href="" class="btn btn-success btn-sm ml-1">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">399</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/cyber.jpg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>CYBER</p>
						<p>WILLIAM STALLINGS</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-2"><i class="fas fa-cart-plus"></i>Add Card</a><a
								href="" class="btn btn-success btn-sm ml-1">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">375</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="text-center mt-1">
		<a herf=" " class="btn btn-danger btn-sm text-white">View All</a>
		
		</div>
	</div>
	<hr>
	<!-- End New book -->
	
	<!---start Old book--->
	
	<div class="container" >
		<h3 class="text-center">Old Book</h3>
		<div class="row">
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/computer network.png"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>COMPUTER NETWORK</p>
						<p>Er. RISHABH ANAND</p>
						<p>Categorie: New</p>
						<div class="row">
								<a href="" class="btn btn-danger btn-sm ml-5">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">380</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/computer graphics.jpg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>COMPUTER GRAPHICS</p>
						<p>VIJAY T PATIL</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-5">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">350</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/ui_ux.jpeg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>UI UX DESIGN</p>
						<p>RUSS UNGER</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-5">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">360</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="./photos/soft_Engg.jpg"
							style="width: 150px; height: 200px" class="img-thumbline">
						<p>SOFTWERE ENGINEERING</p>
						<p>GIRDHARI SINGH</p>
						<p>Categorie: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-5">View Details</a><a
								href="" class="btn btn-danger btn-sm ml-1">370</a>
						</div>
					</div>
				</div>
			</div>
				
		<div class="text-center mt-1">
		<a herf=" " class="btn btn-danger btn-sm text-white">View All</a>
		
		</div>
	</div>
	</div>
	
	<!-- End Old book -->
	
	<%@include file="footer.jsp" %>
</body>


</html>