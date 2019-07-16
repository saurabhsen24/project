<!DOCTYPE html>
<html lang="en">
<head>
  <title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv='cache-control' content='no-cache'>
  <meta http-equiv='expires' content='0'>
  <meta http-equiv='pragma' content='no-cache'>   
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<style media="screen">
  #login{
    width : 100%;
    height : 900px;
    background-color : #17a2b8;
  }

  h1{
     margin-bottom : 1em;
     text-transform: uppercase;
  }

  .myform{
    border: 1px solid #9C9C9C;
    background-color: #EAEAEA;
    padding-top : 1em;
    margin-top : 13em;
    border-radius : 10px;
  }

  .floatLeft{
     float : left;
  }

</style>
<body>
<section id = "login">
<div class="container">
  <div class = "myform">
      <h1 class = "text-center">Login</h1>
  <form class="form-horizontal" action=" ">

    <div class="form-group">
    <div class="col-xs-12 text-center">
     <div class="col-xs-6">
       <div class="col-sm-offset-6 col-sm-6">
          <a href = "loginTeacher" class="btn btn-lg btn-danger">Login for Teacher</a>
       </div>
     </div>
     <div class="col-xs-6">
       <div class="col-sm-offset-2 col-sm-6">
          <a href = "loginStudent" class="btn btn-lg btn-success">Login for Student</a>
       </div>
     </div>
  </form>
</div>
</div>
</div>
</section>
</body>
</html>
