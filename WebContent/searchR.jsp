<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

    <%@page import="java.sql.DriverManager" %>
    <%@page import="java.sql.ResultSet" %>
    <%@page import="java.sql.Statement" %>
    <%@page import="java.sql.Connection" %>
    <%@ page import="java.util.List" %>
    <%@page import="mvc.util.DBConnection" %>
    <%@page import="mvc.bean.UserAuthorBookBean" %>
    <%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<jsp:include page="header.jsp"/>
  <head>
  
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Result of the search</title>

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
<table class=" table table-bordred table-striped table-hover">
<thead>
<tr>
<th>Issn</th>
<th>Title</th>
<th>Abstract</th>
<th>Number of pages</th>
<th>Domain</th>
<th>Number of author</th>
<th>Last name of author</th>
<th>First name of author</th>
<th>Date of birth</th>
<!-- <th class="text-center">Action</th> -->
</tr>
</thead>
<tbody>
<c:forEach var="book" items="${booklist }"> 
<tr>
<td><c:out value="${book.issn }" /></td>
<td><c:out value="${book.title }" /></td>
<td><c:out value="${book.abstractB }" /></td>
<td><c:out value="${book.nbPages }" /></td>
<td><c:out value="${book.field }" /></td>
<td><c:out value="${book.num }" /></td>
<td><c:out value="${book.lastName }" /></td>
<td><c:out value="${book.firstName }" /></td>
<td><c:out value="${book.dob }" /></td>
</tr>
</c:forEach>
</tbody> 
</table> 
</body>
</html>