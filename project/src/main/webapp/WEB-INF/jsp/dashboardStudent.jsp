<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>DASHBOARD</title>
  <meta charset="utf-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv='cache-control' content='no-cache'>
  <meta http-equiv='expires' content='0'>
  <meta http-equiv='pragma' content='no-cache'>   
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<style>
.rightpart{
  height : 600px;
  margin-left: -4.5em;
  margin-top: -1.5em;
}

.text-font{
  font-size : 3em;
  letter-spacing: 2px;
  border-bottom: 1px solid #eee;
}

.para-text{
  margin-top : 2em;
  font-size : 3em;
  letter-spacing: 2px;
}

@media only screen and (max-width : 767px){
  .rightpart{
    height : auto;
    width : 100%;
    margin-left: 0em;
    margin-top: 0em;
  }
}
</style>
<body>
<section id = "header">
  <nav class="navbar navbar-inverse">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>        
        <a class="navbar-brand" href="#">RAPID QUIZ</a>
      </div>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${studentName}</a></li>
    </ul>      
    </div>
  </nav>
</section>
<%
   String name = (String)session.getAttribute("studentName");
   if(name == null)
     response.sendRedirect("loginStudent");
%>
<section id = "main">
<div class = "container-fluid">
   <div class = "col-xs-12">
    <div class = "col-sm-3">
      <div class="collapse navbar-collapse" id="myNavbar">
         <div class = "navbar-default rightpart">
              <ul class="nav nav-pills nav-stacked" role="tablist">
                <li class="active"><a href="#"><span><i class="fas fa-tachometer-alt"></i></span>
                  DASHBOARD</a></li>
                <li><a href="iwt"><i class="fas fa-laptop-code"></i>
                IWT</a></li>
                <li><a href="cd"><i class="fas fa-desktop"></i>
                COMPILER DESIGN</a></li>
                <li><a href="cg"><span><i class="fas fa-desktop"></i></span>
                COMPUTER GRAPHICS</a></li>
                <li><a href="cloud"><span><i class="fas fa-cloud"></i></span>
                  CLOUD COMPUTING</a></li>
                <li><a href="st"><span><i class="fas fa-keyboard"></i></span>
                SOFTWARE TESTING</a></li>
                <li><a href="sa"><span><i class="fas fa-sitemap"></i></span>
                SOFTWARE ARCHITECTURE</a></li>
              </ul>
            </div>
          </div>
      </div>
      <div class = "col-sm-9">
        <div class = "mydash">
          <h3 class = "text-font">DASHBOARD</h3>
          <p class = "para-text">Welcome ${studentName} to your dashboard!!!</p>
        </div>
      </div>
   </div>
</div>
</section>
</body>
</html>
