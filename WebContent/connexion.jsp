<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap4/css/bootstrap.min.css"  rel="stylesheet" >
</head>
<body>

   <div class="container-fluid ">
   <br><br><br>
    <div class="row mt-2">
      <div class="offset-4 col-4 bg-light border border-primary">
        <h1 style="text-align:center">Hotel@MyDEN</h1>
		<h3 style="text-align:center">Connexion</h3>
        <form action="Verif" method="post">
              
          	   <div class="form-group">
                <input type="text" class="form-control"  id="username" name="login" value="" placeholder="Username" required="required" />
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
          	  </div>
            	<div class="form-group">
                	<input type="password" class="form-control" id="password" name="password" placeholder="Password" required="required" />
                	<span class="glyphicon glyphicon-lock form-control-feedback"></span>
            	</div>
              
             <div class="form-row">
               <div class="col">
                 <input type="submit" class="btn btn-primary btn-block mb-1" id="_submit" name="_submit" value="Log in" />
               </div>
              
            </div>
        </form>
        
        <c:if test="${ sessionScope.erreur != null }">
	        <div class="alert alert-${sessionScope.type}">
	           ${sessionScope.erreur }
	        </div>
        
        </c:if>
        
      </div>
      
    </div>
  </div>

</body>
</html>