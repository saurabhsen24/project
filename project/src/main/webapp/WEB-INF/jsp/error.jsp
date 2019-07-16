<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
  <title>Register Successfull</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class = "container">
<h1 class = "text-center">You are not the real User !!!</h1><br/>
<div class = "col-md-12">
<%
   application.setAttribute("hitCounter", null);
%>
<div class = "text-center">
 <a href = "login" class = "btn btn-block btn-lg btn-danger">Back</a>
</div> 
</div> 
</div>
</body>
</html>