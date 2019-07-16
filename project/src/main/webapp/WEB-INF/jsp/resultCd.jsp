<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>
<%@ page import="com.project.service.*" %>
<%@ page import="com.project.model.Question" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Result</title>
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
  margin-top : 1em;
   font-size : 30px;
}

.floatRight{
    float : right;
}

.para-head{
   margin-top : 1em;
   font-size : 3em;
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
      <li><a href="#"><span class="glyphicon glyphicon-user"></span>  ${studentName}</a></li>
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
          <h3 class = "text-font">COMPILER DESIGN</h3>
          <c:set var = "cdAns" value = "${cdQues}"/>
          <p class = "para-head text-center text-primary">Marks Obtained :</p>
          <p class = "para-text text-center">
            <%
               Enumeration e = request.getParameterNames();
               Map<String,String> mapQueToAns = new LinkedHashMap<>();
               while(e.hasMoreElements()){
            	   Object obj = e.nextElement();
            	   String fieldName = (String)obj;
            	   String fieldValue = request.getParameter(fieldName);
            	   mapQueToAns.put(fieldName, fieldValue);
               }
               
               int marks = 0;
               List<Question> quesList = (List)pageContext.getAttribute("cdAns");
               for(Question que : quesList){
            	  // out.println(que.getQid()+"   "+que.getAns()+"--->"+mapQueToAns.get(que.getQid()+"")+"<br/>");
            	   if(mapQueToAns.get(que.getQid()+"") != null && que.getAns().equals(mapQueToAns.get(que.getQid()+"").trim())){
            		   marks++;
            	   }
               }
               
               out.println(marks);
            %>
            
            </p>
          <%int i = 1; %>  
          <c:forEach var = "q" items = "${cdQues}">
            <p class = "para-text text-danger">Que <% out.print(i);%>: ${q.que}</p>
            <p class = "para-text text-success">Ans <% out.print(i); i++;%>:${q.ans}</p>   
          </c:forEach>
          <% i = 1; %>             
        </div>
          <a href = "loginStudent" class = "btn btn-lg btn-danger" onclick = "clearSession()">Logout</a>       
         <a href = "#" class = "btn btn-lg btn-primary floatRight" onclick = "navigate()" >Back</a>              
      </div>
   </div>
</div>
</section>
<script>
    function clearSession(){
    	sessionStorage.clear();
    }

    function navigate(){
    	location.href = "/project";
    }    
</script>
</body>
</html>
