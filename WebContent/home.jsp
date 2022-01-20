<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<jsp:include page="header.jsp"/>
  <head>
  
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Login</title>

  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <link rel="stylesheet" type="text/css" href="/Biblionet/style.css">
  
  
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        
 
<script> 
function validate()
{    var username = document.form.username.value;
	 var password = document.form.password.value;
     if (username==null || username=="")
     { alert("Username can't be blank"); 
     return false; }
     else if (password==null || password=="")
     { alert("Password can't be blank"); 
     return false; } } 
</script>
</head>
<body id="LoginForm">
<div class="container" >
<!-- <h1 class="form-heading">Biblionet</h1> -->
<div class="login-form">
<div  class="main-div">
    <div  class="panel">
   <h2>login</h2>
   <p>Please enter the correct informations</p>
   </div>
    <form id="Login" name="form" action="login" method="post" onsubmit="return validate()">
        <div class="form-group">
           <input class="form-control" type="text" name="username" placeholder="Username">
         </div>
        <div class="form-group">
            <input class="form-control" type="password" name="password" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
        <br><br>
        <button type="reset" class="btn btn-primary">Reset</button>
    </form>
    </div>
<!-- 
<p class="botto-text"> Designed by Sunil Rajput</p> -->
</div></div>


</body>
</html>
