<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page import="java.util.List" %>
<%@ page import="com.intelsoft.entity.User"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <title>Employers List...</title>
  
</head>
<body 


<h1>User Information Form</h1>

<font color='green'>${msg}</font>
    <form:form action="user" method="post" modelAttribute="user">
        <form:label path="uname">Username:</form:label>
        <form:input path="uname" /><br><br>

        <form:label path="uemail">Email:</form:label>
        <form:input path="uemail" /><br><br>

        <form:label path="phno">Phone Number:</form:label>
        <form:input path="phno" /><br><br>

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>






























