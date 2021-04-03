<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Customer Registration Form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
First Name : <form:input path="firstName" />
		<br>
		<br>
Last Name : <form:input path="lastName" />
		<form:errors path="firstName" cssClass="error" />
		<br>
		<br>
Free passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error"></form:errors>
Postal code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error"></form:errors>
		<br>
		<br>
Course code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error"></form:errors>
		
		
		<input type="submit" value="Submit" />

	</form:form>
</body>
</html>