<!DOCTYPE html>
<html>
<body>

<h2>Requisi��es de Compra</h2>

Message: ${mesg}

<table>

<c:forEach items="${prs}" var="pr">
	<tr>
		<td>${pr.getItem()}</td>
		<td>${pr.getValor()}</td>
	</tr>
<c:forEach>

</table>
</body>
</html>