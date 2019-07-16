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
    text-transform : uppercase;
    word-spacing : 5px;
    letter-spacing : 3px;
    margin-bottom : 1em;
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
      <h1 class = "text-center">Login Form For Student</h1>
  <form class="form-horizontal" action="checkInfo" method = "post">
    <div class="form-group">
      <label class="control-label col-sm-4" for="username">Username:</label>
      <div class="col-sm-5">
        <input type="text" class="form-control" id="username" placeholder="Enter Username" name="username">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-4" for="pwd">Password:</label>
      <div class="col-sm-5">
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
      </div>
    </div>
    <div class="form-group">
    <div class="col-xs-12 text-center">
     <div class="col-xs-6">
       <div class="col-sm-offset-6 col-sm-6">
          <button type = "sunmit" class="btn btn-default">Login</button>
       </div>
     </div>
     <div class="col-xs-6">
       <div class="col-sm-offset-2 col-sm-6">
          <a href="registerStudent" type="submit" class="btn btn-default">Register</a>
       </div>
     </div>
  </form>
</div>
</div>
</section>
</body>
</html>
