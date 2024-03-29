<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<header>
  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-light bg-white">
    <div class="container-fluid">
      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarExample01"
        aria-controls="navbarExample01"
        aria-expanded="false"
        aria-label="Toggle navigation">
        <i class="fas fa-bars"></i>
      </button>
      <div class="collapse navbar-collapse" id="navbarExample01">
        <ul class="navbar-nav mr-auto mb-2 mb-lg-0">
        <li class="nav-item active">
            <a class="nav-link" aria-current="page" href="#"><% if (session !=null) { 
            	                                               if (session .getAttribute("username")!=null){
            	                                            	   String a= session.getAttribute("username").toString() ;     /* R�cup�rer l'objet depuis la session  */
            	                                            	   out.println(" Welcome " +a ) ;
            	                                               }else {response.sendRedirect("home.jsp");} } %></a> 
          </li>
          <li class="nav-item active">
            <a class="nav-link" aria-current="page" href="home.jsp">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="searchForm.jsp">Search</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="logout">Logout</a>
          </li>
         
        </ul>
      </div>
    </div>
  </nav>
  <!-- Navbar -->

  <!-- Background image -->
  <div
    class="p-4 text-center bg-image"
    style="
      
         background-image: url('https://image.freepik.com/free-photo/blurred-bookshelf-many-old-books-book-shop-library_36051-477.jpg'); 
      height: 340px;
    "
  >
    <div class="mask" style="background-color: rgba(0, 0, 0, 0.6);">
      <div class="d-flex justify-content-center align-items-center h-100">
        <div class="text-white">
          <h1 class="mb-3">BIBLIONET</h1>
          <h4 class="mb-3"></h4>
          <a class="btn btn-outline-light btn-lg" href="searchForm.jsp" role="button">Search</a>
          <a class="btn btn-outline-light btn-lg" href="addBook.jsp" role="button">Add book</a>
          <a class="btn btn-outline-light btn-lg" href="addAuthor.jsp" role="button">Add Author</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Background image -->
</header>
  <head>
  
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Admin home</title>

  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <link rel="stylesheet" type="text/css" href="/Biblionet/style.css">
  
  
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 </head>
  
  
<body id="LoginForm">
</body>
</html>



