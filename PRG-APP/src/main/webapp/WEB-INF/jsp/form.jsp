<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello NHS!! Greetings!!</title>
</head>
<body>
<h2 align="center">Hello NHS!! Greetings!!</h2>

<form:form action="success" modelAttribute="txtboxvalue" method="post">
<table align="center" bgcolor="lightblue">
<tr>
<td>
Text Box: <form:input path ="txtbox" type ='text'/> 
<form:errors path="txtbox" cssClass="red"/>
</td>
</tr>
<tr>
<td><tr><td align ="center">
<input type="submit" value="submit"/> </td>
</tr>
</table>
</form:form>
</body>
</html>