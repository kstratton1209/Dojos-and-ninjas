<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dojos and Ninjas</title>
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
        <h1>Vacations</h1>
        
        <div class="row">
            <div class="col">
                <h3>Add a Dojo</h3>
                <form:form action="/dojo" method="post" modelAttribute="dojo">
                    <div class="form-group">
                        <label>Dojo Name:</label>
                        <form:input path="name" class="form-control" />
                        <form:errors path="name" class="text-danger" />
                    </div>
                    <input type="submit" class="btn btn-primary" value="Add Dojo" />
                </form:form>
            </div>
            <div class="col">
                <h3>Add a Ninja</h3>
                <form:form action="/ninja" method="post" modelAttribute="ninja">
                    <div class="form-group">
                        <label>First name:</label>
                        <form:input path="first_name" class="form-control" />
                        <form:errors path="first_name" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label>Last name:</label>
                        <form:input path="last_name" class="form-control" />
                        <form:errors path="last_name" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label>Age:</label>
                        <form:input path="age" class="form-control" />
                        <form:errors path="age" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label>Dojo:</label>
                        <select name="dojo" class="form-control">
                            <c:forEach items="${dojos}" var="d">
                                <option value="${d.id}">${d.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <input type="submit" class="btn btn-primary" value="Add Ninja" />
                </form:form>
              </div>
            </div>   
            
          
            
            
            
                
                
            
    
    </div>
</body>
</html>