<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Customer Registration form</title>
<style>
		.error {color:red}
</style>

</head>
<body>

<form:form action="processForm" modelAttribute="customer">
		FirstName : <form:input path="firstName"/>
		<br><br>
		LastName(*) : <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		FreePasses: <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error" />
		<br><br>
		
		<input type="submit" value="Submit" />

</form:form>

</body>
</html>