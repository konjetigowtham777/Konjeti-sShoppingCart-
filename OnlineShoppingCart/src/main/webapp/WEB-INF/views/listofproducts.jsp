<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<%@ include file="Header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Of The Products</title>

<script type="text/javascript">
$(document).ready(function(){
	var searchCondition='${searchCondition}'
	$('.table').DataTable({
		"lengthMenu":[[5,7,-1],[5,7,"All"]],
	    "oSearch" : {
		"sSearch" : searchCondition
		}
	})
})
</script>

</head>
<body style="background-color:RGB(238, 196, 183);">

	<div class="container">
		<b>List of Products</b>
		<table class="table table-striped" border="1">
			<thead>
				<tr>
					<th style="background-color:MediumSeaGreen">Id</th>
					<th style="background-color:rgb(0, 255, 127)">Image</th>
					<th style="background-color:rgb(154, 205, 50)">Product Name</th>
					<th style="background-color:rgb(0, 128, 128)">Price</th>
					<th style="background-color:rgb(32, 178, 170)">Category</th>
					<th style="background-color:rgb(255, 0, 0)">Quantity</th>
					<th style="background-color:rgb(32, 178, 170)">Action</th>
				</tr>
			</thead>
			<tbody>
				<!-- For each object in the list, tr has to be repeated -->
				<!--  items refers to the collection of objects -->
				<!-- var is local variable ,takes objects one by one from the collection -->
				<c:forEach var="p" items="${productsList}">
					<tr>

						<td><a
							href="<c:url value='/all/getproduct/${p.id} '></c:url>">${p.id}</a></td>
							
							</td>
							 <td><img src="<c:url value='/resources/images/${p.id }.png'></c:url>" height="30px" width="30px"></td>
							
						<td><a
							href="<c:url value='/all/getproduct/${p.id} '></c:url>">${p.productname}</a>
						</td>
						<td><a href="<c:url value='/all/getproduct/${p.id} '></c:url>">${p.price}</a>
						</td>
						<td>${p.category.categoryName }</td>
						
						<td><a href="<c:url value='/all/getproduct/${p.id} '></c:url>">${p.quantity}</a>
						</td>



						<!--  <td>${p.productname}</td>
				         <td>${p.price}</td> 
				          <td>${p.quantity}</td> -->


						<!-- <td>${p.productname }</td><td>${p.price }</td>  -->

						<td><a href="<c:url value='/all/getproduct/${p.id }'></c:url>"><span
								class="glyphicon glyphicon-info-sign"></span></a> 
								<security:authorize access="hasRole('ROLE_ADMIN')">
								<a href="<c:url value='/admin/deleteproduct/${p.id }'></c:url>"><span
								class="glyphicon glyphicon-trash"></span></a> 
								
								<a href="<c:url value='/admin/getupdateform/${p.id }'></c:url>"><span
								class="glyphicon glyphicon-pencil"></span></a>
								  </security:authorize>
		
								</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>


</body>
</html>