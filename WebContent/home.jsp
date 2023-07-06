<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link href="bootstrap4/css/bootstrap.min.css"  rel="stylesheet" >
    <script type="text/javascript" src="bootstrap4/js/jquery.min.js" ></script>
    <script type="text/javascript" src="bootstrap4/js/bootstrap.min.js" ></script>
    <link href="fontawesome/css/all.css" rel="stylesheet">

</head>
<body>
<div class="container">

    <div class="row" style="margin-top:10px;">
        <div class="col-12">
            <div class="card bg-primary text-white">
                <div class="card-header">
                    <h1>Hotel IB2J</h1><br/>
                </div>
            </div>
        </div>
    </div>
	
	<div class="row" style="margin-top:10px;">		
		  <div class="col-8">
			<a href="ChargeAddChambre" class="btn btn-primary">Ajouter une chambre</a>
			<a href="" class="btn btn-danger">Ajouter un client</a>
			<a href="" class="btn btn-info">Reserver une chambre</a>
		  </div>
		  
		  <div class="col-4	text-right">
			<blockquote class="blockquote text-right">
				<a href="Dec" class="btn btn-warning mb-3">salem ${sessionScope.user.username} (Déconnexion)</a>
			</blockquote>
		  </div>		  
    </div>
    <div class="row" style="margin-top:0px;">
        <div class="col-3">
            <div class="list-group">
				<a href="#" class="list-group-item list-group-item-action active">
                    <span class="fa fa-th-large"></span>
                   Tous les Chambres                    
                </a>
                <a href="#" class="list-group-item list-group-item-action ">
                    <span class="fa fa-th-large"></span>
                   Tous les Clients
                </a>
                <a href="#" class="list-group-item list-group-item-action">
                    <span class="fa fa-th-large"></span>
                    Les Réservations
                </a>
                
            </div>
        </div>

        <div class="col-9">     
            <div class="col">
                <div class="card text-white">
                    <div class="card-header bg-success"> Liste des Chambres </div>
                    <table class="table table-hover">
                        <thead class="thead-light">
                          <tr><th>ID</th> <th>Titre</th><th>Type</th> <th>ACTION</th></tr>
                        </thead>
                        
                        <tbody>
                       <c:forEach items="${listech}" var="ch">
                       
                            <tr>
                                <td>${ch.id}</td>				
								<td>${ch.titre}</td>
                                <td>${ch.type}</td>   
                                <td>${ch.prix}</td>   
								<td><a href="" class="btn btn-danger">DELETE</a> </td>								
                            </tr>
							
                       </c:forEach>
                     
                     
                        </tbody>

                    </table>

                </div>

            </div>


        </div>

    </div>

</div>


</body>
</html>