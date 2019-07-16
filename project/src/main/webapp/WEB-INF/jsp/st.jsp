<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>SOFTWARE TESTING QUESTION PAPER</title>
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
  height : 900px;
  margin-left: -4.5em;
  margin-top: -1.5em;
}

.text-font{
  font-size : 3em;
  letter-spacing: 2px;
  border-bottom: 1px solid #eee;
}

.para-text{
   font-size : 30px;
}

.options{
   margin-left : 8em; 
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
<body onload = "countdown(5)">
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
      <li><a href="#"><span class="glyphicon glyphicon-user"></span>${studentName}</a></li>
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
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#"><span><i class="fas fa-tachometer-alt"></i></span>
                  DASHBOARD</a></li>
                <li><a href="#"><i class="fas fa-laptop-code"></i>
                IWT</a></li>
                <li><a href="#"><i class="fas fa-desktop"></i>
                COMPILER DESIGN</a></li>
                <li><a href="#"><span><i class="fas fa-desktop"></i></span>
                COMPUTER GRAPHICS</a></li>
                <li><a href="#"><span><i class="fas fa-cloud"></i></span>
                  CLOUD COMPUTING</a></li>
                <li><a href="#"><span><i class="fas fa-keyboard"></i></span>
                SOFTWARE TESTING</a></li>
                <li><a href="#"><span><i class="fas fa-sitemap"></i></span>
                SOFTWARE ARCHITECTURE</a></li>
              </ul>
            </div>
          </div>
      </div>
      <div class = "col-sm-9">
        <div class = "mydash">
          <h3 class = "text-font">SOFTWARE TESTING</h3>
           <%! int i = 1; %>
          <div class = "text-center time_clock">Time Remaining :<span><p id = "counter"></p></span></div>
    
          <form  method = "get" action = "resultSt">
          <c:forEach var = "q" items = "${stQues}">
            <p class = "para-text">Que <% out.print(i); i++; %>: ${q.que}</p>
            <div class = "options">
                <div class="radio">
                    <label><input type="radio" name = "${q.qid}" value = "${q.opt1}">${q.opt1}</label>
                </div>
                <div class="radio">
                    <label><input type="radio" name = "${q.qid}" value = "${q.opt2}">${q.opt2}</label>
                </div>
                <div class="radio">
                    <label><input type="radio" name = "${q.qid}" value = "${q.opt3}">${q.opt3}</label>
                </div> 
                <div class="radio">
                    <label><input type="radio" name = "${q.qid}" value = "${q.opt4}">${q.opt4}</label>
                 </div>             
            </div>
          </c:forEach>
          <% i = 1; %>
            <button id = "mybtn" type = "submit" class = "btn btn-success">SUBMIT</button>
          </form>                   
        </div>
      </div>
   </div>
</div>
</section>
<script type="text/javascript">
var timeIntervalId;
 function countdown(n){
   var seconds = 60;
   var mins = n;
   timeIntervalId = setInterval(function(){
       seconds--;
       var minutes = mins-1;
       var counter = document.getElementById('counter');
       counter.innerHTML = (seconds >= 1 && seconds <=9)?(mins.toString()+":0"+seconds.toString()):(mins.toString()+":"+String(seconds));
       if(seconds == 0 && mins > -1){
           seconds = 60;
           mins--;
           if(mins < 0){
             clearInterval(timeIntervalId);            
           }else{
        	   location.href = "/project/resultSt";
           }
       }
   },1000);
 }
 
</script>
</body>
</html>
