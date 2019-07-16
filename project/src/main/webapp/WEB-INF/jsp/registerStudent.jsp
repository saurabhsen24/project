<!DOCTYPE html>
<html lang="en">
<head>
  <title>Register Form For Student</title>
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
hr{
   border-top : 1px solid #000;
}

.register-form{
  margin-top: 6em;
}

body{
  background-color: #17a2b8;
}
</style>
<body>
<div class = "container">
<div class = "register-form">
<form class="well form-horizontal" action = "register" method = "post">
  <h1 class = "text-center">Registration Form</h1><hr/>
  <div class="form-group">
  <label class="col-md-4 control-label">USN</label>
  <div class="col-md-4">
  <div class="input-group">
  <span class="input-group-addon">USN</span>
  <input  name="usn" placeholder="Enter Usn" class="form-control"  type="text">
  </div>
  </div>
  </div>  
  <div class="form-group">
  <label class="col-md-4 control-label">Name</label>
  <div class="col-md-4">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="name" placeholder="Enter Name" class="form-control"  type="text">
  </div>
  </div>
  </div>
  <div class="form-group">
  <label class="col-md-4 control-label">Username</label>
  <div class="col-md-4">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="username" placeholder="Enter Name" class="form-control"  type="text">
  </div>
  </div>
  </div>
 
  <div class="form-group">
  <label class="col-md-4 control-label">Password</label>
  <div class="col-md-4">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
  <input  name="password" placeholder="Enter password" class="form-control"  type="password">
  </div>
  </div>
  </div>

  <div class="form-group">
  <label class="col-md-4 control-label">SEM</label>
  <div class="col-md-4">
  <div class="input-group">
  <span class="input-group-addon">SEM</span>
  <input  name="sem" placeholder="Enter SEM" class="form-control"  type="text">
  </div>
  </div>
  </div>
  <div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4"><br>
      <button class="btn btn-warning">SUBMIT<span class="glyphicon glyphicon-send"></span></button>
  </div>
  </div>
</form>
</div>
</div>
</div>
</body>
</html>
