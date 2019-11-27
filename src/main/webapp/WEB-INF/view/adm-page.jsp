<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<h2>Requisições de Compra</h2>


<table border="1">
<tr>
	<c:forEach var="i" items="${cabecalho}">
		<th><b>${i}</b></th>
	</c:forEach>
</tr>
<c:forEach var="pr" items="${prs}">
	<tr>
		<td>${pr.get_id()}</td>
		<td>${pr.getItem()}</td>
		<td>${pr.getNumero()}</td>
		<td>${pr.getQuantidade()}</td>
		<td>${pr.getValor()}</td>
	</tr>
</c:forEach>

</table>
</body>
</html>