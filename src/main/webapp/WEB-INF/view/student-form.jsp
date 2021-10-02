<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
    <title>Student Registration Form</title>
</head>

<body>

<%--  we set model attribute "student" in the form because controller set the data on the model so we
use the same key to access the model here

when the form is first loaded Spring MVC will call getFirstName() getter methods to load or pre-populate the form
and similarly when we submit the form spring mvc will call setter methods to set the data in the model object
so controller can access the data that form has set using the same model
--%>
<form:form action="processForm" modelAttribute="student">

    First Name: <form:input path="firstName"/>

    <br><br>

    Last Name: <form:input path="lastName"/>

    <br><br>

    <%--  when we submit the form spring will call student.setCountry() setter method--%>
    Country: <form:select path="country">
    <form:option value="Brazil" label="Brazil"/>
    <form:option value="France" label="France"/>
    <form:option value="Germany" label="Germany"/>
    <form:option value="India" label="India"/>

    </form:select>

    <br><br>

    <input type="submit" value="Submit">

</form:form>

</body>
</html>