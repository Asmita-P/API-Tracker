<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>API Tracker</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left;
}
</style>
</head>
<body>
	<form:form action="/getMonthReport" method="post"
		modelAttribute="list">
		<h3 style="color: red;">${currMonth} Month API Report</h3>
		<table>
		<thead>
		<tr>
		<th>Date</th>
		<th>APIs</th>
		<th>API Keys</th>
		<th>Hit Count</th></tr>
		</thead>
		<tbody>
		<c:forEach var="det" items="${list}">
		<tr>
		<td><c:out value="${det.hitDate}"></c:out>
		<td><c:out value="${det.apiUrl}"></c:out>
		<td><c:out value="${det.apiKey}"></c:out>
		<td><c:out value="${det.hitCount}"></c:out>
		</tr>
		</c:forEach>
		</tbody>
		
		</table>

	</form:form>
</body>
</html>
