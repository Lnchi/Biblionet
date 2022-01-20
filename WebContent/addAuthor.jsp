<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<jsp:include page="adminHeader.jsp"/>
  <head>
  
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Add Author</title>

  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <link rel="stylesheet" type="text/css" href="/Biblionet/style.css">
  
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        
  
<script> //sélecteur de date          
$(function () {
                $("#datepicker").datepicker();
            });
</script>
<script> 
/*  La fonction ci-dessous s'exécute lors de l'envoi du formulaire 
 -un moyen de valider les données du formulaire 
 L'attribut requis invitera l'utilisateur à s'assurer que
 les champs ne sont pas vides */ 
 
function validate() // Stockage des valeurs de champ dans des variables
{    var num = document.form.num.value;
	 var lastName = document.form.lastName.value;
	 var firstName = document.form.firstName.value;
     var dob = document.form.dob.value; 
     
     if (num==null || num=="")
     { 
     alert("Number can't be blank"); 
     return false;}
      else if (lastName==null || lastName=="")
     { alert("Last name can't be blank"); 
     return false; }
     else if (firstName==null || firstName=="")
     { alert("First name can't be blank"); 
     return false;}
     else if (dob==null || dob=="")
     { alert("Date of birth can't be blank"); 
     return false;}
 } 
</script>
  </head>
<body id="LoginForm">

<div class="container">
<!-- <h1 class="form-heading">Author</h1> -->
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Add Author</h2>
   <p>Please enter the correct informations</p>
   </div>
    <form id="Login" name="form" action="Author" method="post" onsubmit="return validate()">
    <div class="form-group">
            <input class="form-control" type="text" name="num" placeholder="Number">
        </div>
        <div class="form-group">
            <input class="form-control" type="text" name="lastName" placeholder="Last name">
        </div>
        <div class="form-group">
            <input class="form-control" type="text" name="firstName" placeholder="First name">
        </div>
        <div class="form-group">
            <input class="form-control" type="text" name="dob" id="datepicker" placeholder="Date of birth">
        </div>
        <%=(request.getAttribute("messError") == null) ? ""
         : request.getAttribute("messError")%>
        <button type="submit" class="btn btn-primary">ADD</button>
        <br><br>
        <button type="reset" class="btn btn-primary">Reset</button>
    </form>
    </div>
<p class="botto-text"></p>
</div></div></div>
</body>
</html>
