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
			<a href="" class="btn btn-primary">Ajouter une chambre</a>
			<a href="" class="btn btn-danger">Ajouter un client</a>
			<a href="" class="btn btn-info">Reserver une chambre</a>
		  </div>
		  
		  <div class="col-4	text-right">
			<blockquote class="blockquote text-right">
				<button type="submit" class="btn btn-warning mb-3">Ali BS (Déconnexion)</button>
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
                <div class="card ">
                    <div class="card-header bg-success text-white"> Liste des Chambres </div>
                   
				    <form method="GET" action="AddCh">
                       
						
                        
                        <div class="form-group">
                            <label>Titre</label>
                           
                            <input name="titre" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Type</label>
                            <input name="type" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Prix</label>
                            <input name="prix" type="text" class="form-control">
                        </div>
                        <button type="submit" class="btn btn-info">Reserver</button>
                    </form>
                </div>

            </div>


        </div>

    </div>

</div>


</body>
</html>