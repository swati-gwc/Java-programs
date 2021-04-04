<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "spring" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width =device-width, initial-scale=1.0">
        <title>Spring MVC By Swati</title>
    </head>
    <body style="background-color: beige">
        <div>
            <center>
            <h3>Implementation of Spring MVC</h3>
            <h4>Login Form</h4>
            
            <h4 style="Color: red">${message}</h4>     
            
            <spring:form method= "POST" commandName="myclass" action="login.htm">
                Enter Username: 
                <spring:input path="username" placeholder="Enter Username"/><br><br>
                Enter Password:
                <spring:password path="password" placeholder="Enter Password"/><br><br>
                <input type="submit" value="Login"/>
                
            </spring:form>
                
            </center>
        </div>
    </body>
</html>
