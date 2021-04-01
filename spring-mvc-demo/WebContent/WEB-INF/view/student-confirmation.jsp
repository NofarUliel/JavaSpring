<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core"
	prefix="c"%>
<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
	The student is confirmed : ${student.firstName} ${student.lastName}

	<br>
	<br> Country: ${student.country}
	<br>
	<br> Favorite Language: ${student.favoriteLanguage}
	<br>
	<br> Operating System Language: ${student.favoriteLanguage}
	<ul>
		<c:forEach var="temp" items="$student.operatingSystem">
			<li>${temp}</li>
		</c:forEach>

	</ul>
</html>