
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!-- include tag library for JSP & add spring-webmvc.jar to lib folder -->	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute = "student">
			<br>
			<br>
			Last Name : <form:input path = "lastName" />
			
			<br>
			<br>
			Country:
			<form:select path="country">
				<form:options items = "${student.countries}" />
			</form:select>
		
			<br>
			<br>
			Favorite Language:
			Java <form:radiobutton path = "favouriteLanguage" value = "java" />
			Python <form:radiobutton path = "favouriteLanguage" value = "python" />
			Ruby <form:radiobutton path = "favouriteLanguage" value = "ruby" />
			C <form:radiobutton path = "favouriteLanguage" value = "c" />
			
			<br>
			<br>
			Operating System:
			Linux <form:checkbox path = "operatingSystem" value = "linux" />
			MS Windows<form:checkbox path = "operatingSystem" value = "msWindows" />
			Mac <form:checkbox path = "operatingSystem" value = "mac" />
			
			<br>
			<br>
			<input type=submit value = "submit" />
		</form:form>
	</body>
</html>