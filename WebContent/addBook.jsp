<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<jsp:include page="adminHeader.jsp"/>
  <head>
  
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Add Book</title>

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
{    var issn = document.form.issn.value;
	 var title = document.form.title.value;
	 var abstractB = document.form.abstractB.value;
     var nbPages = document.form.nbPages.value; 
     var field = document.form.field.value; 
     var num = document.form.num.value; 
     
      if (issn==null || issn=="")
     { 
         alert("issn can't be blank"); 
         return false; }
     else if (title==null || title=="")
     { alert("Title can't be blank"); 
     return false; 
     }
     else if (abstractB==null || abstractB=="")
     {  alert("Abstract can't be blank"); 
     return false; 
     }
     else if (nbPages==null || nbPages=="")
     {  alert("Number of pages can't be blank"); 
     return false; 
     }
     else if (field==null || field=="")
     {  alert("Field can't be blank"); 
     return false; 
     }
      
     else if (num==null || num=="")
     {  alert("Number of author can't be blank"); 
     return false; 
     } } 
</script>
</head>
  
<body id="LoginForm">

<div class="container">
<!-- <h1 class="form-heading">Book</h1> -->
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Add Book</h2>
   <p>Please enter the correct informations</p>
   </div>
    <form id="Login" name="form" action="Book" method="post" onsubmit="return validate()">
    <div class="form-group">
            <input class="form-control" type="text" name="issn" placeholder="Issn">
        </div>
        <div class="form-group">
            <input class="form-control" type="text" name="title" placeholder="Title">
        </div>
        <div class="form-group">
            <input class="form-control" type="text" name="abstractB" placeholder="Abstract">
        </div>
        <div class="form-group">
            <input class="form-control" type="text" name="nbPages" placeholder="Number of pages">
        </div>
          <div class="form-group">
            <input class="form-control" type="text" name="field" placeholder="Field">
        </div>
        <div class="form-group">
            <input class="form-control" type="text" name="num" placeholder="Number of author">
        </div><%=(request.getAttribute("messSuccess") == null) ? ""
         : request.getAttribute("messSuccess")%>
        <%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%>
        <button type="submit" class="btn btn-primary">ADD</button>
        <br><br>
        <button type="reset" class="btn btn-primary">Reset</button>
    </form>
    </div>
</div></div></div>
</body>
</html>
