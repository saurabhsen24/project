<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
  <title>Java Project</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">  
  <link href = "<c:url value = "/resources/css/style.css"/>"  rel = "stylesheet">
</head>
<body>
<section id = "header">
<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">RAPID QUIZ</a>
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-earphone fas"></span> 040-589589 </a></li>
      <li>
          <a href = "#"><span class="glyphicon glyphicon-align-justify"></span></a>
      </li>
	  <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

<div class = "container-fluid text-center">
<div class = "col-xs-12">
<div class = "mytext">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
        <h2 class = "h2">MAKING BEST FUTURE</h2>
        <p class = "p1">POPULAR EDUCATION</p>
		<p class = "p2">We Have The Perfect Accommodation For You.</p>
    </div>

    <div class="item">
        <h2 class = "h2">START LEARNING FOR </h2>
        <p class = "p1">SUCCESSFUL FUTURE</p>
		<p class = "p2">We Have The Perfect Accommodation For You.</p>
    </div>

    <div class="item">
        <h2 class = "h2">START LEARNING FOR </h2>
        <p class = "p1">SUCCESSFUL FUTURE</p>
		<p class = "p2">We Have The Perfect Accommodation For You.</p>
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>
</div>
</div>
</section>

<section id = "education">
<div class = "container">
<h2 class = "myhead text-center">OUR EDUCATION</h2>
<div class = "col-md-12">
    <div class = "col-md-4">
	   <div class = "category">
	       <h3>Quick Help</h3>
		   <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
	   </div>
	   <div class = "category">
	       <h3>Scholarship For Students</h3>
		   <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
	   </div>
	   <div class = "category">
	       <h3>Sports & Events</h3>
		   <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
	   </div>	   	   
	</div>
	
    <div class = "col-md-4">
	   <div class = "category">
	       <h3>In Your Country</h3>
		   <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
	   </div>
	   <div class = "category">
	       <h3>Sports & Events</h3>
		   <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
	   </div>
	   <div class = "category">
	       <h3>Quick Help</h3>
		   <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
	   </div>	   	   
	</div>	
	
	<div class = "col-md-4 text-white">
	   <div class = "registration">
	      <h4 class="text-center">Courses Search</h4>
		  <form>
             <div class="form-group">
                 <label for="sel-deg">Select Degree :</label>
                 <select class="form-control" id="sel1">
                     <option>Master's Degeree</option>
					 <option>Associate degree</option>
					 <option>Bachlor's Degree</option>
                     <option>GED</option>
                     <option>Docterate</option>
                 </select>
             </div>
             <div class="form-group">
                 <label for="sel-deg">Category :</label>
                 <select class="form-control" id="sel1">
                     <option>Master's Degeree</option>
					 <option>Associate degree</option>
					 <option>Bachlor's Degree</option>
                     <option>GED</option>
                     <option>Docterate</option>
                 </select>
             </div>
			 
             <div class="form-group">
                 <label for="sel-deg">Subject :</label>
                 <select class="form-control" id="sel1">
                     <option>Master's Degeree</option>
					 <option>Associate degree</option>
					 <option>Bachlor's Degree</option>
                     <option>GED</option>
                     <option>Docterate</option>
                 </select>
             </div>			 
             <button type="submit" class="btn btn-block mybtn">Search</button>
           </form>
	   </div>
	</div>
</div>
</section>

<section id = "slide-bg">
<div class = "container">
<div class = "col-xs-12">
  <div class = "col-xs-8">
   <div class = "mytext1 text-white">
      <h3 class = "h3">GET 100 OF ONLINE COURSES FOR FREE</h3>
      <h2>We Have 15 Years Experience In This Passion</h2>
	  <p class = "text-white">Aliquam ac est vel nisl condimentum interdum vel eget enim. Curabitur mattis orci sed leo mattis, nec maximus nibh faucibus. Mauris et justo vel nibh rhoncus venenatis. Nullal condimentum interdum vel eget enim. Curabitur mattis orci sed le.</p>
	  <button type = "submit" class = "btn btn-default mybtn">About</button>
   </div>
   </div>
</div>
</div>
</section>

<section id = "services">
<div class = "container text-center">
<h2 class = "header">services</h2>
  <div class = "col-md-12">
     <div class = "col-md-4">
	    <div class = "sec">
		   <i class="fa fa-book customize" aria-hidden="true"></i>
		   <h3>Best Education System</h3>
		   <p>Itaque earum rerum hic tenetur a sapiente delectus reiciendis maiores</p>
		</div>
	 </div>
     <div class = "col-md-4">
	    <div class = "sec">
		   <i class="fa fa-graduation-cap customize" aria-hidden="true"></i>
		   <h3>Learning Management</h3>
		   <p>Itaque earum rerum hic tenetur a sapiente delectus reiciendis maiores</p>
		</div>
	 </div>
     <div class = "col-md-4">
	    <div class = "sec">
		   <i class="fa fa-id-card customize" aria-hidden="true"></i>
		   <h3>Online Certification</h3>
		   <p>Itaque earum rerum hic tenetur a sapiente delectus reiciendis maiores</p>
		</div>
	 </div>
     <div class = "col-md-4">
	    <div class = "sec">
		   <i class="fa fa-book customize" aria-hidden="true"></i>
		   <h3>Best Education System</h3>
		   <p>Itaque earum rerum hic tenetur a sapiente delectus reiciendis maiores</p>
		</div>
	 </div>
     <div class = "col-md-4">
	    <div class = "sec">
		   <i class="fa fa-graduation-cap customize" aria-hidden="true"></i>
		   <h3>Learning Management</h3>
		   <p>Itaque earum rerum hic tenetur a sapiente delectus reiciendis maiores</p>
		</div>
	 </div>
     <div class = "col-md-4">
	    <div class = "sec">
		   <i class="fa fa-id-card customize" aria-hidden="true"></i>
		   <h3>Online Certification</h3>
		   <p>Itaque earum rerum hic tenetur a sapiente delectus reiciendis maiores</p>
		</div>
	 </div>	 
  </div>
</div>
</section>

<section id = "subscribe">
  <div class = "container text-center">
     <div class = "col-md-12">
	    <h4 class = "text-white sub-head">Subscribe Today For New Updates</h4>
		<div class = "myform">
		   <form class="form-horizontal">
		       <div class = "form-group">
			    <div class = "col-md-8">
			      <input type="email" class="form-control input-lg myinput" id="email" placeholder = "Enter your email">
				</div>
                <div class = "col-md-4">				
				    <button type = "submit" class = "btn btn-block mybtn-1">SUBSCRIBE</button>
				</div>	
			   </div>
		   </form>
        </div> 		
	 </div>
  </div>
</section>


<section id = "courses">
<div class = "container">
<h3 class = "text-center course-h3">POPULAR COURSES</h3>
  <div class = "col-md-12">
       <div class = "col-md-4">
	         <div class="panel panel-default">
                 <div class="panel-header">
				    <img src = "resources/image/g1.jpg" width = "100%" height = "100%">
				 </div>
                 <div class="panel-body">
                    <h5 class = "h5">Learn Photoshop</h5>
                     <p>This is a longer card with supporting text below as a natural lead-in to additional content.</p>					
				 </div>
             </div>
	   </div>
	   
       <div class = "col-md-4">
	         <div class="panel panel-default">
                 <div class="panel-header">
				    <img src = "resources/image/g2.jpg" width = "100%" height = "100%">
				 </div>
                 <div class="panel-body">
                    <h5 class = "h5">Learn HTML5</h5>
                     <p>This is a longer card with supporting text below as a natural lead-in to additional content.</p>					
				 </div>
             </div>
	   </div>
	  
       <div class = "col-md-4">
	         <div class="panel panel-default">
                 <div class="panel-header">
				    <img src = "resources/image/g3.jpg" width = "100%" height = "100%">
				 </div>
                 <div class="panel-body">
                    <h5 class = "h5">Learn Node.js.</h5>
                     <p>This is a longer card with supporting text below as a natural lead-in to additional content.</p>					
				 </div>
             </div>
	   </div>	   
  </div>
</div>
</section>

<section id = "footer">
   <div class = "container">
        <div class = "col-md-12">
		     <div class = "col-md-3">
			    <div class = "sub-sec">
				     <h6>About Us</h6>
					 <p class = "footer-text">Curabitur non nulla sit amet nislinit tempus convallis quis ac lectus. lac inia eget consectetur sed, convallis at tellus. Nulla porttitor accumsana tincidunt. Vestibulum ante ipsum primis tempus convallis.</p>
				</div>
			 </div>
		     <div class = "col-md-3">
			    <div class = "sub-sec">
				     <h6>Contact Info</h6>
					 <br/>
					 <h6>Location :</h6>
					 <p class = "footer-text">0926k 4th block building, king Avenue, New York City.</p>
					 <br/>
					 <h6>Phone :</h6>
					 <p class = "footer-text">Phone : +121 098 8907 9987</p>
					 <br/>
					 <p class = "footer-text">Email : info@example.com</p>
				</div>
			 </div>		
		     <div class = "col-md-3">
			    <div class = "sub-sec">
				     <h6>Useful Links</h6>
					 <ul class = "footer-text">
					    <li>Home</li>
					    <li>About</li>
					    <li>Typography</li>
					    <li>Gallery</li>
					    <li>Contact Us</li>
					 </ul>
				</div>
			 </div>			 
			 <div class = "col-md-3">
			    <h6 class = "h6">Latest News</h6>
				<img src = "resources/image/g1.jpg" class = "img-fluid myimg" width = "33%" height = "33%">
				<img src = "resources/image/g2.jpg" class = "img-fluid myimg" width = "33%" height = "33%">
				<img src = "resources/image/g3.jpg" class = "img-fluid myimg" width = "33%" height = "33%">
				<img src = "resources/image/g4.jpg" class = "img-fluid myimg" width = "33%" height = "33%">
				<img src = "resources/image/g5.jpg" class = "img-fluid myimg" width = "33%" height = "33%">
				<img src = "resources/image/g6.jpg" class = "img-fluid myimg" width = "33%" height = "33%">
			 </div>
		</div>
   </div>
</section>
</body>
</html>