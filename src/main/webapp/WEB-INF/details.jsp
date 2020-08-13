<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dojos details</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>

<style>

	.container {
	margin-top: 25px;}
	
</style>

<body>
    <div class="container">
        <h1>${dojo.name} Location Ninjas</h1>
        
            
            
        <table class="table table-striped mt-3">
            <tbody>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Age</th>
                </tr>
                <c:forEach items="${dojo.ninjas}" var="ninja">
                    <tr>
                        <td>${ninja.first_name}</td>
                        <td>${ninja.last_name}</td>
                        <td>${ninja.age}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
            
            
            
            
                
                
            
    
    </div>
</body>
</html>