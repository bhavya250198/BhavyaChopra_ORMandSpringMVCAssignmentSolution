<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
	<style>
		.container{
		text-align:center;
		}
		a{
		text-decoration:none;
		font-size:16px;
		font-weight:400;
		}
	</style>
	
	<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
	<h2>Customer-Details</h2>
	<div class="container">
	<form class="form-inline">
		<a href="/customers/addCustomer" class="btn btn-primary btn-sm mb-3">Add Customer</a>
	</form>
		<table class="table table-bordered">
			<thead class="thead-dark">
				<tr>
					<th>Name</th>
					<th>Surname</th>
					<th>Email</th>
					<th>Action</th>
					
				</tr>
			</thead>
			<tbody>
			 <c:forEach items="${details}" var="tempCustomer">
				<tr>
					<td><c:out value="${tempCustomer.firstName }"/></td>
					<td><c:out value="${tempCustomer.lastName }"/></td>
					<td><c:out value="${tempCustomer.emailAddress }"/></td>
					<td>
						 <a
							href="/customers/updateCustomer?customerId=${tempCustomer.id}"
							class="btn btn-info btn-sm"> Update
							 </a> 
							<a href="/customers/deleteCustomer?customerId=${tempCustomer.id}"
							class="btn btn-danger btn-sm"
							onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">
								Delete </a>

						</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	</div>
</body>

</html>