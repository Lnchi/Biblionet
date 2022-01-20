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
        aria-label="Toggle navigation"
      >
        <i class="fas fa-bars"></i>
      </button>
      <div class="collapse navbar-collapse" id="navbarExample01">
        <ul class="navbar-nav mr-auto mb-2 mb-lg-0">
        <li class="nav-item active">
            <a class="nav-link" aria-current="page" href="#"><% if (session !=null) { 
            	                                               if (session .getAttribute("username")!=null){
            	                                            	   String a= session.getAttribute("username").toString() ;     /* Récupérer l'objet depuis la session  */
            	                                            	   out.println(" Welcome " +a ) ;
            	                                               }else {out.println(" Welcome ") ;} } %></a> 
          </li>
          <li class="nav-item active">
            <a class="nav-link" aria-current="page" href="home.jsp">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="searchForm.jsp">Search</a>
          </li>
          <li class="nav-item">
          <%if (session !=null) { 
            if (session .getAttribute("username")!=null){%> 
            <a class="nav-link" href="logout">logout</a>
          <% }else {  %><a class="nav-link" href="home.jsp">login</a> <%} } %> 
          </li>
          <li class="nav-item">
            <a class="nav-link" href="adminServlet">Admin</a>
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
      /* background-image: url('https://mdbootstrap.com/img/new/slides/041.jpg'); */
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
        </div>
      </div>
    </div>
  </div>
  <!-- Background image -->
</header>