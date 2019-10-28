<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<head>
    <title>Student Conformation</title>
</head>

<body>
The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>
Favorite Programming Language: ${student.favoriteLanguage}

<br><br>
Operation Systems:
<ul>
    <c:forEach var="temp" items="${student.operationSystem}">
        <li>${temp}</li>
    </c:forEach>
</ul>

</body>

</html>