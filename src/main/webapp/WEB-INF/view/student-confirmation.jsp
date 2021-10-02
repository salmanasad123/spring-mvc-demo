<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
    <title>Student Confirmation</title>
</head>

<body>

<%-- student is our model object that we have set in controller, we are using jsp expression language
so it will call student.getFirstName() / getter methods--%>
The Student is confirmed: ${student.firstName} ${student.lastName}
<br><br>
Country: ${student.country}

</body>
</html>