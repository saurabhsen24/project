<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
  <title>Register Successfull</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv='cache-control' content='no-cache'>
  <meta http-equiv='expires' content='0'>
  <meta http-equiv='pragma' content='no-cache'>   
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<style>
h4{
  margin-top : 3em;
  font-size : 3em;
}
</style>
<body>
<div class = "container">
<h1 class = "text-center">Wrong Username or password !!!</h1><br/>
      <%
         Integer hitsCount = (Integer)application.getAttribute("hitCounter");
         if( hitsCount == null || hitsCount == 0 ) {
            hitsCount = 1;
         } else {
            hitsCount += 1;
         }
         application.setAttribute("hitCounter", hitsCount);
      %>
<div class = "col-md-12">
<div class = "text-center">
 <a href = "loginStudent" class = "btn btn-block btn-lg btn-warning">Login</a>
 <h4>
 <%
 
    out.println(hitsCount + " attempt"+"<br/><br/><br/>");
    out.print(3-hitsCount + " attempt left...");
     if(hitsCount > 3){
    	 response.sendRedirect("error");
     }
 %>
 </h4>
</div> 
</div> 
</div>
</body>
</html>