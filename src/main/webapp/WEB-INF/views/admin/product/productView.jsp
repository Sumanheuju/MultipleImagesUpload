<%@ include file="../../includes/header.jsp" %>
<h1>Product View Page</h1>

<button><a href="/admin/addproducts">Add Product</a></button>

<c:forEach var="product" items="${products}">
	<h3>${product.productName}</h3> <a href="/admin/editproducts?productId=${product.productId}">edit</a>
									<a href="/admin/deleteproducts?productId=${product.productId}">delete</a>
	
</c:forEach>

<%@ include file="../../includes/footer.jsp" %>