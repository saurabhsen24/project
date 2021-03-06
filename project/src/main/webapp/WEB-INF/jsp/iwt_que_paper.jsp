<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
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

.floatRight{
  float : right;
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
<%
   String name = (String)session.getAttribute("teacherName");
   if(name == null || name == "")
     response.sendRedirect("loginTeacher");
%>
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
      <li><a href="#"><span class="glyphicon glyphicon-user"></span><%=name %></a></li>
    </ul>      
    </div>
  </nav>
</section>

<section id = "main">
<div class = "container-fluid">
   <div class = "col-xs-12">
    <div class = "col-sm-3">
      <div class="collapse navbar-collapse" id="myNavbar">
         <div class = "navbar-default rightpart">
              <ul class="nav nav-pills nav-stacked" role="tablist">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="dashboardTeacher"><span><i class="fas fa-tachometer-alt"></i></span>
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
        <h1 class = "text-center">Prepare Questions for IWT</h1>
        <hr/>
        <form action = "iwt_que_paper" method = "post">
          <div class="form-group">
            <label for = "que">Enter Question:</label>
            <textarea class="form-control" rows="5" id="que" name = "que" required="required"></textarea>
          </div>
          
          <div class="form-group">
            <label for = "opt1">Option 1</label>
            <input type="text" class="form-control" id="opt1" placeholder="Enter option" name = "opt1" required="required">
          </div>

          <div class="form-group">
            <label for = "opt2">Option 2</label>
            <input type="text" class="form-control" id="opt2" placeholder="Enter option" name = "opt2" required="required">
          </div>

          <div class="form-group">
            <label for = "opt3">Option 3</label>
            <input type="text" class="form-control" id="opt3" placeholder="Enter option" name = "opt3" required="required">
          </div>

          <div class="form-group">
            <label for = "opt4">Option 4</label>
            <input type="text" class="form-control" id="opt4" placeholder="Enter option" name = "opt4" required="required">
          </div>          
          
          <div class="form-group">
            <label for = "ans">Enter the Answer :</label>
            <input type="text" class="form-control" id="ans" placeholder="Enter Answer" name = "ans" required="required">
          </div>         
           
          <button class = "btn btn-success" id = "mybtn">Submit</button>
          <a href = "showQueIwt" class = "btn btn-primary floatRight">Show Questions</a>
          <!--div id = "que_add"><i class="fas fa-check-circle"></i>Question added Successfully!!!</div-->
        </form>

      </div>
   </div>
</div>
</section>
<script>
$(document).ready(function(){
	  $('#mybtn').click(function(){
         var a = confirm("Do you want to add this questions???");
         if(a){
        	 alert("Question added Successfully!!!");
         }else{
        	 alert("Question is not added!!!");
         }
         
         return a;
	  });
	});
</script>
</body>
</html>
